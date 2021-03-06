package com.test.erp.client.shiro.session;

import com.test.erp.client.util.SerializableUtil;
import com.test.common.util.RedisUtil;
import com.test.erp.common.constant.ErpConstant;
import org.apache.commons.lang.ObjectUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.ValidatingSession;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

import java.io.Serializable;
import java.util.*;

/**
 * 基于redis的sessionDao，缓存共享session
 * Created by shuzheng on 2017/2/23.
 */
public class ErpSessionDao extends CachingSessionDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErpSessionDao.class);
    // 会话key
    private final static String TEST_ERP_SHIRO_SESSION_ID = "test-erp-shiro-session-id";
    // 全局会话key
    private final static String TEST_ERP_SERVER_SESSION_ID = "test-erp-server-session-id";
    // 全局会话列表key
    private final static String TEST_ERP_SERVER_SESSION_IDS = "test-erp-server-session-ids";
    // code key
    private final static String TEST_ERP_SERVER_CODE = "test-erp-server-code";
    // 局部会话key
    private final static String TEST_ERP_CLIENT_SESSION_ID = "test-erp-client-session-id";
    // 单点同一个code所有局部会话key
    private final static String TEST_ERP_CLIENT_SESSION_IDS = "test-erp-client-session-ids";

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        assignSessionId(session, sessionId);
        RedisUtil.set(TEST_ERP_SHIRO_SESSION_ID + "_" + sessionId, SerializableUtil.serialize(session), (int) session.getTimeout() / 1000);
        LOGGER.debug("doCreate >>>>> sessionId={}", sessionId);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        String session = RedisUtil.get(TEST_ERP_SHIRO_SESSION_ID + "_" + sessionId);
        LOGGER.debug("doReadSession >>>>> sessionId={}", sessionId);
        return SerializableUtil.deserialize(session);
    }

    @Override
    protected void doUpdate(Session session) {
        // 如果会话过期/停止 没必要再更新了
        if(session instanceof ValidatingSession && !((ValidatingSession)session).isValid()) {
            return;
        }
        // 更新session的最后一次访问时间
        ErpSession erpSession = (ErpSession) session;
        ErpSession cacheErpSession = (ErpSession) doReadSession(session.getId());
        if (null != cacheErpSession) {
            erpSession.setStatus(cacheErpSession.getStatus());
            erpSession.setAttribute("FORCE_LOGOUT", cacheErpSession.getAttribute("FORCE_LOGOUT"));
        }
        RedisUtil.set(TEST_ERP_SHIRO_SESSION_ID + "_" + session.getId(), SerializableUtil.serialize(session), (int) session.getTimeout() / 1000);
        // 更新TEST_AGENT_SERVER_SESSION_ID、TEST_AGENT_SERVER_CODE过期时间 TODO
        LOGGER.debug("doUpdate >>>>> sessionId={}", session.getId());
    }

    @Override
    protected void doDelete(Session session) {
        String sessionId = session.getId().toString();
        String upmsType = ObjectUtils.toString(session.getAttribute(ErpConstant.ERP_TYPE));
        if ("client".equals(upmsType)) {
            // 删除局部会话和同一code注册的局部会话
            String code = RedisUtil.get(TEST_ERP_CLIENT_SESSION_ID + "_" + sessionId);
            Jedis jedis = RedisUtil.getJedis();
            jedis.del(TEST_ERP_CLIENT_SESSION_ID + "_" + sessionId);
            jedis.srem(TEST_ERP_CLIENT_SESSION_ID + "_" + code, sessionId);
            jedis.close();
        }
        if ("server".equals(upmsType)) {
            // 当前全局会话code
            String code = RedisUtil.get(TEST_ERP_SERVER_SESSION_ID + "_" + sessionId);
            // 清除全局会话
            RedisUtil.remove(TEST_ERP_SERVER_SESSION_ID + "_" + sessionId);
            // 清除code校验值
            RedisUtil.remove(TEST_ERP_SERVER_CODE + "_" + code);
            // 清除所有局部会话
            Jedis jedis = RedisUtil.getJedis();
            Set<String> clientSessionIds = jedis.smembers(TEST_ERP_CLIENT_SESSION_IDS + "_" + code);
            for (String clientSessionId : clientSessionIds) {
                jedis.del(TEST_ERP_CLIENT_SESSION_ID + "_" + clientSessionId);
                jedis.srem(TEST_ERP_CLIENT_SESSION_IDS + "_" + code, clientSessionId);
            }
            LOGGER.debug("当前code={}，对应的注册系统个数：{}个", code, jedis.scard(TEST_ERP_CLIENT_SESSION_IDS + "_" + code));
            jedis.close();
            // 维护会话id列表，提供会话分页管理
            RedisUtil.lrem(TEST_ERP_SERVER_SESSION_IDS, 1, sessionId);
        }
        // 删除session
        RedisUtil.remove(TEST_ERP_SHIRO_SESSION_ID + "_" + sessionId);
        LOGGER.debug("doUpdate >>>>> sessionId={}", sessionId);
    }

    /**
     * 获取会话列表
     * @param offset
     * @param limit
     * @return
     */
    public Map getActiveSessions(int offset, int limit) {
        Map sessions = new HashMap();
        Jedis jedis = RedisUtil.getJedis();
        // 获取在线会话总数
        long total = jedis.llen(TEST_ERP_SERVER_SESSION_IDS);
        // 获取当前页会话详情
        List<String> ids = jedis.lrange(TEST_ERP_SERVER_SESSION_IDS, offset, (offset + limit - 1));
        List<Session> rows = new ArrayList<>();
        for (String id : ids) {
            String session = RedisUtil.get(TEST_ERP_SHIRO_SESSION_ID + "_" + id);
            // 过滤redis过期session
            if (null == session) {
                RedisUtil.lrem(TEST_ERP_SERVER_SESSION_IDS, 1, id);
                total = total - 1;
                continue;
            }
             rows.add(SerializableUtil.deserialize(session));
        }
        jedis.close();
        sessions.put("total", total);
        sessions.put("rows", rows);
        return sessions;
    }

    /**
     * 强制退出
     * @param ids
     * @return
     */
    public int forceout(String ids) {
        String[] sessionIds = ids.split(",");
        for (String sessionId : sessionIds) {
            // 会话增加强制退出属性标识，当此会话访问系统时，判断有该标识，则退出登录
            String session = RedisUtil.get(TEST_ERP_SHIRO_SESSION_ID + "_" + sessionId);
            ErpSession erpSession = (ErpSession) SerializableUtil.deserialize(session);
            erpSession.setStatus(ErpSession.OnlineStatus.force_logout);
            erpSession.setAttribute("FORCE_LOGOUT", "FORCE_LOGOUT");
            RedisUtil.set(TEST_ERP_SHIRO_SESSION_ID + "_" + sessionId, SerializableUtil.serialize(erpSession), (int) erpSession.getTimeout() / 1000);
        }
        return sessionIds.length;
    }

    /**
     * 更改在线状态
     *
     * @param sessionId
     * @param onlineStatus
     */
    public void updateStatus(Serializable sessionId, ErpSession.OnlineStatus onlineStatus) {
        ErpSession session = (ErpSession) doReadSession(sessionId);
        if (null == session) {
            return;
        }
        session.setStatus(onlineStatus);
        RedisUtil.set(TEST_ERP_SHIRO_SESSION_ID + "_" + session.getId(), SerializableUtil.serialize(session), (int) session.getTimeout() / 1000);
    }

}

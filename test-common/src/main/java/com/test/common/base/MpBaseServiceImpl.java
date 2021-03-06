package com.test.common.base;

/**
 * @Author:zxf
 * @Description
 * @Date: 2019/02/08 16:24
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.SqlHelper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.toolkit.*;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.toolkit.MapUtils;
import com.baomidou.mybatisplus.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.baomidou.mybatisplus.toolkit.TableInfoHelper;


public class MpBaseServiceImpl<M extends BaseMapper<T>, T> implements IService<T> {
    private static final Log logger = LogFactory.getLog(com.baomidou.mybatisplus.service.impl.ServiceImpl.class);
    @Autowired
    protected M baseMapper;

    public MpBaseServiceImpl() {
    }

    protected Class<T> currentModleClass() {
        return ReflectionKit.getSuperClassGenricType(this.getClass(), 1);
    }

    protected SqlSession sqlSessionBatch() {
        return SqlHelper.sqlSessionBatch(this.currentModleClass());
    }

    protected static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    public boolean insertOrUpdate(T entity) {
        if (null != entity) {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            if (null != tableInfo && StringUtils.isNotEmpty(tableInfo.getKeyProperty())) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
                if (StringUtils.checkValNull(idVal)) {
                    return this.insert(entity);
                } else {
                    boolean rlt = this.updateById(entity);
                    return !rlt ? this.insert(entity) : rlt;
                }
            } else {
                throw new MybatisPlusException("Error:  Can not execute. Could not find @TableId.");
            }
        } else {
            return false;
        }
    }

    public boolean insert(T entity) {
        return retBool(this.baseMapper.insert(entity));
    }

    public boolean insertBatch(List<T> entityList) {
        return this.insertBatch(entityList, 30);
    }

    public boolean insertOrUpdateBatch(List<T> entityList) {
        return this.insertOrUpdateBatch(entityList, 30);
    }

    public boolean insertOrUpdateBatch(List<T> entityList, int batchSize) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new IllegalArgumentException("Error: entityList must not be empty");
        } else {
            try {
                SqlSession batchSqlSession = this.sqlSessionBatch();
                int size = entityList.size();

                for(int i = 0; i < size; ++i) {
                    this.insertOrUpdate(entityList.get(i));
                    if (i % batchSize == 0) {
                        batchSqlSession.flushStatements();
                    }
                }

                batchSqlSession.flushStatements();
                return true;
            } catch (Exception var6) {
                logger.warn("Error: Cannot execute insertOrUpdateBatch Method. Cause:" + var6);
                return false;
            }
        }
    }

    public boolean insertBatch(List<T> entityList, int batchSize) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new IllegalArgumentException("Error: entityList must not be empty");
        } else {
            SqlSession batchSqlSession = this.sqlSessionBatch();

            try {
                int size = entityList.size();

                for(int i = 0; i < size; ++i) {
                    this.baseMapper.insert(entityList.get(i));
                    if (i % batchSize == 0) {
                        batchSqlSession.flushStatements();
                    }
                }

                batchSqlSession.flushStatements();
                return true;
            } catch (Exception var6) {
                logger.warn("Error: Cannot execute insertBatch Method. Cause:" + var6);
                return false;
            }
        }
    }

    public boolean deleteById(Serializable id) {
        return retBool(this.baseMapper.deleteById(id));
    }

    public boolean deleteByMap(Map<String, Object> columnMap) {
        if (MapUtils.isEmpty(columnMap)) {
            throw new MybatisPlusException("deleteByMap columnMap is empty.");
        } else {
            return retBool(this.baseMapper.deleteByMap(columnMap));
        }
    }

    public boolean delete(Wrapper<T> wrapper) {
        return retBool(this.baseMapper.delete(wrapper));
    }

    public boolean deleteBatchIds(List<? extends Serializable> idList) {
        return retBool(this.baseMapper.deleteBatchIds(idList));
    }

    public boolean updateById(T entity) {
        return retBool(this.baseMapper.updateById(entity));
    }

    public boolean update(T entity, Wrapper<T> wrapper) {
        return retBool(this.baseMapper.update(entity, wrapper));
    }

    public boolean updateBatchById(List<T> entityList) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new IllegalArgumentException("Error: entityList must not be empty");
        } else {
            SqlSession batchSqlSession = this.sqlSessionBatch();

            try {
                int size = entityList.size();

                for(int i = 0; i < size; ++i) {
                    this.baseMapper.updateById(entityList.get(i));
                    if (i % 30 == 0) {
                        batchSqlSession.flushStatements();
                    }
                }

                batchSqlSession.flushStatements();
                return true;
            } catch (Exception var5) {
                logger.warn("Error: Cannot execute insertBatch Method. Cause:" + var5);
                return false;
            }
        }
    }

    public T selectById(Serializable id) {
        return this.baseMapper.selectById(id);
    }

    public List<T> selectBatchIds(List<? extends Serializable> idList) {
        return this.baseMapper.selectBatchIds(idList);
    }

    public List<T> selectByMap(Map<String, Object> columnMap) {
        return this.baseMapper.selectByMap(columnMap);
    }

    public T selectOne(Wrapper<T> wrapper) {
        return SqlHelper.getObject(this.baseMapper.selectList(wrapper));
    }

    public Map<String, Object> selectMap(Wrapper<T> wrapper) {
        return (Map)SqlHelper.getObject(this.baseMapper.selectMaps(wrapper));
    }

    public Object selectObj(Wrapper<T> wrapper) {
        return SqlHelper.getObject(this.baseMapper.selectObjs(wrapper));
    }

    public int selectCount(Wrapper<T> wrapper) {
        return SqlHelper.retCount(this.baseMapper.selectCount(wrapper));
    }

    public List<T> selectList(Wrapper<T> wrapper) {
        return this.baseMapper.selectList(wrapper);
    }

    public Page<T> selectPage(Page<T> page) {
        page.setRecords(this.baseMapper.selectPage(page, (Wrapper)null));
        return page;
    }

    public List<Map<String, Object>> selectMaps(Wrapper<T> wrapper) {
        return this.baseMapper.selectMaps(wrapper);
    }

    public List<Object> selectObjs(Wrapper<T> wrapper) {
        return this.baseMapper.selectObjs(wrapper);
    }

    public Page<Map<String, Object>> selectMapsPage(Page page, Wrapper<T> wrapper) {
        if (null != wrapper) {
            wrapper.orderBy(page.getOrderByField(), page.isAsc());
        }

        page.setRecords(this.baseMapper.selectMapsPage(page, wrapper));
        return page;
    }

    public Page<T> selectPage(Page<T> page, Wrapper<T> wrapper) {
        if (null != wrapper) {
            wrapper.orderBy(page.getOrderByField(), page.isAsc());
        }

        page.setRecords(this.baseMapper.selectPage(page, wrapper));
        return page;
    }
}

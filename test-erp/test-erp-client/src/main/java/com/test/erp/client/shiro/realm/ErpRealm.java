package com.test.erp.client.shiro.realm;

import com.test.common.util.PropertiesFileUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户认证和授权
 * Created by test on 2017/1/20.
 */
public class ErpRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(ErpRealm.class);

    /*@Autowired
    private UpmsUserService upmsUserService;*/


    /**
     * 授权：验证权限时调用
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return simpleAuthorizationInfo;
    }

    /**
     * 认证：登录时调用
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        // client无密认证
        String erpType = PropertiesFileUtil.getInstance("test-erp-client").get("test.erp.type");
        String pwdConstant= PropertiesFileUtil.getInstance("test-erp-client").get("test.reg.pwd.constant");
        if ("client".equals(erpType)) {
            return new SimpleAuthenticationInfo(username, password, getName());
        }

        /*UpmsUserExample example=new  UpmsUserExample();
        UpmsUserExample.Criteria critera = example.createCriteria();
        critera.andUserUsernameEqualTo(username);
        //critera.andUserStatusEqualTo(10);//用户状态为正常
        List<UpmsUser> userList = upmsUserService.selectByExample(example);*/


       /* if (userList.size()==0) {
            throw new UnknownAccountException();
        }
        if (!userList.get(0).getUserPassword().equals(MD5Util.md5(pwdConstant+password ))) {
            throw new IncorrectCredentialsException();
        }
        if (userList.get(0).getUserStatus() != 10) {
            throw new LockedAccountException();
        }*/

        return new SimpleAuthenticationInfo(username, password, getName());
    }

}

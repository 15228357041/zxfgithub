package com.test.erp.server.interceptor;

import com.test.common.util.PropertiesFileUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 登录信息拦截器
 * Created by shuzheng on 2017/2/11.
 */
public class ErpInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErpInterceptor.class);
    private static final String ERP_OSS_ALIYUN_OSS_POLICY = PropertiesFileUtil.getInstance("test-oss-client").get("test.oss.aliyun.oss.policy");
    private static String OSS_LOGIN_URI = PropertiesFileUtil.getInstance("test-erp-client").get("test.erp.sso.server.url");


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("ERP_OSS_ALIYUN_OSS_POLICY", ERP_OSS_ALIYUN_OSS_POLICY);
        // 过滤ajax
        if (null != request.getHeader("X-Requested-With") && "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
            return true;
        }

        // 登录信息
        String sessionid = request.getSession().getId() == null ? null : request.getSession().getId().toString();
        if(StringUtils.isBlank(sessionid)){
            String curUrl = request.getRequestURL().toString();
            if(request.getQueryString()!=null){
                curUrl += "?"+request.getQueryString();
            }
            curUrl = OSS_LOGIN_URI +"?backurl="+curUrl;
            response.sendRedirect(curUrl);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }

}

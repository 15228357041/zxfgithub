package com.test.erp.server.listener;


import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @description 项目启动后初始化执行本监听器
 * @author yehao
 * @date 2018/4/12 14:09
 **/
public class MyServletContextListener implements ServletContextListener {
    private static final Logger logger= Logger.getLogger(MyServletContextListener.class);



    public void contextInitialized(ServletContextEvent arg0) {
       /* logger.info("开始加载系统常量---------------------------");
        ServletContext servlet_context=arg0.getServletContext();
        String contextPath=servlet_context.getContextPath();
        if(StringUtil.isNotEmpty(contextPath) && contextPath.equals("/")){
            contextPath="";
        }
        servlet_context.setAttribute("contextPath",contextPath);
        logger.info("contextPath:"+contextPath);*/
    }


    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}






























































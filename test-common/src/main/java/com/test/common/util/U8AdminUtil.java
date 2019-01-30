package com.test.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压u8Admin-x.x.x.jar到resources目录
 * Created by shuu8 on 2016/12/18.
 */
public class U8AdminUtil implements InitializingBean, ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(U8AdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        LOGGER.info("===== 开始解压u8-admin =====");
        String version = PropertiesFileUtil.getInstance("u8-admin-client").get("u8.admin.version");
        LOGGER.info("u8-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/u8-admin-" + version + ".jar");
        LOGGER.info("u8-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/u8-admin";
        LOGGER.info("u8-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        LOGGER.info("===== 解压u8-admin完成 =====");
    }

}

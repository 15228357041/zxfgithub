package com.test.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压testAdmin-x.x.x.jar到resources目录
 * Created by shutest on 2016/12/18.
 */
public class TestAdminUtil implements InitializingBean, ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        LOGGER.info("===== 开始解压test-admin =====");
        String version = PropertiesFileUtil.getInstance("test-admin-client").get("test.admin.version");
        LOGGER.info("test-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/test-admin-" + version + ".jar");
        LOGGER.info("test-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/test-admin";
        LOGGER.info("test-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        LOGGER.info("===== 解压test-admin完成 =====");
    }

}

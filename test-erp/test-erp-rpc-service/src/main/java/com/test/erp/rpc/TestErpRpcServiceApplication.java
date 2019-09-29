package com.test.erp.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by test on 2017/2/3.
 */
public class TestErpRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestErpRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> test-erp-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		LOGGER.info(">>>>> test-erp-rpc-service  启动完成 <<<<<");
	}

}

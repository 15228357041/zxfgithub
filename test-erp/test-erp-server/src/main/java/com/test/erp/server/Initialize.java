package com.test.erp.server;

import com.test.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 系统接口
 * Created by ZhangShuzheng on 2017/6/13.
 */
public class Initialize implements BaseInterface {

	private static final Logger LOGGER = LoggerFactory.getLogger(Initialize.class);



	public void init() {
		LOGGER.info(">>>>> 系统初始化");
	}

}

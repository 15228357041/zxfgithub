package com.test.erp.task;

//import io.renren.modules.sys.entity.SysUserEntity;
//import io.renren.modules.sys.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 测试定时任务(演示Demo，可删除)
 * 
 * testTask为spring bean的名称
 * 
 * @author xuchangda
 * @email changdaxu@foxmail.com
 * @date 2016年11月30日 下午1:34:24
 */
@Component("testTask")
public class TestTask {
	private Logger logger = LoggerFactory.getLogger(getClass());
	

	public void test(String params){
		logger.info("我是带参数的test方法，正在被执行，参数为：" + params);
		
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		SysUserEntity user = sysUserService.queryObject(1L);
//		System.out.println(ToStringBuilder.reflectionToString(user));
		
	}
	
//	@Scheduled(cron = " */5 * * * * ? ")
	public void test2(){
		System.out.print("hello");
		logger.info("我是不带参数的test2方法，正在被执行");
	}
}

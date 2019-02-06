package com.test.common.aspect;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统服务组件Aspect切面Bean
 */
// 声明这是一个组件
@Component
// 声明这是一个切面Bean
@Aspect
public class ServiceAspect  {
    private final static Log log = LogFactory.getLog(ServiceAspect.class);
    


    // 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
    @Pointcut("execution(* com.test.erp.rpc.service.impl..*(..))")
    public void pcMethod() {
    }


    // 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
    @Pointcut("execution(* com.test.erp.rpc.service.impl..update*(..))")
    public void updateMethod() {
    }

    // 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
    @Pointcut("execution(* com.test.erp.rpc.service.impl..delete*(..))")
    public void deleteMethod() {
    }

    @Pointcut("execution(* com.test.erp.rpc.service.impl..add*(..)) || execution(* com.test.erp.service.impl..insert*(..))")
    public void addMethod() {
    }


    /*
     * 配置前置通知,使用在方法pcMethod()上注册的切入点 同时接受JoinPoint切入点对象,可以没有该参数
     */
    @Before("pcMethod()")
    public void doBefore() {
        if (log.isInfoEnabled()) {
            log.info("execute method before... ");
        }

    }

    // 配置后置通知,使用在方法pcMethod()上注册的切入点
    @After("pcMethod()")
    public void doAfter(JoinPoint jp) {
        if (log.isInfoEnabled()) {
            log.info("execute method after...");
        }
    }


    // 配置环绕通知,使用在方法pcMethod()上注册的切入点
    @Around("pcMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable { // 要执行pip.proceed方法
        String className = pjp.getSignature().getDeclaringTypeName();
        className = className.substring(className.lastIndexOf(".") + 1).trim();// 执行的类名
        String methodName = pjp.getSignature().getName();// 执行的方法名称
        if (className.equals("LogServiceImpl")) { // 如果是日志的就不用
            return pjp.proceed();
        }
        Object[] args = pjp.getArgs(); // 调用参数
        if (args != null) {
            log.info("className:" + className + " methodName:" + methodName);
            log.info("args:" + args.toString());
        }
        return pjp.proceed();
    }


    // 配置环绕通知,使用在方法updateMethod()上注册的切入点
    @Around("updateMethod()")
    public Object doUpdateAround(ProceedingJoinPoint pjp) throws Throwable { // 要执行pip.proceed方法
        String className = pjp.getSignature().getDeclaringTypeName();
        Object objectString = pjp.getThis();
        className = className.substring(className.lastIndexOf(".") + 1).trim();// 执行的类名
        String methodName = pjp.getSignature().getName();// 执行的方法名称
        if (className.equals("LogServiceImpl")) { // 如果是日志的就不用
            return pjp.proceed();
        }

        Object[] args = pjp.getArgs(); // 调用参数
        if (args != null) {

            Map opContent = getOptionUpdateKey(args, methodName);//获取操作内容
            String inobjectDto = (String) opContent.get("className");
            String inkey = (String) opContent.get("keyValue");
            String inmethodName = (String) opContent.get("methodName");
        }
        return pjp.proceed();
    }

    // 配置环绕通知,使用在方法deleteMethod()上注册的切入点
    @Around("deleteMethod()")
    public Object doDeleteAround(ProceedingJoinPoint pjp) throws Throwable { // 要执行pip.proceed方法
        String className = pjp.getSignature().getDeclaringTypeName();
        className = className.substring(className.lastIndexOf(".") + 1).trim();// 执行的类名
        String methodName = pjp.getSignature().getName();// 执行的方法名称
        Object[] objs = pjp.getArgs();
        if (className.equals("LogServiceImpl")) { // 如果是日志的就不用
            return pjp.proceed();
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String id = request.getParameter("id");
        Object[] args = pjp.getArgs(); // 调用参数

        if (args != null) {
            //获取操作内容
            Map map = getOptiondeletClassName(args, methodName);
            String inobjectDto = (String) map.get("className");

            inobjectDto = inobjectDto.substring(inobjectDto.lastIndexOf(".") + 1).trim();
            //inobject = inobject.substring(inobject.lastIndexOf(".") + 1,inobject.trim().length()-3).trim().toLowerCase();
            //className = className.substring(0,className.trim().length()-11).trim().toLowerCase();
            log.info("className:" + className + " methodName:" + methodName);
            if (id != null) {
                if (id.equals("")) {
                    return pjp.proceed();
                }

            }
        }
        return pjp.proceed();
    }

    // 配置后置返回通知,使用在方法pcMethod()上注册的切入点
    @AfterReturning(value = "pcMethod()", returning = "rtv")
    public void afterReturn(JoinPoint jp, Object rtv) {
        if (log.isInfoEnabled()) {
            log.info("execute method Return:" + rtv);
        }

    }

    // 配置后置返回通知,使用在方法addMethod()上注册的切入点
    @AfterReturning(value = "addMethod()", returning = "rtv")
    public void afterReturnAdd(JoinPoint jp, Object rtv) throws Throwable {

        if (rtv.equals(true) || rtv.equals(false)) {
            return;
        }

    }
	
	
/*	// 配置后置返回通知,使用在方法pcMethod()上注册的切入点
		@AfterReturning(value = "updateMethod()", returning = "rtv")
		public void afterReturnUpdate(JoinPoint jp, Object rtv) throws Throwable {
			
			Result result  = (Result) rtv ;
			Object outObejct = result.getObj();
			String className = outObejct.getClass().getName();
			
			if(className.equals("com.mingcloud.ams.common.tree.JSTreeData")){
				JSTreeData jstree = (JSTreeData) result.getObj();
				
				Object object = jstree.getAttributes();
				
				className = object.getClass().getName();
			}
			
			if(!className.equals("log")){ //除去日志
				 // 获取对象的所有方法
		        Method[] methods = rtv.getClass().getDeclaredMethods();
				
		        //根据属性名获得属性值
		        Field fieldid = outObejct.getClass().getDeclaredField("id"); 
		        
		        // 参数值为true，禁止访问控制检查(这样可以获取私有变量)
		        fieldid.setAccessible(true); 
		        
		        String id = fieldid.get(outObejct).toString();
		        
		        TranslateInNumber tInNumber = new TranslateInNumber();
		        Integer outnumber = tInNumber.translateInNumber(id);
		      
				String outclassName = className.substring(className.lastIndexOf(".") + 1,className.trim().length()-3).trim().toLowerCase();
				
				if (log.isInfoEnabled()) {
					log.info("execute method Return:" + "ssss  "+outObejct+"   id  "+outnumber+"    className  "+outclassName);
				}
				UserDto user = UserSession.getInstance().getUserAuthInfo();
				LogDto logDto = new LogDto();
				logDto.setTypeid(LogTypeEnum.INSERT.getLogType());				
				logDto.setExtraid1(outnumber);
				logDto.setExtravarchar1(outclassName);
				logDto.setCreatedate(new Date());				
				logDto.setCreateuserid(user.getId());
				logService.addLog(logDto);
			}	

		}*/

    // 配置抛出异常后通知,使用在方法pcMethod()上注册的切入点
    @AfterThrowing(pointcut = "pcMethod()", throwing = "ex")
    public void afterThrow(JoinPoint jp, Exception ex) {
        Signature signature = jp.getSignature();
        System.out.println(signature.getDeclaringTypeName() + ":" + signature.getName());
        try {
            if (log.isInfoEnabled()) {
                log.info("Exception msg:" + ex.getMessage());
            }
            if (StringUtils.isNotBlank(ex.getMessage())) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用Java反射来获取被拦截方法(insert、update)的参数值，
     * 将参数值拼接为操作内容
     */
    public String adminOptionContent(Object[] args, String mName) {
        if (args == null) {
            return null;
        }
        StringBuffer rs = new StringBuffer();
        rs.append(mName);
        String className = null;
        int index = 1;
        // 遍历参数对象
        for (Object info : args) {

            //获取对象类型
            className = info.getClass().getName();
            className = className.substring(className.lastIndexOf(".") + 1);
            rs.append("[参数" + index + "，类型：" + className + "，值：");

            // 获取对象的所有方法
            Method[] methods = info.getClass().getDeclaredMethods();

            // 遍历方法，判断get方法
            for (Method method : methods) {
                String methodName = method.getName();
                // 判断是不是get方法
                if (methodName.indexOf("get") == -1) {// 不是get方法
                    continue;// 不处理
                }
                Object rsValue = null;
                try {
                    // 调用get方法，获取返回值
                    rsValue = method.invoke(info);

                    if (rsValue == null) {//没有返回值
                        continue;
                    }
                } catch (Exception e) {
                    continue;
                }
                //将值加入内容中
                rs.append("(" + methodName + " : " + rsValue + ")");
            }

            rs.append("]");
            index++;
        }
        return rs.toString();
    }


    public Map<String, Object> getOptiondeletClassName(Object[] args, String mName) {

        if (args == null) {
            return null;
        }

        StringBuffer rs = new StringBuffer();
        rs.append(mName);
        String className = null;
        int index = 1;
        Map<String, Object> map = new HashMap<String, Object>();
        int i = 1;
        // 遍历参数对象
        for (Object info : args) {
            // Map<String, Object> inmap = new HashMap<String, Object>();
            //获取对象类型
            className = info.getClass().getName();
            map.put("className", className);


            //获取表的第一个大写字母
            String start = className.substring(className.lastIndexOf(".") + 1, className.lastIndexOf(".") + 1).trim();


            index++;
        }
        return map;
    }


    public Map<String, Object> getOptionUpdateKey(Object[] args, String mName) {

        if (args == null) {
            return null;
        }

        StringBuffer rs = new StringBuffer();
        rs.append(mName);
        String className = null;
        int index = 1;
        Map<String, Object> map = new HashMap<String, Object>();
        int i = 1;
        // 遍历参数对象
        for (Object info : args) {
            // Map<String, Object> inmap = new HashMap<String, Object>();
            //获取对象类型
            className = info.getClass().getName();
            map.put("className", className);
            className = className.substring(className.lastIndexOf(".") + 1);
            rs.append("[参数" + index + "，类型：" + className + "，值：");

            // 获取对象的所有方法
            Method[] methods = info.getClass().getDeclaredMethods();
            //获取表的第一个大写字母
            String start = className.substring(className.lastIndexOf(".") + 1, className.lastIndexOf(".") + 2).trim();
            // 遍历方法，判断get方法
            for (Method method : methods) {


                String methodName = method.getName();
                // 判断是不是get方法
                if (methodName.indexOf("key") == -1 || methodName.indexOf(start, 3) == -1) {// 不是get方法
                    continue;// 不处理
                }
                Object rsValue = null;
                try {
                    // 调用get方法，获取返回值
                    rsValue = method.invoke(info);

                    if (rsValue == null) {//没有返回值
                        continue;
                    } else {
                        map.put("keyValue", rsValue);
                        map.put("methodName", methodName);
                        break;
                    }
                } catch (Exception e) {
                    continue;
                }
                //将值加入内容中


                // rs.append("(" + methodName + " : " + rsValue + ")");
            }


            index++;
        }
        return map;
    }

}
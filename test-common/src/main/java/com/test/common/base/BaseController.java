package com.test.common.base;

import com.test.common.util.CSRFTokenManager;
import com.test.common.util.PropertiesFileUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 控制器基类
 * Created by test on 2017/2/4.
 */
public abstract class BaseController {

	private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 统一异常处理
	 * @param request
	 * @param response
	 * @param exception
	 */
	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		LOGGER.error("统一异常处理：", exception);
		request.setAttribute("ex", exception);
		if (null != request.getHeader("X-Requested-With") && "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
			request.setAttribute("requestHeader", "ajax");
		}
		// shiro没有权限异常
		if (exception instanceof UnauthorizedException) {
			return "/403.jsp";
		}
		// shiro会话已过期异常
		if (exception instanceof InvalidSessionException) {
			return "/error.jsp";
		}
		return "/error.jsp";
	}

	/**
	 * 返回jsp视图
	 * @param path
	 * @return
	 */
	public static String jsp(String path) {
		return path.concat(".jsp");
	}

	/**
	 * 返回thymeleaf视图
	 * @param path
	 * @return
	 */
	public static String thymeleaf(String path) {
		String folder = PropertiesFileUtil.getInstance().get("app.name");
		return "/".concat(folder).concat(path).concat(".html");
	}

	/**
	 * @description 校验ajax post 请求中csrf tooken是否存在
	 * @param  request
	* @param  session
	 * @return boolean
	 * @author zhuxufeng
	 * @date 2018/5/14 11:30
	 **/
	protected boolean isValidCsrfHeaderToken(HttpServletRequest request, HttpSession session) {
		if (request.getHeader("__RequestVerificationToken") == null
				|| session
				.getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME) == null
				|| !request
				.getHeader("__RequestVerificationToken")
				.equals(session
						.getAttribute(
								CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME)
						.toString())) {
			LOGGER.debug("CSRF Post attack detected. URL: "+request.getRequestURI());
			return false;
		}
		return true;
	}

	/**
	 * @description 校验提交form表单时csrf tooken是否存在
	 * @param  CSRFToken
	 * @param  request
	* @param  session
	 * @return boolean
	 * @author zhuxufeng
	 * @date 2018/5/14 11:30
	 **/
	protected Boolean regionDel(String CSRFToken, HttpSession session,  HttpServletRequest request) {
		if (CSRFToken == null || !CSRFToken.equals(session.getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME).toString())) {
			LOGGER.debug("CSRF attack detected. URL: "+request.getRequestURI());
			return false;
		}
		return true;
	}
}

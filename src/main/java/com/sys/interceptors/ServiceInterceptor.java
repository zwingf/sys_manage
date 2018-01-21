package com.sys.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 业务使用的拦截器--主要针对资源权限判断
 * 
 * @author qianfuqiang
 */
public class ServiceInterceptor implements HandlerInterceptor {

	private static Logger log = LoggerFactory.getLogger(ServiceInterceptor.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String path = request.getServletPath();
		String refererUrl = request.getHeader("referer");
		log.info("执行业务处理拦截开始" + path);
		// 获取当前session数据
		/*if (request.getSession().getAttribute("usersession") == null) {
			log.info("执行业务处理拦截不通过，没有权限" + path);
			if (refererUrl == null || refererUrl.endsWith("goLeft.do")) {
				response.sendRedirect("../nologin.jsp");
			} else {
				response.sendRedirect("../noLogin.do");
			}
			return false;
		} else {
			return false;
		}*/
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
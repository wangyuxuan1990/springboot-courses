package com.wangyuxuan.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangyuxuan
 * @date 2020/9/12 5:48 下午
 * @description 拦截器
 */
public class SomeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行拦截器" + request.getRequestURI());
        return true;
    }
}

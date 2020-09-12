package com.wangyuxuan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author wangyuxuan
 * @date 2020/9/12 8:19 下午
 * @description
 */
@WebFilter("/*")
public class SomeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("信息被过滤");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

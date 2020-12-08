package com.example.demo.config;

import com.example.demo.service.TestBeanService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
//过滤所有过滤器的请求{/* }，注解实现方式无法保证过滤器的执行顺序
//@WebFilter(filterName = "customFilter", urlPatterns = {"/*"})
public class CustomFilter implements Filter {
    //测试注入Bean  对象，发现为null  ,Filter 为servlet对象无法注入bean  对象
    @Resource
    TestBeanService testBeanService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前---doFilter方法之前的过滤请求");
        servletRequest.setCharacterEncoding("UTF-8");

        filterChain.doFilter(servletRequest, servletResponse);

        servletResponse.setCharacterEncoding("UTF-8");
        log.info("customer 请求处理之后---doFilter 方法之后处理相应");
    }

    @Override
    public void destroy() {
        log.info("filter destroy");
    }
}

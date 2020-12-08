package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
// public class MyWebMvcConfigurer implements WebMvcConfigurerAdapter
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Resource
    CustomHandlerInterceptor customHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器  拦截规则
        //多个拦截器事 依次添加 执行顺序按添加顺序
        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
//        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
//        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
    }
}

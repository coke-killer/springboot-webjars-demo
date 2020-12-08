package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        //输入context上下文的bean   对象
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //Filter可以new 则可以使用依赖注入bean
        registrationBean.setFilter(new CustomFilter());
        //设置过滤器名称
        registrationBean.setName("customFilter");
        //设置拦截器
        registrationBean.addUrlPatterns("/*");
        //设置顺序
        registrationBean.setOrder(10);
        return registrationBean;
    }
}

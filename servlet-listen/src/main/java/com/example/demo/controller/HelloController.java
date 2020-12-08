package com.example.demo.controller;

import com.example.demo.event.MyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class HelloController {
    @Resource
    ApplicationContext applicationContext;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpSession httpSession) {
        //操作attribute
        request.setAttribute("a", "a");
        request.setAttribute("a", "b");
        request.getAttribute("a");
        request.removeAttribute("a");
        //操作session
        httpSession.setAttribute("a", "a");
        httpSession.getAttribute("a");
        httpSession.invalidate();
        return "hello world ------";
    }

    @GetMapping("/hello1")
    public String hello1() {
        applicationContext.publishEvent(new MyEvent("事件测试"));
        return "hello world ------";
    }
}

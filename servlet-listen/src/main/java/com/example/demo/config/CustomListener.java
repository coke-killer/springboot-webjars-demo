package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Slf4j
@WebListener
public class CustomListener implements ServletContextListener, ServletRequestListener, HttpSessionListener, ServletRequestAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("---------------------------------context  创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("-------------------------------context销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("-----------------------attribute add");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("-------------------------attribute remove");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("-----------------------attribute Replaced");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("------------------------request销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("---------------------request初始化");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("---------------------------session初始化");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("-------------------------session销毁");
    }

    public CustomListener() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

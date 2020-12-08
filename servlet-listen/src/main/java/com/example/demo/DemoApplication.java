package com.example.demo;

import com.example.demo.event.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//扫描  servlet逐渐，@WebListener是主键的一种
@ServletComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        //添加监听器，MyListener1实现方式
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        context.addApplicationListener(new MyListener1());
        SpringApplication.run(DemoApplication.class, args);
    }

}

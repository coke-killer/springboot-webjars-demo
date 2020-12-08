package com.example.demo.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
//添加注解，，，注册MyListener2
@Component
public class MyListener2 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        log.info(String.format("%s监听到事件源：%s.",
                MyListener2.class.getName(),
                myEvent.getSource()));
    }
}

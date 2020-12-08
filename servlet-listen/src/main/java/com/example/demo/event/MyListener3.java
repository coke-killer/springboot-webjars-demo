package com.example.demo.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        log.info(String.format("%s监听到事件源：%s.",
                MyListener3.class.getName(),
                myEvent.getSource()));
    }
}

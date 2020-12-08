package com.example.demo.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyListener4 {
    @EventListener
    public void listener(MyEvent myEvent) {
        log.info(String.format("%s监听到事件源：%s.",
                MyListener4.class.getName(),
                myEvent.getSource()));
    }
}

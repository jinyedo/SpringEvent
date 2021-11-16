package com.example.springevent.wrap;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE) // 이벤트 처리 순서 설정 - Ordered.HIGHEST_PRECEDENCE: 가장 높은 우선순위
    @Async
    public void onMyEvent(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("First event handling, data: " + event.getData());
    }
}

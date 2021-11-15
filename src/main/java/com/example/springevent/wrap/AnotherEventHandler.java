package com.example.springevent.wrap;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnotherEventHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE + 2) // 이벤트 처리 순서 설정 - 설정하는 값이 클수록 우선순위가 낮아진다.
    public void onMyEvent(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("Another event handling, data: " + event.getData());
    }
}

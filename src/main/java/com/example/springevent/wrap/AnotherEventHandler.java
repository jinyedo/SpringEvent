package com.example.springevent.wrap;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherEventHandler {

    @EventListener
    public void onMyEvent(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("Another event handling, data: " + event.getData());
    }
}

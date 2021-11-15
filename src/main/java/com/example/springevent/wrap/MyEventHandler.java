package com.example.springevent.wrap;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void onMyEvent(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("First event handling, data: " + event.getData());
    }
}

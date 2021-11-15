package com.example.springevent.wrap;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/*
    Spring 4.2 미만에서는 이벤트를 만들기 위해 ApplicationEvent 를  상속받아야 한다.
    Spring 에서 이벤트는 Bean 으로 등록하지 않는다.
 */
@Getter
public class MyEvent extends ApplicationEvent {

    private int data;

    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, int data) {
        super(source);
        this.data = data;
    }
}


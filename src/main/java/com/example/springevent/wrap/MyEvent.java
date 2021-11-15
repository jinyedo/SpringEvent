package com.example.springevent.wrap;

import lombok.Getter;

@Getter
public class MyEvent {

    private final Object source;
    private final int data;

    public MyEvent(Object source) {
        this(source, 0);
    }

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }
}


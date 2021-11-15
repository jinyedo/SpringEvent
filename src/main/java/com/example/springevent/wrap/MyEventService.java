package com.example.springevent.wrap;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyEventService {

    private final ApplicationEventPublisher publisher;

    public void run() {
        publisher.publishEvent(new MyEvent(this, 100));
    }
}

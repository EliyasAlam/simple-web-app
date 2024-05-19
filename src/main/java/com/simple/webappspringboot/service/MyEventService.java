package com.simple.webappspringboot.service;

import com.simple.webappspringboot.event.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyEventService {

    @Autowired
    private EventPublisher eventPublisher;

    public String doSomething() {
        eventPublisher.publishCustomEvent("This is for testing buddy.");
        System.out.println("Hurrah!! We did it.");
        return "Event has handled.";
    }
}

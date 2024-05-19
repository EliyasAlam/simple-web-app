package com.simple.webappspringboot.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener {

    @Async
    @EventListener
    public void handleEvent(CustomEvent event) {
        int j = 0;
        for (int i =0; i<100000; i++) {
            j++;
        }
        System.out.println("Event received....processing now");
        System.out.println(event.getMessage());
    }
}

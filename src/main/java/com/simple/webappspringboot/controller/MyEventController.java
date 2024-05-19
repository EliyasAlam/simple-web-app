package com.simple.webappspringboot.controller;

import com.simple.webappspringboot.service.MyEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class MyEventController {

    @Autowired
    private MyEventService myEventService;

    @GetMapping("publish")
    public String doSomething() {
        return myEventService.doSomething();
    }

}

package com.greenfoxacademy.helloworld.controllers;

import com.greenfoxacademy.helloworld.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong al = new AtomicLong();

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("name") String name){
        return new Greeting(al.incrementAndGet(), "Hello, " + name);
    }
}

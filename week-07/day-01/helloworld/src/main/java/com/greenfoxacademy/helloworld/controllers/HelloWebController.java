package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWebController {

    private AtomicLong al = new AtomicLong();

    @RequestMapping(value = "/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) {
        return "Hello " + name + "! This site was loaded " + al.incrementAndGet() + " times since last server start.";
    }
}

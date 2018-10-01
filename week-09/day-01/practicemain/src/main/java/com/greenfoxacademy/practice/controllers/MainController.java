package com.greenfoxacademy.practice.controllers;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexGet() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public UserOutput doubling(@RequestParam int input) {
        UserOutput userOutput = new UserOutput();
        userOutput.received = input;
        userOutput.result = userOutput.received * 2;
        return userOutput;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeting greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) {
            return new Greeting();
        }
       
        return new Greeting(name, title);
    }

    public class UserOutput {
        public int received;
        public int result;
    }

    static class Greeting {
        public String welcome_message;
        public String error;

        public Greeting(String name, String title) {
            welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }

        public Greeting() {
            error = "Please provide a name!";
        }

    }
}

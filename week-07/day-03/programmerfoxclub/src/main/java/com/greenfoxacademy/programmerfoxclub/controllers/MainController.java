package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/index")
    public String main(Model model) {
        model.addAttribute("name");
        return "index";
    }

    @GetMapping("/information")
    public String information() {
        return "information";
    }
}



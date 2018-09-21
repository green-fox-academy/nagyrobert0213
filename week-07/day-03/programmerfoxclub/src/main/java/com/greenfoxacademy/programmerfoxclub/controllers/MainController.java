package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    FoxService foxService;

//    @GetMapping("/index")
//    public String main(Model model) {
//        model.addAttribute("name");
//        return "index";
//    }

    @GetMapping("/information")
    public String information() {
        return "information";
    }

    @GetMapping("/index")
    public String getMain(String name, Model model){
        if (foxService.getFox(name) == null) {
            foxService.addFox(name);
        }
        Fox fox = foxService.getFox(name);
        model.addAttribute("name", fox.getName());
        return "index";
    }
}



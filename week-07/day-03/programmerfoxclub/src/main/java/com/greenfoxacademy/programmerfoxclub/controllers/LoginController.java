package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    FoxService foxService = new FoxService();

//    public LoginController() {
//        this.fox = new Fox(name);
//    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(String name, Model model) {
        return "redirect:/?name=" + name;
    }

}

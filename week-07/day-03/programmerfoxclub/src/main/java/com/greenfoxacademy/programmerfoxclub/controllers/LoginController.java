package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private Fox fox;

//    public LoginController() {
//        this.fox = new Fox(name);
//    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(String name){
//        fox.setName(name);
        fox = new Fox(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", fox.getName());
        return "index";
    }
}

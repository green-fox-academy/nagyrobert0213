package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.RedditService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private RedditService redditService;

    public LoginController(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping("/register")
    public String registerGet() {
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(String username, String password) {
        redditService.addNewUser(username, password);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginGet() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(String username, String password) {
//        redditService.getNewUser(username, password);
        if (redditService.getNewUsername(username)){
            return "redirect:/";
        }
        else {
            return "login";
        }
    }


}

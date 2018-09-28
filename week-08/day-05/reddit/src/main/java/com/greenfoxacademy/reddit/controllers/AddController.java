package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.RedditService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {
    private RedditService redditService;

    public AddController(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping("/addpost")
    public String addGet(){
        return "addpost";
    }

    @PostMapping("/addpost")
    public String addPost(String title){
        redditService.addNewPost(title);
        return "redirect:/";
    }
}

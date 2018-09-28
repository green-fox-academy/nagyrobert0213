package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.repositories.RedditRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditController {
    private RedditRepository redditRepository;
    private UserRepository userRepository;

    public RedditController(RedditRepository redditRepository, UserRepository userRepository) {
        this.redditRepository = redditRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index(Model model){
//        model.addAttribute("redditList", redditRepository.findAll());
        model.addAttribute("redditList", redditRepository.findAllByOrderByPointDesc());
        model.addAttribute("userList", userRepository.findAll());
        return "index";
    }
}

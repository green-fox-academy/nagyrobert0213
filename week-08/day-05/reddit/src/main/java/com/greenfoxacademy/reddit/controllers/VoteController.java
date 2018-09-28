package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.RedditService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoteController {

    private RedditService redditService;

    public VoteController(RedditService redditService) {
        this.redditService = redditService;
    }

    @PostMapping("/{id}/upvote")
    public String upVote(@PathVariable long id){
        redditService.increaseScore(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/downvote")
    public String downVote(@PathVariable long id){
        redditService.decreaseScore(id);
        return "redirect:/";
    }
}

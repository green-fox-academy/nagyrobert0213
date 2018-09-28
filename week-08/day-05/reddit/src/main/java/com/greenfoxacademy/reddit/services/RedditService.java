package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

public interface RedditService {

    void increaseScore(long id);
    void decreaseScore(long id);
    Post addNewPost(String title);
    void addNewUser(String username, String password);

    boolean getNewUsername(String username);
}

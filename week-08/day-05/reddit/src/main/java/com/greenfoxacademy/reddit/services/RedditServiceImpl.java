package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.RedditRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;

@Service
public class RedditServiceImpl implements RedditService {

    private RedditRepository redditRepository;
    private UserRepository userRepository;

    public RedditServiceImpl(RedditRepository redditRepository, UserRepository userRepository) {
        this.redditRepository = redditRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void increaseScore(long id) {
        Post post = redditRepository.findById(id);
        post.setPoint(post.getPoint() + 1);
        redditRepository.save(post);
    }

    @Override
    public void decreaseScore(long id) {
        Post post = redditRepository.findById(id);
        post.setPoint(post.getPoint() - 1);
        redditRepository.save(post);
    }

    @Override
    public Post addNewPost(String title) {
        Post post = new Post();
        post.setTitle(title);
        post.setCreatedDate(LocalDateTime.now(Clock.systemUTC()));
        redditRepository.save(post);
        return post;
    }

    @Override
    public void addNewUser(String username, String password) {
        User user = new User(username,password);
        userRepository.save(user);
    }

    @Override
    public boolean getNewUsername(String username) {
        User user = userRepository.findByName(username);
        return user.getName().equals(username);
    }
}

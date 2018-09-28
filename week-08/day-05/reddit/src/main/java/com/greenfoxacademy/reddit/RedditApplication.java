package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.RedditRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private RedditRepository redditRepository;

    public RedditApplication(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Post post1 = new Post();
        post1.setTitle("Test post");
        post1.setCreatedDate(LocalDateTime.now(Clock.systemUTC()));
        redditRepository.save(post1);

    }
}

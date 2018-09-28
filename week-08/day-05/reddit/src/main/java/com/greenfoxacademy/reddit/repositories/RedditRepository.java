package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository<Post, Long> {

    Post findById(long id);
    Iterable <Post> findAllByOrderByPointDesc();
}

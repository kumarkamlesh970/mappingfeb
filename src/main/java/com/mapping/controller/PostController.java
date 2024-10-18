package com.mapping.controller;

import com.mapping.entity.Post;
import com.mapping.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/post")
public class PostController {

@Autowired
    private PostRepository postrepository;


    public PostController(PostRepository postRepository) {
        this.postrepository = postrepository;
    }

    public String createPost()
    {

        return "post created successfully";
    }
    @PostMapping("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post1) {
        Post savedPost = postrepository.save(post1);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }
}

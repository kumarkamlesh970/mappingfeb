package com.mapping.controller;

import com.mapping.entity.Comment;
import com.mapping.entity.Post;
import com.mapping.repository.CommentRepository;
import com.mapping.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/comment")
public class CommentController {
@Autowired
    private final CommentRepository commentRepository;
    @Autowired
    private final PostRepository postRepository;

     public CommentController(CommentRepository commentRepository, PostRepository postRepository) {
         this.commentRepository = commentRepository;
         this.postRepository = postRepository;
     }

    public String createCommentCh()
    {
        return "Comment created successfully ";
    }

    @PostMapping("/create")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment,
                                                 @RequestParam Long postId) {
        // Ensure you are using the correct repository for saving comments
        Comment savedComment = commentRepository.save(comment);
        return new ResponseEntity<>(savedComment, HttpStatus.CREATED);
    }





}

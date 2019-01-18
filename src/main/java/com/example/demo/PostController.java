package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/api/posts")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    @GetMapping("/api/posts/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Post get(@PathVariable int id) {
        return postService.get(id);
    }
}

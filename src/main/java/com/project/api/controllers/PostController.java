package com.project.api.controllers;

import com.project.api.models.Post;
import com.project.api.services.PostService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public void save(@RequestBody Post post) {
        postService.save(post);
    }

    @GetMapping("/posts")
    public List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/posts/{id}")
    public Post findById(@PathVariable String id) {
        return postService.findById(id).get();
    }

    @PutMapping("/posts")
    public void update(@RequestBody Post post) {
        postService.save(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deleteById(@PathVariable String id) {
        postService.deleteById(id);
    }

}

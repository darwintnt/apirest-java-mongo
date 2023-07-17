package com.project.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.api.models.Post;
import com.project.api.repositories.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void save(Post post) {
        postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Optional<Post> findById(String id) {
        return postRepository.findById(id);
    }

    public void deleteById(String id) {
        postRepository.deleteById(id);
    }

}

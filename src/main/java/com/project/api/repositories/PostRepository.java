package com.project.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.api.models.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

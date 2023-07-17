package com.project.api.models;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "posts")
@Data
public class Post {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean isPublished = false;
    private Date createdAt = new Date();
    private Optional<Date> publishedAt;
}

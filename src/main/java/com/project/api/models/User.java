package com.project.api.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(value = "users")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Date createdAt;
    private boolean isActive = false;
}

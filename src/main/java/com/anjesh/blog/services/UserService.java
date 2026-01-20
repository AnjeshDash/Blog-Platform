package com.anjesh.blog.services;

import com.anjesh.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);

}

package com.adepuu.demojdbc.auth.service;

import com.adepuu.demojdbc.auth.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void createUser(User user);
}

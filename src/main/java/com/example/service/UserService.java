package com.example.service;

import com.example.model.User;

public interface UserService {
    void saveUser(User user);
    User getUserByEmail(String email);
}

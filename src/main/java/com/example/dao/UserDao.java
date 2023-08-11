package com.example.dao;

import com.example.model.User;

public interface UserDao {
    void saveUser(User user);
    User getUserByEmail(String email);
}

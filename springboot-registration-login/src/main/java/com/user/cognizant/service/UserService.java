package com.user.cognizant.service;

import com.user.cognizant.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

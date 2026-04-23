package com.justdemo.demo.service;

import com.justdemo.demo.model.User;
import com.justdemo.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private UserRepo repo;

    public User add_user(User user){
        return repo.save(user);
    }
}

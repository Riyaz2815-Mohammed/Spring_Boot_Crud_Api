package com.justdemo.demo.repository;

import com.justdemo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.name = 'Reshmi'")
    User displayReshmi();
    }


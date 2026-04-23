package com.justdemo.demo.repository;

import com.justdemo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

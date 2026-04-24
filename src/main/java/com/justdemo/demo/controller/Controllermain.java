package com.justdemo.demo.controller;

import com.justdemo.demo.model.User;
import com.justdemo.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controllermain {

    @Autowired
    private Userservice service;

    @PostMapping
        public User addUser(@RequestBody User user) {
            return service.add_user(user);

    }

    @GetMapping
    public List<User> display(){
        return service.display();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
         service.delete(id);
         return  id  + "Deleted Successful";

    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @GetMapping("/{id}")
    public User getbyid(@PathVariable Long id){
        return service.getsingle(id);

    }
    @PatchMapping("/{id}")
    public User patchupdate(@PathVariable Long id,@RequestBody User user){
        return service.patchuser(id,user);
    }

    @GetMapping("/ilr")
    public User print(){
        return  service.print();
    }

}
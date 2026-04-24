package com.justdemo.demo.service;

import com.justdemo.demo.model.User;
import com.justdemo.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Service
public class Userservice {
    @Autowired
    private UserRepo repo;

    public User add_user(User user){
        return repo.save(user);
    }
    public List<User> display(){
       return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
    public User updateUser(Long id, User newUser) {

        User existing = repo.findById(id).orElseThrow(() -> new UserNotFound(id));

        existing.setName(newUser.getName());
        existing.setAge(newUser.getAge());
        existing.setDept(newUser.getDept());

        return repo.save(existing);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class UserNotFound extends RuntimeException{
        public UserNotFound(Long id){
            super("User Not Found with id:"+ id);
        }
    }

    public User getsingle(Long id){
        return repo.findById(id).orElseThrow(()-> new UserNotFound(id));
    }

    public User patchuser(Long id,User user){

        User existing = repo.findById(id).orElseThrow(() -> new UserNotFound(id));

        if(user.getAge()!=null){
            existing.setAge(user.getAge());
        }
        if(user.getDept()!=null){
            existing.setDept(user.getDept());
        }
        if(user.getName()!=null){
            existing.setName(user.getName());
        }
        return repo.save(existing);
    }

    public User print(){
        return repo.displayReshmi();
    }


}

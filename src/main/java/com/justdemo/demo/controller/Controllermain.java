package com.justdemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controllermain {

    @GetMapping("/all")
    public String display(){
        return "All Users";
    }

    @PostMapping("/add")
    public  String getuser(){
        return "Added";
    }


}

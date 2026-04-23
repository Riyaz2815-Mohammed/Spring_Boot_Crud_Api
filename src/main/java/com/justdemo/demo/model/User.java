package com.justdemo.demo.model;

public class User {
    String name;
    Integer age;
    String Dept;

    User(String n,Integer a,String d){
        this.name=n;
        this.age=a;
        this.Dept=d;

        public getUser(User u){
            return u.name + " - " + u.age + " - " + u.dept;
        }



    }
}

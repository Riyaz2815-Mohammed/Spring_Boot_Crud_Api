package com.justdemo.demo.model;

public class User {
    String name;
    Integer age;
    String dept;

//    User(){}
public User() {
}

    // Parameterized constructor (optional but useful)
    public User(String name, Integer age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept=dept;

    }

    public Integer getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }
}

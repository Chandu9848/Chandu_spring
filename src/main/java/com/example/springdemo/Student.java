package com.example.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
    @Value("${student-id}")
    private  int id;
    @Value("${student-name}")
    private String name;
    @Value("${student-age}")
    private  int age;



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

}

package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}

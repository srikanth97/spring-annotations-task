package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    @Autowired
    @Qualifier("actor2")
    private Actor actor;

    @Override
    public String  toString() {
        return "Actor name : " +actor.getName() +
                " Actor age : " + actor.getAge() +
                " Actor gender :- " + actor.getGender();
    }
}

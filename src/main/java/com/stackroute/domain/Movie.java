package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    @Qualifier("actor1")
    private Actor actor;

    public Movie(){}


    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    @Override
    public String  toString() {
        return "Actor name : " +actor.getName() +
                " Actor age : " + actor.getAge() +
                " Actor gender :- " + actor.getGender();
    }
}

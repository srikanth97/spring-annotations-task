package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Movie movie1 = context.getBean("MovieA",Movie.class);
        Movie movie2 = context.getBean("MovieB",Movie.class);
        System.out.println(movie1.toString());
        System.out.println(movie2 == movie1);
    }
}

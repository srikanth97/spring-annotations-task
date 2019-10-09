package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class AppConfig {

    @Bean(name = "actor1")
    public Actor getActor1(){
        return new Actor("Prabhas","Male",45);
    }

    @Bean(name = "actor2")
    public Actor getActor2(){
        return new Actor("Allu Arjun","Male",35);
    }

    @Bean(name = "actor3")
    public Actor getActor3(){
        return new Actor("Rakul","Female",28);
    }

}

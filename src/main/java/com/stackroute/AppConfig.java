package com.stackroute;


import com.stackroute.domain.Actor;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class AppConfig {
    @Bean(name = "actor")
    public Actor getActor1(){
        return new Actor("Prabhas","Male",45);
    }
}

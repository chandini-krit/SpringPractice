package com.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;


public class GreetingService {
    @Getter @Setter
    private String greeting;
//    public GreetingService(String greeting){
//        this.greeting=greeting;
//    }
    public void init() {
        System.out.println("Bean is going through init.");
    }


    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public Service(ConditionalBean bean) {
        System.err.println("I have a bean !");
    }
}

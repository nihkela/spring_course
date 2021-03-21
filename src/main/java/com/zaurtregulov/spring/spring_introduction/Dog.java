package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: destroy method");
    }
}

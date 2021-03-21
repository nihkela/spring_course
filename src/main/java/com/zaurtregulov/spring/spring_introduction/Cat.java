package com.zaurtregulov.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow");
    }
}

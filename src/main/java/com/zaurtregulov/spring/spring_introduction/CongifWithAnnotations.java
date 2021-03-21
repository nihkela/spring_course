package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CongifWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}

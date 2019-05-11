package com.ovi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //Load The spring Configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        Coach baseBallCoach = context.getBean("baseBallCoach",Coach.class);
        Coach trackCoach = context.getBean("trackCoach",Coach.class);


        //call methods on the bean
        System.out.println(baseBallCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());

        //close the context
    }
}

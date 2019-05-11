package com.ovi.springdemo;

public class CricketCoach implements Coach {

    FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("CricketCouch : inside no argument constructor .");
    }
      //our setter Method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCouch : inside Setter Method .");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() ;
    }
}

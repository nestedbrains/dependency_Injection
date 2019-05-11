package com.ovi.springdemo;

public class TrackCoach implements Coach {

    FortuneService fortuneService ;

    public  TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 1 hours in Track";
    }

    @Override
    public String getDailyFortune() {
        return "Track : " + fortuneService.getFortune();
    }
}

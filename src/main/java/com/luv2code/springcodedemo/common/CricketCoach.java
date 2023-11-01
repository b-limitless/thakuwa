package com.luv2code.springcodedemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach {

    public CricketCoach() {
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Lets play cricket";
    }
}

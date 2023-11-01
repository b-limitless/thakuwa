package com.luv2code.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements  Coach {
    @Override
    public String getDailyWorkout() {
        return "30 minutes in batting practice";
    }

}

package com.luv2code.springcodedemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements  Coach{

    @Override
    public String getDailyWorkout() {
        return "Track Coach";
    }
}

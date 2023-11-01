package com.luv2code.springcodedemo.rest;

import com.luv2code.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Define a private field for the dependancy
    private Coach myCoach;

    private Coach anotherCoach;

//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @Autowired
    public  DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach
    ) {
        System.out.println("In Constructor" + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

//
    @GetMapping("/check")
    public String check() {
        return "comparing beans mycoach === anotherCoach" + (myCoach == anotherCoach);
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

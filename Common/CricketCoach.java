package com.example.springCore.Common;

import org.springframework.stereotype.Component;
@Component

public class CricketCoach implements Coach{
    @Override
    public String gerdailyworkout() {
        return "Do batting 60 mins";
    }
}

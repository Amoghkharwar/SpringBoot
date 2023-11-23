package com.example.springCore.controler;

import com.example.springCore.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
@RestController
public class HomeControler {
   @Autowired
    Coach theCoach;
//    public HomeControler(Coach theCoach){
//        this.theCoach=theCoach;
//    }



    @GetMapping("/hello")
    public String sayHello(){
        return "Hey buddy";
    }

    @GetMapping("/coach")

    public String vada(){
        return theCoach.gerdailyworkout();
    }

}

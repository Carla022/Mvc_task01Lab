package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/greeting")
public class greetingController {

//Step 1: Return String:
    @GetMapping
    public String greeting(){
        return "Good afternoon, Carla!";
    }

//    Step 2: Return POJO:

    @GetMapping
    public Greeting greet(){
        return new Greeting("Carla", "Afternoon");

    }

//    MVP DONE

//    EXTENSION1

    //Add @RequestParam:
    @GetMapping
    public Greeting greet (@RequestParam String timeOfDay){
        return  new Greeting("Carla", timeOfDay);
    }

//    EXTENSION 2

    //Celebration DTO:

    @GetMapping(value = "/Christmas")
    public Celebration festiveGreeting(){
        return new Celebration("Merry Christmas");
    }

//    EXTENSIONS DONE





//    Use the current local time:

//    @RequestMapping("/greeting/datetime/")
//    final class DateTimeController {
//
//        @RequestMapping(value = "date", method = RequestMethod.POST)
//        public void processDate(@RequestParam("date") LocalDate date) {
//        }
//
//        @RequestMapping(value = "datetime", method = RequestMethod.POST)
//        public void processDateTime(@RequestParam("datetime") LocalDateTime dateAndTime) {
//        }
//    }


}

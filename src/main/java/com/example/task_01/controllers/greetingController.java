package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/greeting")
public class greetingController {


    @GetMapping
    public String greeting(@RequestParam (value = "name") String name){
        return "Good afternoon " + name + "!";
    }

//    @GetMapping
//    public Celebration newCelebration(){
//        Greet greet = new Greet("",5790 );
//    }

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

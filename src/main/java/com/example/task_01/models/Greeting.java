package com.example.task_01.models;

public class Greeting {

//    PROPERTIES::::::::::

    private String name;
    private String timeOfDay;

//    CONSTRUCTORS:::::::::

    public Greeting(String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    //Empty Constructor:
    public Greeting(){

    }

//    GETTERS + SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}

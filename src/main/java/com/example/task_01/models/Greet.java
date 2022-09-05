package com.example.task_01.models;

public class Greet {

//    PROPERTIES::::::::::

    private String name;
    private int timeOfDay;

//    CONSTRUCTORS:::::::::


    public Greet(String name, int timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greet(){

    }

//    GETTERS + SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(int timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}

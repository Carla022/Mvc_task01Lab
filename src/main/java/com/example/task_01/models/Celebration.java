package com.example.task_01.models;

public class Celebration {
//    PROPERTIES:::::::::
    private String message;

//    CONSTRUCTOR::::::::

    public Celebration(String message){
        this.message = message;
    }

//    Empty constructor:
    public  Celebration(){
    }

//    GETTERS + SETTERS::::::::


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

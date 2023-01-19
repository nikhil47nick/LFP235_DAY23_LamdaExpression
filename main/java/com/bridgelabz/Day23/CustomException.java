package com.bridgelabz.Day23;

public class CustomException extends Exception{
    private final String error;

    public CustomException(){
        error = "Invalid";
    }

    public String getError(){
        return error;
    }

}

package com.bridgelabz.Day23;

public class MoodAnalyzerException extends Exception {

    private String error;
    private String message;


    MoodAnalyzerException(ExceptionCode message){

        this.error = message.getError();
        this.message = message.getName();
    }

    public String getErrorMessage(){
        return message;
    }
}

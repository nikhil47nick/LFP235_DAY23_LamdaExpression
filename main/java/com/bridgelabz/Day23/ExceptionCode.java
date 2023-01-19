package com.bridgelabz.Day23;

public enum ExceptionCode  {
    Null("Happy",null),Empty("Empty","");
    private final String message;
    private final String error;

    ExceptionCode(String message,String error){
        this.error = error;
        this.message = message;
    }

    public String getName(){
        return this.message;
    }
    public String getError(){
        return this.error;
    }
}

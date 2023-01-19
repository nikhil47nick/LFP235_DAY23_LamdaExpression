package com.bridgelabz.Day23;

public class MoodAnalyzer {

    public String analyseMood(String message) {

        try{
        if (message.contains("Happy")) {
            return "Happy";
        } else if (message.contains("Sad")) {
            return "Sad";

        } else if (message.equals(null)) {
           throw new MoodAnalyzerException(ExceptionCode.Null);
        }else if(message.equals("")){
            throw new MoodAnalyzerException(ExceptionCode.Empty);
        }
            return null;
        }catch (MoodAnalyzerException e){
            return e.getErrorMessage();
        }
    }

}

package com.bridgelabz.Day23;


import java.util.regex.Pattern;

public class UserRegistration {

    public static String patterResult(boolean pattern) {
        try {
            PatternCheck p1 = (str)->{
                if (str) {
                    return "Valid";
                } else {
                    throw new CustomException();
                }
            };
            p1.patterResult(pattern);
        return null;
        }catch (CustomException e){
            return e.getError();
        }
    }
    public static String firstNameCheck(String name) throws CustomException {

            boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);

       return patterResult(namePattern);
    }

    public static String lastNameCheck(String name) throws CustomException {
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        return patterResult(namePattern);
    }

    public static String emailCheck(String name) throws CustomException {
        boolean emailPattern = Pattern.matches("^(?=.*[a-z0-9._-])[a-z0-9._-]*[@]{1}(?=.*[a-z0-9.])[a-z0-9.]+[a-z]{2,4}$",name);
        return patterResult(emailPattern);
    }

    public static String phoneNumberCheck(String name) throws CustomException {
        boolean numberPattern = Pattern.matches("^[0-9]{2} [0-9]{10}",name);
        return patterResult(numberPattern);
    }

    public static String passwordCheck(String name) throws CustomException {
        boolean emailPattern = Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^\\d\\w])[A-Za-z0-9#?!@$%^&*-]{8,}",name);
        return patterResult(emailPattern);
    }

}

package com.bridgelabz.Day23;


import com.bridgelabz.Day21.CustomException;
import com.bridgelabz.Day21.UserRegistration;
import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    @Test
    public void testFirstNamePatternInvalid() throws com.bridgelabz.Day21.CustomException {
            com.bridgelabz.Day21.UserRegistration uc = new com.bridgelabz.Day21.UserRegistration();
            Assert.assertEquals("Valid", uc.firstNameCheck("Nikhil"));
    }

    @Test
    public void testLastName()throws com.bridgelabz.Day21.CustomException {
        Assert.assertEquals("Valid", com.bridgelabz.Day21.UserRegistration.lastNameCheck("Joji"));

    }

    @Test
    public void testMobile()throws com.bridgelabz.Day21.CustomException {
        Assert.assertEquals("Valid", com.bridgelabz.Day21.UserRegistration.phoneNumberCheck("91 9001554531"));
    }

    @Test
    public void testPassword()throws com.bridgelabz.Day21.CustomException {
        Assert.assertEquals("Valid", com.bridgelabz.Day21.UserRegistration.passwordCheck("Abc@321in"));
    }
    @Test
    public void testPasswordIvalid()throws CustomException {
        Assert.assertEquals("Invalid", UserRegistration.passwordCheck("Abc"));
    }

}
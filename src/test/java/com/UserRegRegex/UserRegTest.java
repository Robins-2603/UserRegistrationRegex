package com.UserRegRegex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegTest {

    @Test
    public void userFirstNameTestTrue(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.fNameValidate.validateFirstName("Robin");
        } catch (InvalidFirstNameException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void userFirstNameTestFalse() {
        Operations user=new Operations();
        boolean result = false;
        try {
            result = user.fNameValidate.validateFirstName("robin");
        } catch (InvalidFirstNameException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void userLastNameTestTrue(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.lNameValidate.validateLastName("Chandna");
        } catch (InvalidLastNameException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertTrue(result);

    }
    @Test
    public void userLastNameTestFalse(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.lNameValidate.validateLastName("chandna");
        } catch (InvalidLastNameException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void userEmailTestTrue(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.emailIDValidate.validateEmailID("abc@yahoo.com");
        } catch (InvalidEmailIdException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void userEmailTestFalse(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.emailIDValidate.validateEmailID("1@yahoo.com");
        } catch (InvalidEmailIdException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void userMobileTestTrue(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.mobNumberValidate.validateMobNumber("91 9871622190");
        } catch (InvalidMobileNumberException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void userMobileTestFalse(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.mobNumberValidate.validateMobNumber("91  5677885");
        } catch (InvalidMobileNumberException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void userPasswordTestTrue(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.passwordValidate.validatePassword("R@9obins");
        } catch (InvalidPasswordException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void userPasswordTestFalse(){
        Operations user=new Operations();
        boolean result= false;
        try {
            result = user.passwordValidate.validatePassword("robin34");
        } catch (InvalidPasswordException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertFalse(result);
    }
}

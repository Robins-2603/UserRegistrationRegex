package com.UserRegRegex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegTest {

    @Test
    public void userFirstNameTestTrue(){
        Operations user=new Operations();
        boolean result=user.validFirstName("Robin");
        Assertions.assertTrue(result);
    }
    @Test
    public void userFirstNameTestFalse() {
        Operations user=new Operations();
        boolean result = user.validFirstName("robin");
        Assertions.assertFalse(result);
    }
    @Test
    public void userLastNameTestTrue(){
        Operations user=new Operations();
        boolean result=user.validLastName("Chandna");
        Assertions.assertTrue(result);
    }
    @Test
    public void userLastNameTestFalse(){
        Operations user=new Operations();
        boolean result=user.validLastName("chandna");
        Assertions.assertFalse(result);
    }
    @Test
    public void userEmailTestTrue(){
        Operations user=new Operations();
        boolean result=user.validEmailAddress("abc@yahoo.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void userEmailTestFalse(){
        Operations user=new Operations();
        boolean result=user.validEmailAddress("1@yahoo.com");
        Assertions.assertFalse(result);
    }
    @Test
    public void userMobileTestTrue(){
        Operations user=new Operations();
        boolean result=user.validMobile("91 9871622190");
        Assertions.assertTrue(result);
    }
    @Test
    public void userMobileTestFalse(){
        Operations user=new Operations();
        boolean result=user.validMobile("91  5677885");
        Assertions.assertFalse(result);
    }
    @Test
    public void userPasswordTestTrue(){
        Operations user=new Operations();
        boolean result=user.password("Robin$1234");
        Assertions.assertTrue(result);
    }
    @Test
    public void userPasswordTestFalse(){
        Operations user=new Operations();
        boolean result=user.password("Robin$1234");
        Assertions.assertFalse(result);
    }
}

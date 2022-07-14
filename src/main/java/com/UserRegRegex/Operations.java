package com.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    static Scanner sc = new Scanner(System.in);

    public static boolean validFirstName(String name) throws InvalidFirstNameException{

        //String name = sc.next();
        /* regex method for rules:- - First name starts with Cap and has
        minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        if(!b) {
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 chars");
        }
        else
        return true;
    }

    public static boolean validLastName(String lastName) throws InvalidLastNameException {
      //  Scanner sc = new Scanner(System.in);
       // String name = sc.next();

         /* regex method for rules:- - last name starts with Cap and has
        minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        boolean b = m.matches();
        if(!b) {
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        }else
            return true;
    }

    // method for email id
    // Method to check email.
    public static boolean validEmailAddress(String emailId) throws InvalidEmailIdException{
       // System.out.print("Enter the Email Address:  ");
       // String emailId = sc.next();
        /*
        Should clear all email samples

        */
        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        // if condition is to check the email address is valid or not
        if(!result){
            throw new InvalidEmailIdException("enter a valid email address. ");
        }else
            return true;
    }
    public static boolean validMobile(String number) throws InvalidMobileNumberException {
       // Scanner scan=new Scanner(System.in);
        //System.out.print("Enter your mobile number: ");
      //  String number=scan.nextLine();
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(number);
        boolean result=m.matches();
        if(!result){
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code eg:- 91 8764314432");
        }else
            return true;
    }
    public static boolean password(String password) throws InvalidPasswordException {
       // Scanner scan =new Scanner(System.in);
       // System.out.print("Enter your password: ");
        //String password= scan.nextLine();
        String regex="^[A-Z]{1,}[.@#$%^&*_+!-]{1}[0-9]{1,}[A-Za-z0-9]{5,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean result=m.matches();
        if(!result){
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and 1 special character ");
        }else
            return true;

    }
}

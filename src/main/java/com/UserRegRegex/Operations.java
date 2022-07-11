package com.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    static Scanner sc = new Scanner(System.in);

    public static boolean validFirstName(String name) {

        //String name = sc.next();
        /* regex method for rules:- - First name starts with Cap and has
        minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        if(b) {
            System.out.println("You've Entered valid first name");
        }
        else {
            System.out.println("You've Entered invalid first name");
        }
        return b;
    }

    public static boolean validLastName(String lastName) {
      //  Scanner sc = new Scanner(System.in);
       // String name = sc.next();

         /* regex method for rules:- - last name starts with Cap and has
        minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        boolean b = m.matches();
        if(b) {
            System.out.println("You've Entered valid Last name");
        }
        else {
            System.out.println("You've Entered invalid Last name");
        }
        return b;
    }

    // method for email id
    // Method to check email.
    public static boolean validEmailAddress(String emailId){
        System.out.print("Enter the Email Address:  ");
       // String emailId = sc.next();
        /*
        Should clear all email samples

        */
        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        // if condition is to check the email address is valid or not
        if (result)
            System.out.println("Your Email Address is valid");
        else
            System.out.println("Your Email Address is invalid");
        return result;
    }
    public static boolean validMobile(String number){
       // Scanner scan=new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
      //  String number=scan.nextLine();
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(number);
        boolean result=m.matches();
        if(result){
            System.out.println("Mobile number is valid");
        }else{
            System.out.println("Mobile number is invalid");
        }
        return result;
    }
    public static boolean password(String password){
       // Scanner scan =new Scanner(System.in);
        System.out.print("Enter your password: ");
        //String password= scan.nextLine();
        String regex="^[A-Z]{1,}[.@#$%^&*_+!-]{1}[0-9]{1,}[A-Za-z0-9]{5,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean result=m.matches();
        if(result){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid");
        }

        return result;
    }
}

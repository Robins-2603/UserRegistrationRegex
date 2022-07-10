package com.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    static Scanner sc = new Scanner(System.in);

    public static void validFirstName() {

        String name = sc.next();
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
    }

    public static void validLastName() {
      //  Scanner sc = new Scanner(System.in);
        String name = sc.next();

         /* regex method for rules:- - last name starts with Cap and has
        minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        if(b) {
            System.out.println("You've Entered valid Last name");
        }
        else {
            System.out.println("You've Entered invalid Last name");
        }
    }

    // method for email id
    // Method to check email.
    public static boolean validEmailAddress(){
        System.out.print("Enter the Email Address:  ");
        String emailId = sc.next();
        /*
        Should clear all email samples
Sample Emails to Test
A. Valid Emails
• 1. abc@yahoo.com,
• 2. abc-100@yahoo.com,
• 3. abc.100@yahoo.com
• 2. abc111@abc.com,
• 4. abc-100@abc.net,
• 5. abc.100@abc.com.au
• 6. abc@1.com,
• 7. abc@gmail.com.com
• 8. abc+100@gmail.com


B. Invalid Emails (TLD - Top Level Domains)
1. abc – must contains “@” symbol
2. abc@.com.my – tld can not start with dot “.”
3. abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least two
characters
4. abc123@.com – tld can not start with dot “.”
5. abc123@.com.com – tld can not start with dot “.”
6. .abc@abc.com – email’s 1st character can not start with “.”
7. abc()*@gmail.com – email’s is only allow character, digit, underscore and dash
8. abc@%*.com – email’s tld is only allow character and digit
9. abc..2002@gmail.com – double dots “.” are not allow
10. abc.@gmail.com – email’s last character can not end with dot “.”
11. abc@abc@gmail.com – double “@” is not allow
12. abc@gmail.com.1a -email’s tld which has two characters can not contain digit
13. abc@gmail.com.aa.au - cannot have multiple email’s tld
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
    public static void validMobile(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String number=scan.nextLine();
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(number);
        boolean result=m.matches();
        if(result){
            System.out.println("Mobile number is valid");
        }else{
            System.out.println("Mobile number is invalid");
        }
    }
    public static void password(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password= scan.nextLine();
        String regex="^[A-Z]{1,}[.@#$%^&*_+!-]{1}[0-9]{1,}[A-Za-z0-9]{5,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean result=m.matches();
        if(result){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid");
        }

    }
}

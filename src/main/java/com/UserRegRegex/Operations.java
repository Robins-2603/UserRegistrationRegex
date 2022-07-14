package com.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface validFirstName{
    boolean validateFirstName(String message) throws InvalidFirstNameException;
}
interface validLastName{
    boolean validateLastName(String message) throws InvalidLastNameException;
}
interface validEmailId {
    boolean validateEmailID(String message) throws InvalidEmailIdException;
}
interface validMobileNumber{
    boolean validateMobNumber(String message) throws InvalidMobileNumberException;
}
interface validPassword{
    boolean validatePassword(String message) throws InvalidPasswordException;
}

public class Operations {
    static Scanner sc = new Scanner(System.in);

    validFirstName fNameValidate = fName ->{

        if (fName == null) {
            throw new InvalidFirstNameException("Null Pointer Exception");
        } else if (fName.length() == 0) {
            throw new InvalidFirstNameException("Empty Exception ");
        }
        //regex function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean b = m.matches();
        if(!b) {
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 chars");
        }
        else
        return true;
    };

    validLastName lNameValidate = lName -> {
        if (lName == null) {
            throw new InvalidLastNameException("Null Pointer Exception");
        } else if (lName.length() == 0) {
            throw new InvalidLastNameException("Empty Exception ");
        }

         /* regex method for rules:- - last name starts with Cap and has
        minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean b = m.matches();
        if(!b) {
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        }else
            return true;
    };

    // method for email id
    // Method to check email.
    validEmailId emailIDValidate = mailId ->{
        if (mailId == null) {
            throw new InvalidEmailIdException("Null Pointer Exception");
        } else if (mailId.length() == 0) {
            throw new InvalidEmailIdException("Empty Exception ");
        }
        //Regex Expression for EmailId
        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mailId);
        boolean result = m.matches();
        // if condition is to check the email address is valid or not
        if(!result){
            throw new InvalidEmailIdException("enter a valid email address. ");
        }else
            return true;
    };
    validMobileNumber mobNumberValidate = mobNo ->  {

        if (mobNo == null) {
            throw new InvalidMobileNumberException("Null Pointer Exception");
        } else if (mobNo.length() == 0) {
            throw new InvalidMobileNumberException("Empty Exception ");
        }

       // Regex for mobile number
        String regex="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(mobNo);
        boolean result=m.matches();
        if(!result){
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code eg:- 91 8764314432");
        }else
            return true;
    };
    validPassword passwordValidate = password ->  {
        if (password == null) {
            throw new InvalidPasswordException("Null Pointer Exception");
        } else if (password.length() == 0) {
            throw new InvalidPasswordException("Empty Exception ");
        }
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

    };
}

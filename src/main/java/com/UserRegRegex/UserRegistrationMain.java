package com.UserRegRegex;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("-----welcome to User Registration validation System------");
        System.out.println("Enter 1: to validate first name");
        System.out.println("Enter 2: to validate last name");
        System.out.println("Enter 3: to validate Email ID");
        System.out.println("Enter 4: to validate Mobile no");
        System.out.println("Enter 5: to validate password");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                Operations.validFirstName();
                break;
            case 2:
                Operations.validLastName();
                break;
            case 3:
                Operations.validEmailAddress();
                break;
            case 4:
                Operations.validMobile();
                break;
            case 5:
                Operations.password();
                break;
        }
    }
}

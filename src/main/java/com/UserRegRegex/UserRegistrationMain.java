package com.UserRegRegex;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("-----welcome to User Registration validation System------");
        System.out.println("Enter 1: to validate first name");
        System.out.println("Enter 2: to validate last name");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                Operations.validFirstName();
                break;
            case 2:
                Operations.validLastName();
                break;
        }
    }
}

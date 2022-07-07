package com.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {

    public static void validFirstName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
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
}

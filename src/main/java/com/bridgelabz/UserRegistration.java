package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static boolean validFirstName() {
        System.out.println("Enter first name: ");
        String fName = sc.next();
        String regex = "^[A-Z]{1}[a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);
        boolean r = matcher.matches();

        if (r)
            System.out.println("First name is valid.");
        else
            System.out.println("First name is Invalid.");
        return r;
    }

    public static void validLastName() {

        System.out.println("Enter last name: ");
        String lName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lName);
        boolean r = matcher1.matches();

        if (r)
            System.out.println("It is a valid last name.");
        else
            System.out.println("It is invalid last name.");
    }
}
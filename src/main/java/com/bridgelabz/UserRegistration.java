package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    //For user's First name
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

    //For user's last name
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

    //For user's Email Address
    public static void validEmail() {
        System.out.println("Enter your Email: ");
        String email = sc.next();
        String regex2 = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        boolean r = matcher2.matches();

        if (r)
            System.out.println("It is a valid Email.");
        else
            System.out.println("It is invalid Email.");
    }

    //For user's Mobile Number
    public static void validMobileNumber() {
        System.out.println("Enter your mobile number: ");
        String mobileNo = sc.next();
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileNo);
        boolean r = matcher3.matches();

        if (r)
            System.out.println("Mobile Number is valid.");
        else
            System.out.println("Mobile Number is not valid.");
    }
}
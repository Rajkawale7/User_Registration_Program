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

    //For User's password - Rule 1st
    public static void validPasswordRule1(){
        System.out.println("Enter Your Password :  ");
        String password = sc.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        boolean r = matcher4.matches();

        if (r)
            System.out.println("Password is valid");
        else
            System.out.println("Password is not valid");
    }

    //For User's password - Rule 2nd
    public static void validPasswordRule2() {
        System.out.println("Enter The Password At least Eight Character with one Upper case: ");
        String password = sc.nextLine();
        String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean r = matcher5.matches();

        if (r)
            System.out.println("Password is valid");
        else
            System.out.println("Password is not valid");
    }
    //For User's password - Rule 3rd
    public static void validPasswordRule3(){
        System.out.println("Enter The Password At least one Upper case and one numeric");
        String password = sc.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]{1,}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password);
        boolean r = matcher6.matches();

        if (r)
            System.out.println("Password is valid");
        else
            System.out.println("Password is not valid");

    }

    //For User's password - Rule 4th
    public static void validPasswordRule4() {
        System.out.println("Enter the Password At least One Upper Case & One Numeric & One Special Character:");
        String password = sc.nextLine();
        String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password);
        boolean r = matcher7.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    //User case UC-9
    //Regex to check some valid Email Samples
    public static void validEmailSamples() {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        String Email1 = "Rajkawal00@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email1).matches());

        String Email2 = "rajkawale@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email2).matches());

        String Email3 = "raj_kawale@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email3).matches());

        String Email4 = "712@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email4).matches());

        String Email5 = "712@gmail.";
        System.out.println(Pattern.compile(regex).matcher(Email5).matches());

        String Email6 = "RAJ712@GMAIL.COM";
        System.out.println(Pattern.compile(regex).matcher(Email6).matches());
    }
}
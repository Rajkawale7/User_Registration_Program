package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    //For user's First name
    public static void validateFirstName() {

        System.out.println("Enter first name: ");
        String fName = sc.next();
        String regex = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);
        boolean r = matcher.matches();

        if (r)
            System.out.println("It is a valid first name.");
        else
            System.out.println("It is invalid first name.");
    }

    //For user's last name
    public static void validLastName() {

        System.out.println("Enter last name: ");
        String lName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]*";
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

    //***Methods For Test cases***//
    //Method for first test case on User's first name.
    public boolean validFirstName(String fName) {
        String regex1 = "^[A-Z]{1}[a-z]*";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(fName);
        boolean r1 = matcher1.matches();
        return r1;
    }

    //Method for first test case on User's Last name.
    public boolean validateLastName(String lName) {
        String regex2 = "^[A-Z]{1}[a-z]*";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(lName);
        boolean r2 = matcher2.matches();
        return r2;
    }

    //Method for first test case on User's EmailId.
    public boolean validateEmail(String email) {
        String regex3 = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(email);
        boolean r3 = matcher3.matches();
        return r3;
    }

    //Method for first test case on User's Mobile Number.
    public boolean validateMobileNumber(String mobileNo) {
        String regex4 = "(0|91)?[7-9][0-9]{9}";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(mobileNo);
        boolean r4 = matcher4.matches();
        return r4;
    }

    //Method for first test case on User's Password.
    public boolean validatePassword(String userPassword) {
        String regex5 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(userPassword);
        boolean r5 = matcher5.matches();
        return r5;
    }

    //***   Methods For Exception Handling cases   ***//
    //Method for Handling first Exception case on User's first name

    private static final String regex = "^[A-Z]{1}[a-z]*";
    public boolean validateFirstName(String fName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex);
        if (Pattern.matches(regex, fName) == true)
            return Pattern.matches(regex, fName);
        else {
            throw new UserRegistrationException("Please, Enter valid First Name");
        }
    }

    //Method for Handling Second Exception case on User's Last name
    private static final String regex2 = "^[A-Z]{1}[a-z]*";
    public boolean validatelastName(String lName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex2);
        if (Pattern.matches(regex2, lName) == true)
            return Pattern.matches(regex2, lName);
        else {
            throw new UserRegistrationException("Please, Enter valid Last Name");
        }
    }

    //Method for Handling Third Exception case on User's Email format
    private static final String regex3 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
    public boolean validateEmailID(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex3);
        if (Pattern.matches(regex3, email) == true)
            return Pattern.matches(regex3, email);
        else {
            throw new UserRegistrationException("Please, Enter valid Email ID");
        }
    }

    //Method for Handling Fourth Exception case on User's Mobile Number.
    private static final String regex4 = "(91|0)?\\s?[6-9][0-9]{9}$";
    public boolean validateMobileNo(String mobileNo) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex4);
        if (Pattern.matches(regex4, mobileNo) == true)
            return Pattern.matches(regex4, mobileNo);
        else {
            throw new UserRegistrationException("Please, Enter valid mobile number");
        }
    }

    //Method for Handling Fourth Exception case on User's Mobile Number.
    private static final String regex5 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
    public boolean validatePasswordRule4(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex5);
        if (Pattern.matches(regex5, password) == true)
            return Pattern.matches(regex5, password);
        else {
            throw new UserRegistrationException("Please Enter valid password as per given rules" );
        }
    }
}
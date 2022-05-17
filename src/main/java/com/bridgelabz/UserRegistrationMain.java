package com.bridgelabz;
import java.util.Scanner;
public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("****Welcome to the User Registration Program****");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate User Email_Id ");
        System.out.println("Enter 4 : to validate User Mobile Number ");
        System.out.println("Enter 5 : to validate User Password with given Rule 1 ");

        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmail();
                break;

            case 4 :
                UserRegistration.validMobileNumber();
                break;

            case 5 :
                UserRegistration.validPasswordRule1();
                break;

            default:
                System.out.println("Enter valid input.");
        }
    }
}

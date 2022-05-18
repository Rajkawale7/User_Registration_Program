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
        System.out.println("Enter 5 : to validate User Password as per given Rule 1 ");
        System.out.println("Enter 6 : to validate User Password as per given Rule 2 ");
        System.out.println("Enter 7 : to validate User Password as per given Rule 3 ");
        System.out.println("Enter 8 : to validate User Password as per given Rule 4 ");
        System.out.println("Enter 9 : to check some valid email samples ");

        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validateFirstName();
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

            case 6 :
                UserRegistration.validPasswordRule2();
                break;

            case 7 :
                UserRegistration.validPasswordRule3();
                break;

            case 8 :
                UserRegistration.validPasswordRule4();
                break;

            case 9 :
                UserRegistration.validEmailSamples();
                break;

            default:
                System.out.println("Enter valid input.");
        }
    }
}

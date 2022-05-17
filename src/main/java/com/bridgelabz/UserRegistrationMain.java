package com.bridgelabz;
import java.util.Scanner;
public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("****Welcome to the User Registration Program****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");

        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
                break;
            default:
                System.out.println("Enter valid input.");
        }
    }
}

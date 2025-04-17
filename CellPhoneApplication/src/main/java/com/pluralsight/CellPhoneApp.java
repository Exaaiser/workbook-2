package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {

        Scanner otherPhone= new Scanner(System.in);


        CellPhone cellPhone = new CellPhone(1111, "Iphone X","AT&T", "800-555-5555","Ozan Gul");

        System.out.println("Serial Number is: " +cellPhone.getSerialNumber());

        System.out.println("Model: " +cellPhone.getModel());

        System.out.println("Phone operator: " +cellPhone.getCarrier());

        System.out.println("Phone number: " +cellPhone.getNumber());

        System.out.println("Owner of the phone: " +cellPhone.getOwner());

        System.out.print("Do you want to add a new phone? (yes/no): ");
        String response = otherPhone.nextLine();
        CellPhone newPhone = new CellPhone();
        if (response.equals("yes")) {
            int randomSerialNumber = (int) Math.random();
            newPhone.setSerialNumber(randomSerialNumber);

            System.out.print("Enter the phone model (e.g., iPhone 14): ");
            String model = otherPhone.nextLine();
            newPhone.setModel(model);

            System.out.print("Enter the carrier (e.g., Verizon): ");
            String carrier = otherPhone.nextLine();
            newPhone.setCarrier(carrier);

            System.out.print("Enter the phone number (e.g., 800-555-5678): ");
            String number = otherPhone.nextLine();
            newPhone.setNumber(number);

            System.out.print("Enter the owner of the phone: ");
            String owner = otherPhone.nextLine();
            newPhone.setOwner(owner);

            System.out.println("New Phone Added Successfully!");
            System.out.println("Serial Number is: " + newPhone.getSerialNumber());
            System.out.println("Model: " + newPhone.getModel());
            System.out.println("Phone operator: " + newPhone.getCarrier());
            System.out.println("Phone number: " + newPhone.getNumber());
            System.out.println("Owner of the phone: " + newPhone.getOwner());
        } else {
            System.out.println("Thanks for answer.Goodbye!");


        }

    }
}

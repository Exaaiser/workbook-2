package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What date will you be coming (MM/DD/YYYY): ");
        String date = scanner.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println(tickets + " tickets reserved for " + date + " under " + lastName + ", " + firstName);
    }
}

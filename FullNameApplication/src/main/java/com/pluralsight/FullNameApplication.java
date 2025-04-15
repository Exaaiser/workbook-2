package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String firstName= scanner.next();

        System.out.println("Please enter your middle name");
        String middleName = scanner.next();

        System.out.println("Please enter your last name");
        String lastName = scanner.next();

        String input = firstName + " " + middleName + " " + lastName;
        String[] names = input.split(" ");
        String[] cities = input.split("\\|");

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


} }

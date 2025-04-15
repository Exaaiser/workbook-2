package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim();


        String[] nameParts = input.split("\\");


        if (nameParts.length == 2) { // "first last" formatı
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: ");
            System.out.println("Last name: " + nameParts[1]);
        } else if (nameParts.length == 3) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);
    }
} }

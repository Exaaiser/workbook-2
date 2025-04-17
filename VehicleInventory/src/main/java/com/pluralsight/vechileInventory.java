package com.pluralsight;

import java.util.Scanner;

public class vechileInventory {
    vehicle[] vehicles;
    int counter;
    Scanner scanner;

    vechileInventory() {
        scanner = new Scanner(System.in);
        vehicles = new vehicle[20];
        counter = 6;

    vehicles[0] = new vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
    vehicles[1] = new vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
    vehicles[2] = new vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
    vehicles[3] = new vehicle(101124, "Honda Civic", "White", 70000, 7500);
    vehicles[4] = new vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
    vehicles[5] = new vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
}






}

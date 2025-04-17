package com.pluralsight;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();

        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        int i = 0;

        do {
            roll1 = random.nextInt(6) + 1;
            roll2 = random.nextInt(6) + 1;
            int sum = roll1 + roll2;

            System.out.println("Roll " + (i + 1) + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }

            i++;
        } while (i < 100);

        System.out.println("--- Results ---");
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);
    }
}

package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine();

        System.out.print("Please enter your side: ");
        String team = scanner.nextLine();

        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        System.out.println("Winner: " + (score1 > score2 ? teams[0] : teams[1]));

    }
}

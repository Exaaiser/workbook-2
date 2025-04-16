package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String userInput = scanner.nextLine();

        System.out.print("Please enter your side: ");
        String team = scanner.nextLine();

        String[] inputSplit = userInput.split(Pattern.quote("|"));

        String team = inputSplit[0].split(Pattern.quote(":"));
        String home = team[0];


        String[] parts = input.split("\\|//");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        System.out.println("Winner: " + (score1 > score2 ? teams[0] : teams[1]));

    }
}

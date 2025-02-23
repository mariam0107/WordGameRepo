package com.mariam.wordgame;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] words = {"java", "programming", "class", "computer", "method"};
        Scanner scan = new Scanner(System.in);
        boolean shouldPlayAgain = false;
        int wins = 0;
        int losses = 0;

        do {
            WordGuessingGame game = new WordGuessingGame(words, 10);
            String result = game.play();
            if (result.equals("Win")) {
                wins += 1;
            } else {
                losses += 1;
            }
            System.out.println("Wins: " + wins + ",Losses: " + losses);
            System.out.println("Would you like to play again? (y/n): ");
            char playAgain = scan.nextLine().toLowerCase().charAt(0);
            shouldPlayAgain = playAgain == 'y';
        } while (shouldPlayAgain);
    }
}

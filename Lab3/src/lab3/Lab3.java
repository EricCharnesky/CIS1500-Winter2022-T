package lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play a game (y/n)?");
        String play = keyboard.nextLine();

        while (play.equalsIgnoreCase("y")) {
            System.out.println("How high of a number do you want to guess?");
            int maxNumber = Integer.parseInt(keyboard.nextLine());

            int randomNumber = (int) (Math.random() * maxNumber + 1);
            
            System.out.println("Guess a number 1 - " + maxNumber);
            int guess = Integer.parseInt(keyboard.nextLine());
            int numberOfGuesses = 1;

            while (guess != randomNumber) {
                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                System.out.println("Guess a number 1 - " + maxNumber);
                guess = Integer.parseInt(keyboard.nextLine());
                numberOfGuesses++;
            }

            System.out.println("You guessed it in " + numberOfGuesses + " guesses!");

            System.out.println("Do you want to play again (y/n)?");
            play = keyboard.nextLine();
        }

        System.out.println("Have a nice day!");

    }

}

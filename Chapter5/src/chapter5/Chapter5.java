package chapter5;

import java.util.Scanner;

public class Chapter5 {

    public static void main(String[] args) {
        printHello(); // nice name for a chunk of code
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("Hi there " + name);
        printHello(); // it's repeatable

        numberGuessingGame();
    }
    
    public static void numberGuessingGame(){
        String play = askTheUserIfTheyWantToPlay();

        while (play.equalsIgnoreCase("y")) {

            int maxNumber = askTheUserForTheMaxValue();
            int randomNumber = (int) (Math.random() * maxNumber + 1);

            int guess = askTheUserToGuess(maxNumber);
            int numberOfGuesses = 1;

            while (guess != randomNumber) {
                displayTooHighOrTooLow(guess, randomNumber);
                guess = askTheUserToGuess(maxNumber);
                numberOfGuesses++;
            }
            System.out.println("You guessed it in " + numberOfGuesses + " guesses!");
            play = askTheUserIfTheyWantToPlay();
        }
        System.out.println("Have a nice day!");
    }

    public static void displayTooHighOrTooLow(int guess, int randomNumber) {
        if (guess < randomNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }

    public static int askTheUserToGuess(int maxNumber) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number 1 - " + maxNumber);
        int guess = Integer.parseInt(keyboard.nextLine());
        return guess;
    }

    public static int askTheUserForTheMaxValue() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How high of a number do you want to guess?");
        int maxNumber = Integer.parseInt(keyboard.nextLine());
        return maxNumber;
    }

    public static String askTheUserIfTheyWantToPlay() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play a game (y/n)?");
        String play = keyboard.nextLine();
        return play;
    }

    public static void printHello() {
        System.out.println("Hello, I am a computer.");
        System.out.println("It is nice to meet you.");
        System.out.println("Hope you are having a nice Tuesday!");
    }

}

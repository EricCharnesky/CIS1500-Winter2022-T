package lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // ask the user if they want to play RPS ( y/n )
        System.out.println("Do you want to play RPS (y/n)");

        String answer = keyboard.nextLine();

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Do you throw Rock Paper or Scissors?");
            String choice = keyboard.nextLine();

            if (choice.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
            } else if (choice.equalsIgnoreCase("scissors")) {
                System.out.println("you lose!");
            } else if (choice.equalsIgnoreCase("rock")) {
                System.out.println("You tie!");
            } else {
                System.out.println("That's not Rock, Paper, or Scissors...");
            }

            System.out.println("Do you want to play again? (y/n)");
            answer = keyboard.nextLine();

        }

        // loop if want to play
        // if yes
        // computer is rock
        // ask the player for Rock Paper or Scissors
        // compare if win, lose, or draw
        // win is if player is paper
        // lose is if player is scissors
        // draw is if player is rock
        // ask if they want to play again ( y/n )
    }

}

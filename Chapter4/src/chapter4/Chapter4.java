package chapter4;

import java.util.Scanner;

public class Chapter4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String play = "y";
        while (play.equalsIgnoreCase("y")) {

            int computerPick = (int) (Math.random() * 3 + 1);
            // 1 - rock
            // 2 - paper
            // 3 - scissors

            System.out.println("Let's play RPS:\n1 for rock"
                    + "\n2 for paper\n3 for scissors");
            int userPick = Integer.parseInt(keyboard.nextLine());

            //      and
            // true && true == true
            // true && false == false
            // false && true == false
            // false && false == false
            //      or
            // true || true == true
            // true || false == true
            // false || true == true
            // false || false == false
            if (computerPick == userPick) {
                System.out.println("You tie!");
            } else if (userPick == 1 && computerPick == 3
                    || userPick == 2 && computerPick == 1
                    || userPick == 3 && computerPick == 2) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // slow way without logical operators and or
            /*
            if ( userPick == 1){
                if ( computerPick == 1){
                    System.out.println("you tie");
                } else if ( computerPick == 2 ){
                    System.out.println("you lose");
                }
                else {
                    System.out.println("You win");
                }
            } else if ( userPick == 2 ).....
             */
            // valid code 
            if (userPick == 1) // the first line after an if belongs to the if
            {
                System.out.println("you win"); // don't do this without curly braces
            }
            System.out.println("another line that isn't attached");

            System.out.println("Do you want to play again? (y/n)");
            play = keyboard.nextLine();
        }

        System.out.println("What game should we play for a snow day?");
        System.out.println("Halo");
        System.out.println("Super Smash Bros");
        System.out.println("Mario Kart");
        System.out.println("Fortnite");
        System.out.println("JackBox");

        String choice = keyboard.nextLine();
        switch (choice.toLowerCase()) { // checking for case is important
            case "halo":
                System.out.println("One vote for Halo");
                break;
            case "super smash bros":
                System.out.println("One vote for SSB");
                break;
            case "mario kart":
                System.out.println("One vote for Mario Kart");
                break;
            case "fortnite":
                System.out.println("One vote for fortnite!");
                break;
            case "jackbox":
                System.out.println("One vote for Jackbox");
                break;
            default:
                System.out.println("That's not a valid vote");
        }

        System.out.println("Enter the day of the week number 1-7");
        int dayOfWeek = Integer.parseInt(keyboard.nextLine());

        switch (dayOfWeek) { // as soon as it matches a case, all code runs until break
            case 1:
            //System.out.println("Monday");
            case 2:
            //System.out.println("Tuesday");
            case 3:
            //System.out.println("Wendesday");
            case 4:
            //System.out.println("Thursday");
            case 5:
                System.out.println("Is it the weekend yet?");
                break;
            case 6:
            case 7:
                System.out.println("Weekend yay!");
                break;
        }

        int number = 0; // pre test loop - tests before running
        while (number < 10) { // be sure to always change what is being evaluated in the loop
            System.out.println(number);
            number++;
        }

        // will run at least once - post test loop - tests after running
        int anotherNumber = 0;
        do {
            System.out.println(anotherNumber);
            anotherNumber++;
        } while (anotherNumber < 10); // ends with a semi colon, WTF?!?

        // initalize; condition; update
        for (int count = 0; count < 10; count++) { // loop header
            System.out.println(count);
        } // runs the update section, then checks the condition

        System.out.println("What do you want for dinner, Pizza or Burgers?");
        String dinner = keyboard.nextLine();

        // input validation loop
        // ! is not - flips the result
        while (!dinner.equalsIgnoreCase("pizza")
                && !dinner.equalsIgnoreCase("burgers")) {
            System.out.println("Unrecognized input, try again");
            System.out.println("What do you want for dinner, Pizza or Burgers?");
            dinner = keyboard.nextLine();
        }

        System.out.println("Enter a time between 6-10");
        int time = Integer.parseInt(keyboard.nextLine());

        // loop runs if it's too low or too high
        while (time < 6 || time > 10) {
            System.out.println("Invalid response");
            System.out.println("Enter a time between 6-10");
            time = Integer.parseInt(keyboard.nextLine());
        }

        // while ( !classToTake.equalsIgnoreCase("STOP") )
        while (true) { // don't try this at home kids
            System.out.println("Enter a class you want to take or STOP");
            String classToTake = keyboard.nextLine();
            if (classToTake.equalsIgnoreCase("STOP")) {
                break; // ends a loop - hard stop
            }
        }

        int sum = 0;
        while (sum < 100) {
            System.out.println("Enter a value to sum");
            int value = Integer.parseInt(keyboard.nextLine());
            if (value < 0) {
                continue; // jumps back to the loop header
            }
            sum += value;
        }

        for (int myNumber = 1; myNumber <= 10; myNumber++) {
            if (myNumber % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println(myNumber);

            // if ( myNumber % 2 == 1 ) {
            //    System.out.println(myNumber);
            //}
        }

        for (int hour = 0; hour < 24; hour++) { // for every run of the outer loop
            for (int minute = 0; minute < 60; minute++) { // the inner loop runs start to finish
                System.out.println(hour + ":" + minute);
            }
        }
        
        System.out.println("Enter the size square to print");
        int size = Integer.parseInt(keyboard.nextLine());
        
        for ( int row = 0; row < size; row++ ){
            for ( int col = 0; col < size; col++ ){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

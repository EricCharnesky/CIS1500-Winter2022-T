package week2;

import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        // TODO code application logic here

        int numberToGuess; // delcares a variable

        System.out.println("Hi there!");

        int myFavoriteNumber = 42;

        int maxNumber = Integer.MAX_VALUE;

        System.out.println("Max Int is: " + maxNumber);

        maxNumber = maxNumber + 1;

        System.out.println("Max Int is: " + maxNumber);

        double numberWithDecimals = 7.7;
        float smallerNumberWithDecimals = 7.7f;  // I hate floats for this reason

        char myFirstInitial = 'E'; // apostrophe instead of quote

        String lotsOfCharacters = "Eric";

        numberToGuess = 57;  // instantiates the variable

        System.out.println(lotsOfCharacters + "'s favorite number is: "
                + myFavoriteNumber);

        int firstNumber = 10;
        int secondNumber = 17;

        int result = firstNumber + secondNumber - myFavoriteNumber;

        System.out.println("Some math gave us: " + result);

        System.out.println("42 * 27 = : " + 42 * 27);

        // declares and instatiates a Scanner object
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = keyboard.nextLine(); // gives a string of text

        System.out.println("Hi there " + name + "!");

        System.out.println(name + ", Enter the first number to add: ");

        // converts the string input into an integer
        int yourFirstNumber = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the second number to add: ");
        String input = keyboard.nextLine();
        int yourSecondNumber = Integer.parseInt(input);

        int anotherNumber = Integer.parseInt("42");

        System.out.println("The result is: " + (yourFirstNumber + yourSecondNumber));

        System.out.println("Please enter the number of hours you worked this week: ");
        double hoursWorked = Double.parseDouble(keyboard.nextLine());

        System.out.println("Please enter your hourly pay rate: ");
        double payRate = Double.parseDouble(keyboard.nextLine());

        double grossPay = hoursWorked * payRate;

        System.out.println("Your gross pay is: $" + grossPay);

        System.out.println("Good news, you get a $1/hour raise!");

        payRate += 1; // short hand for payRate = payRate + 1;

        // very different from - this is bad!
        // payRate = +1;

        /*
        multi line comments, you probably did something wrong
        why so many words?
         */
        //                     backslash  \ is the escape sequence or character
        System.out.println("Integer division is \"fun\" in java!");

        // integer divided by integer == integer result ( no remainder )
        System.out.println("Your first number divided \\ by the "
                + "second is ( as an integer ): "
                + yourFirstNumber / yourSecondNumber);

        System.out.println("If you want a decimal result, "
                + "you need at least 1 operand to be a double");

        System.out.println("Your first number divided by the second"
                + " ( without integer division ) is: "
                + (double) yourFirstNumber / yourSecondNumber);
        // casts a value as the type in parenthesis

        System.out.print("THis is using the System.out.print command");
        System.out.print("The next time you use print or println, it won't be down a line");
        System.out.print("\nUnless you add your own \"\\n\" newline break");

        // boolean expression goes inside the ( ) - something that is True or False
        // == is checking for equals
        if (yourFirstNumber == myFavoriteNumber) {
            System.out.println("Wow that's my favorite number!");
        } else { // else is optional
            System.out.println("You didn't guess my number!");
        }

        System.out.println("Please enter your percentage score: ");
        int percentageScore = Integer.parseInt(keyboard.nextLine());

        // a chain of if, else if, else if, are mutually exclusive, only 1 will run
        if (percentageScore >= 94) {
            System.out.println("You got an A!");
        } else if (percentageScore >= 90) {
            System.out.println("You got an A-");
        } else if (percentageScore >= 87) {
            System.out.println("You got a B+");
        } else if (percentageScore >= 84) {
            System.out.println("You got a B");
        } else if (percentageScore >= 80) {
            System.out.println("You got a B-");
        } else if (percentageScore >= 77) {
            System.out.println("You got a C+");
        } else if (percentageScore >= 74) {
            System.out.println("You got a C");
        } else if (percentageScore >= 70) {
            System.out.println("You got a C-");
        } else if (percentageScore >= 67) {
            System.out.println("You got a D+");
        } else if (percentageScore >= 64) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got an F");
        }

        // tell the user what you expect them to enter
        System.out.println("Do you want to play a game? (y/n)");
        String userInput = keyboard.nextLine();
        // can't use == for strings
        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Guess a number 1-100!");
            int guess = Integer.parseInt(keyboard.nextLine());

            // if the epxression is true, run everything in the { }
            // if the expression is false, it doesn't run
            while (guess != 42) {
                if (guess < 42) {
                    System.out.println("Too low! Guess again!");
                } else if (guess > 42) {
                    System.out.println("Too high! Guess again!");
                }
                guess = Integer.parseInt(keyboard.nextLine());
            } // go back to the while expression

        } else {
            System.out.println("You are no fun!");
        }
        
        
        
        // ask the user if they want to play RPS ( y/n )
        
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

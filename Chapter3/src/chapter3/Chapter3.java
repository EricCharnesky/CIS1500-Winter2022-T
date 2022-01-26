package chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        byte single8BitNumber = 100;

        // underscore for digit groups is optional, but recommended
        short smallInts = 30_000;

        int someWholeNumber = 42;
        
        // invalid, larger types can't fit in smaller types
        // short intsDontFit = someWholeNumber;

        long reallyBigIntegers = 9_223_372_036_854_775_807l; // needs an lower case L

        float smallerNumbersWithDecimals = 7.7f; // include the f for float

        double someNumberWithADecmial = 7.7;

        char singleCharacter = 'E'; // actuall a number - 69

        char captitalA = 65;

        boolean valueThatIsTrueOrFalse = true;

        // java is bad at math relating to decimal places
        double sum = smallerNumbersWithDecimals
                + someNumberWithADecmial + someWholeNumber
                + smallInts;

        System.out.println(sum);

        char firstLetter = 'E';
        char secondLetter = 'r';
        char thirdLetter = 'i';
        char fourthLetter = 'c';

        // arithmetic works on char because they are really numbers
        firstLetter += 1;
        secondLetter++; // same as above - post incriment operator
        thirdLetter = (char) (thirdLetter + 1); // the classic slow way
        ++fourthLetter; // pre-incriment operator

        System.out.print(firstLetter);
        System.out.print(secondLetter);
        System.out.print(thirdLetter);
        System.out.println(fourthLetter);

        int first = 10, second = 20; // not recommended

        final double PI = 3.14159; // allowed to set once and only once
        // PI = 22/7; // can't change a final value
        
        // uses all upper case and underscores to separate words in final variables
        final int SPEED_OF_LIGHT_IN_METERS_PER_SECOND = 299_792_458;

        System.out.print("10 / 3 == ");
        System.out.print(10 / 3); // integer division - lose any decimal
        System.out.println(" Remainder: " + 10 % 3); // remainder or modulus operator

        
        System.out.println("Math.ceil(10/3) == " + Math.ceil(10/3));
        System.out.println("Math.ceil(10.0/3) == " + Math.ceil(10.0/3));
        
        // if either side of an operation is a double, the answer is a double
        System.out.println("10 / 3 == " + 10.0 / 3 );
        
        System.out.println("10 / 3 rounded == " + Math.round(10.0/3));
        
        // Math.random() gives between 0 and 1, not includ 1
        // multipy by the largest value we want, and add 1
        // not actually random, be careful
        System.out.println("Random number 1-100: " + Math.round(Math.random() * 100 + 1));
        
        final double MICHIGAN_SALES_TAX_RATE = .06; // best practice to use names for constants
        
        System.out.println("Enter the price of an item: ");
        double price = Double.parseDouble(keyboard.nextLine());
        
        double salesTax = price * MICHIGAN_SALES_TAX_RATE;
        
        double totalPrice = price + salesTax;
        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        
        System.out.println("Total Price: " + currencyFormatter.format(totalPrice));
        System.out.println("Total Price: " + 
                NumberFormat.getCurrencyInstance().format(totalPrice));
        
        
        
        
        
        // write a number guessing game
        
        // ask if they want to play a game
        
        // play again loop starts
        
        // ask the user how high of a number they want to guess
        // generate a random number 1-that number
        
        // then keep track of how many guesses it takes to guess the right answer
        // ask them to guess a number between 1-that number
        
        // if they guessed it right, tell them they got it right in X guesses
        // otherwise, tell them if it was too high or too low and let them guess again
        
        // loop runs as long as it is NOT a correct guess
        
        // ask if they want to play again , loop the whole thing over again
        
        
    }

}

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
            } else if ( userPick == 1 && computerPick == 3 
                    || userPick == 2 && computerPick == 1
                    || userPick == 3 && computerPick == 2 ){
                System.out.println("You win!");
            } else{
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
            if ( userPick == 1 ) // the first line after an if belongs to the if
                System.out.println("you win"); // don't do this without curly braces
                System.out.println("another line that isn't attached");
            
            System.out.println("Do you want to play again? (y/n)");
            play = keyboard.nextLine();
        }

    }

}

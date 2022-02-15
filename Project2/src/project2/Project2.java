package project2;

import java.util.Scanner;

public class Project2 {

    // class level variable, accessible EVERYWHERE in the class
    static int energy = 10;
    static int numberOfTurns = 0;

    public static void main(String[] args) {
        displayIntroStory();

        String action = askTheUserWhatTheyWantToDo();

        while (!action.equalsIgnoreCase("get me out of here!")) {
            doAction(action);
            action = askTheUserWhatTheyWantToDo();
        }

        System.out.println("Congrats you escaped our terrible game!");
        System.out.println("It took you " + numberOfTurns + " to get out!");
    }

    public static void doAction(String action) {
        numberOfTurns++;
        if (action.equalsIgnoreCase("help")) {
            displayHelp();
            numberOfTurns--;
        } else if (action.equalsIgnoreCase("sleep")) {
            energy = 10;
            System.out.println("You sleep and wake up feeling energized");
        } else if (action.equalsIgnoreCase("jump")) {
            System.out.println("You jump and land on your ankle funny, ow!");
        } else if (action.equalsIgnoreCase("hide")) {
            System.out.println("You hide from your shadow!");
        } else if (action.equalsIgnoreCase("eat")) {
            System.out.println("You eat some stale biscuts!");
        } else if (action.equalsIgnoreCase("go north")) {
            if (hasEnoughEnergy()) {
                System.out.println("you go north into the forest");
                energy -= 1;
            }
        } else if (action.equalsIgnoreCase("go east")) {
            if (hasEnoughEnergy()) {
                System.out.println("you go east into the mountains");
                energy -= 1;
            }
        } else if (action.equalsIgnoreCase("go south")) {
            if (hasEnoughEnergy()) {
                System.out.println("you go south into the lake");
                energy -= 1;
            }
        } else if (action.equalsIgnoreCase("go west")) {
            if (hasEnoughEnergy()) {
                System.out.println("you go west into the plains");
                energy -= 1;
            }
        } else {
            System.out.println("You can't do that right now");
            numberOfTurns--;
        }
    }

    public static void displayHelp() {
        System.out.println("You can: go north, go east, go south, "
                + "go west, jump, sleep, hide, eat");
    }

    public static void displayIntroStory() {
        System.out.println("Welcome to our terrible game,"
                + " you wake up in the woods and don't remember anything!");
    }

    public static String askTheUserWhatTheyWantToDo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to do?");
        return keyboard.nextLine();
    }

    public static boolean hasEnoughEnergy() {
        if (energy > 0) {
            return true;
        }

        System.out.println("you are too tired to do that, you need to sleep");
        return false;
    }

}

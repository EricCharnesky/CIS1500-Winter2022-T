package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println(name + ", what kind of Knish do you want to make? "
                + "Potato, Beef, or Chicken");

        String choice = keyboard.nextLine();

        System.out.println(name + ", how many people are coming to the party?");
        int numberOfGuests = Integer.parseInt(keyboard.nextLine());

        int packsOfPuffPastry = (int) Math.ceil(numberOfGuests / 4.0);

        if (choice.equalsIgnoreCase("potato")) {

            int poundsOfPotato = (int) Math.ceil(numberOfGuests / 3.0);
            System.out.println(name + ", you need to buy " + packsOfPuffPastry
                    + " packs of puff pastry and " + poundsOfPotato
                    + " pounds of potato");

        } else if (choice.equalsIgnoreCase("beef")) {

            int poundsOfBeef = (int) Math.ceil(numberOfGuests / 5.0);
            System.out.println(name + ", you need to buy " + packsOfPuffPastry
                    + " packs of puff pastry and " + poundsOfBeef
                    + " pounds of beef");

        } else if (choice.equalsIgnoreCase("chicken")) {

            int packsOfChicken = (int) Math.ceil(numberOfGuests / 6.0);
            System.out.println(name + ", you need to buy " + packsOfPuffPastry
                    + " packs of puff pastry and " + packsOfChicken
                    + " packs of chicken breast");

        } else {
            System.out.println(name + ", I don't know how to make that, try again");
        }
    }

}

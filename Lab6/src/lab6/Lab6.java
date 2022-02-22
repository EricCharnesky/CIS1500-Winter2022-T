package lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your animals name?");
        String name = keyboard.nextLine();

        System.out.println("What color is it?");
        String color = keyboard.nextLine();

        System.out.println("What noise does it make?");
        String noiseToMake = keyboard.nextLine();

        TalkingStuffedAnimal animal = new TalkingStuffedAnimal(name, color, noiseToMake);
        while (animal.doesBatteryHasPower()) {
            System.out.println(animal.squeeze());
        }
    }

}


package chapter7classes;

import java.util.Scanner;

public class Chapter7Classes {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the kind of beverage");
        String beverage = keyboard.nextLine();
        
        Can coke = new Can();
        coke.setBeverage(beverage);
        coke.setMaximumVolumeInMililiters(355);
        coke.setCurrentVolumeInMililiters(0);
        printCan(coke);
        
        // use the parametized constructor
        Can cokeZero = new Can(355, 355, "Coke zero" );
        printCan(cokeZero);
        
        while ( cokeZero.getCurrentVolumeInMililiters() != 0 ){
            cokeZero.drink((int)(Math.random() * 20 + 1));
            printCan(cokeZero);
        }
        
        Can dietCoke = new Can();
        printCan(dietCoke);
        // with our constructor, we don't get null and it doesn't crash
        if ( dietCoke.getBeverage().equals("coke zero")){
            System.out.println("Yum");
        }
    }
    
    public static void printCan(Can can){
        System.out.println("Can of " + can.getBeverage()
                + " current volume: " + can.getCurrentVolumeInMililiters());
        
    }
    
}

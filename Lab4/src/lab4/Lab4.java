package lab4;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String shape = "";
        while (!shape.equalsIgnoreCase("square")
                && !shape.equalsIgnoreCase("rectangle")
                && !shape.equalsIgnoreCase("triangle")) {
            System.out.println("Please enter a shape to print, Sqaure,"
                    + " Rectangle, or Triangle");
            shape = keyboard.nextLine();
        }

        if (shape.equalsIgnoreCase("square")) {
            System.out.println("Enter the size square to print");
            int size = Integer.parseInt(keyboard.nextLine());

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if ( shape.equalsIgnoreCase("rectangle")){
            System.out.println("Enter the length of the rectangle to print");
            int length = Integer.parseInt(keyboard.nextLine());
            
            System.out.println("Enter the width of the rectangle to print");
            int width = Integer.parseInt(keyboard.nextLine());

            // just for fun
            if ( width > length ){
                int oldWidth = width;
                width = length;
                length = oldWidth;
            }
            
            for (int row = 0; row < width; row++) {
                for (int col = 0; col < length; col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            
        } else if ( shape.equalsIgnoreCase("triangle") ) {
            System.out.println("Enter the height triangle to print");
            int height = Integer.parseInt(keyboard.nextLine());

            // start row as 1, so col < row the first time for the 1 star row
            for (int row = 1; row <= height; row++) {
                for (int col = 0; col < row; col++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }

}

package lab5;

import java.util.Scanner;

public class Lab5 {

    // started from https://github.com/EricCharnesky/CIS1500-Winter2022-T/blob/main/Lab4/src/lab4/Lab4.java
    public static void main(String[] args) {
        String shape = promptForShape();

        if (shape.equalsIgnoreCase("square")) {
            int size = promptForIntValue("Enter the size square to print");
            printSquare(size);
        } else if (shape.equalsIgnoreCase("rectangle")) {
            int length = promptForIntValue("Enter the length of the rectangle to print");
            int width = promptForIntValue("Enter the width of the rectangle to print");
            printRectangle(length, width);

        } else if (shape.equalsIgnoreCase("right triangle")) {
            int height = promptForIntValue("Enter the height triangle to print");
            printRightTriangle(height);
        } else if (shape.equalsIgnoreCase("equilateral triangle")) {
            int base = promptForOddNumber("Enter an odd number for the base size");
            printEquilateralTriangle(base);
        }

    }

    public static String promptForShape() {
        Scanner keyboard = new Scanner(System.in);
        String shape = "";
        while (!shape.equalsIgnoreCase("square")
                && !shape.equalsIgnoreCase("rectangle")
                && !shape.equalsIgnoreCase("right triangle")
                && !shape.equalsIgnoreCase("equilateral triangle")) {
            System.out.println("Please enter a shape to print, sqaure,"
                    + " rectangle, right triangle, or equilateral triangle");
            shape = keyboard.nextLine();
        }
        return shape;
    }

    public static int promptForOddNumber(String prompt) {
        int number = 0;

        while (number % 2 == 0) {
            number = promptForIntValue(prompt);
        }

        return number;
    }

    public static int promptForIntValue(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        return Integer.parseInt(keyboard.nextLine());
    }

    public static void printSquare(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int length, int width) {
        if (width > length) {
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
    }

    public static void printRightTriangle(int height) {
        // start row as 1, so col < row the first time for the 1 star row
        for (int row = 1; row <= height; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printEquilateralTriangle(int base) {
        int stars = 1;
        int spaces = base / 2; // integer division here is good

        while (stars <= base) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            System.out.println("");
            stars += 2;
            spaces -= 1;
        }
    }

}

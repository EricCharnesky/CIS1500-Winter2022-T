import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListProgram {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // read the file to repopulate the list
        File file = new File("shoppingList.txt");
        if (file.exists()) {
            try {
                // opening the file
                BufferedReader inputFile = new BufferedReader(new FileReader(file));

                // read the file
                String line = inputFile.readLine();
                while (line != null) {
                    if (!line.isEmpty()) {
                        list.add(line);
                    }
                    line = inputFile.readLine();
                }

                // close the file
                inputFile.close();

            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        // print the list
        System.out.println("Here's your current shopping list:");
        for (String itemName : list) {
            System.out.println(itemName);
        }

        // adding to the list
        System.out.println("Enter the name of an item to add your list or DONE");
        String item = keyboard.nextLine();

        while (!item.equalsIgnoreCase("Done")) {
            list.add(item);
            System.out.println("Enter the name of an item to add your list or DONE");
            item = keyboard.nextLine();
        }

        // writing the list to the file
        try {
            // opens the file - will erase any existing content
            PrintWriter fileOutput = new PrintWriter(new BufferedWriter(new FileWriter("shoppingList.txt")
            ));

            for (String itemName : list) {
                fileOutput.println(itemName);
            }

            // close the file
            fileOutput.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }


    }
}

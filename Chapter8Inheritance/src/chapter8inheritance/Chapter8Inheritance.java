package chapter8inheritance;

import java.util.Scanner;
import java.util.Date;

public class Chapter8Inheritance {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String name = keyboard.nextLine();

        System.out.println("What is the SKU?");
        String sku = keyboard.nextLine();

        System.out.println("What is the unit price?");
        double unitPrice = Double.parseDouble(keyboard.nextLine());

        System.out.println("How many are you buying?");
        int quantity = Integer.parseInt(keyboard.nextLine());

        Item item = new Item(name, sku, unitPrice, quantity);
        printItem(item);

        System.out.println("What is the sales tax rate, 0 < taxrate < 1");
        double taxRate = Double.parseDouble(keyboard.nextLine());

        TaxableItem taxableItem = new TaxableItem(name, sku, unitPrice, quantity, taxRate);
        // because of inheritance, TaxableItem IS an Item, you can treat it like it
        printItem(taxableItem);
        
        PerishableItem perishableItem =  new PerishableItem(name, sku, unitPrice, quantity, new Date(2022, 03, 07));
        System.out.println("Is expired: " + perishableItem.isExpired());
        printItem(perishableItem);
    }

    public static void printItem(Item item) {
        System.out.println("to buy " + item.getQuantity() + " of "
                + item.getName() + " will cost you: $"
                + item.getTotalPrice());

    }

}

package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class CafeInvoice {

public static void main(String[] args ) { userPrompt();
        Scanner Keyboard = new Scanner(System.in);
        ArrayList<Invoice> items = new ArrayList<>();
        ArrayList<Invoice> variables = new ArrayList<>();
    }

public static void userPrompt() {

        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = Keyboard.nextLine();

        System.out.println("Please enter your date");
        String date = Keyboard.nextLine();

        System.out.println("Please enter your address");
        String address = Keyboard.nextLine();

        System.out.println("Please enter your account number");
        String accnumber = Keyboard.nextLine();

        String end = "yes";

    do {
            System.out.print("Enter your item name: ");
            String itemname = Keyboard.nextLine();

            System.out.print("Enter your item price: ");
            double price = Keyboard.nextDouble();

            System.out.print("Enter your item quantity: ");
            String quantity = Keyboard.next();

            System.out.print("Do you want to add more item? (yes/no): ");
            Keyboard.next();
        } while (end.equalsIgnoreCase("YES"));{
        System.out.println("Thanks! Goodbye");
    }
        double subTotal=0;
        double taxRate =0.0;
        String state = " ";

        if (state.equalsIgnoreCase("VA")) {
            taxRate = 0.0575;
        } else if (state.equalsIgnoreCase("DC")) {
            taxRate = 0.0530;
        } else if (state.equalsIgnoreCase("MD")) {
            taxRate = 0.06;
        } else taxRate = 0.05;

        System.out.println();
        System.out.println("Customer Invoice");
        System.out.println("----------------------------------------");
        System.out.println("Customer Name: ");
        System.out.println("Transaction Date: ");
        System.out.println();
        System.out.println("Name" + "\n" + "name" + "\n" + "Price" + "\n" + "Quantity" + "\n" + "Subtotal");

        System.out.println();
        System.out.println("Subtotal: $"  + subTotal);
        double finalTotal= (subTotal + taxRate);
        System.out.println("Tax: " + taxRate);
        System.out.println("Grand Total: $" + finalTotal);

}
    }

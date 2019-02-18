package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class CafeInvoice {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        ArrayList<Invoice> items = new ArrayList<>();
        ArrayList<Item> things = new ArrayList<>();
        double subTotal = 0;
        double finalTotal = 0;
        String end = " ";
        double taxRate;

        System.out.println("Please enter your name");
        String name = Keyboard.nextLine();

        System.out.println("Please enter your address");
        String address = Keyboard.nextLine();

        System.out.println("Please enter your date");
        String date = Keyboard.nextLine();

        System.out.println("Please enter your account number");
        String accnumber = Keyboard.nextLine();

        do {
            System.out.print("Enter your item name: ");
            String itemname = Keyboard.nextLine();

            System.out.print("Enter your item price: ");
            double price = Keyboard.nextDouble();

            System.out.print("Enter your item quantity: ");
            int quantity = Keyboard.nextInt();

            System.out.println("Is this item taxable True or False");
            boolean taxable = Keyboard.nextBoolean();

            System.out.print("Enter your state: ");
            String state = Keyboard.next();

            if (state.equalsIgnoreCase("VA")) {
                taxRate = 0.0575;
            } else if (state.equalsIgnoreCase("DC")) {
                taxRate = 0.0530;
            } else if (state.equalsIgnoreCase("MD")) {
                taxRate = 0.06;
            } else taxRate = 0.05;

            System.out.print("Do you want to add more item? (yes/no): ");
            end = Keyboard.next();
            Keyboard.nextLine();

            things.add(new Item(name, address, date, accnumber, itemname, price, quantity, taxable));

        } while (!end.equalsIgnoreCase("NO"));

        DecimalFormat df = new DecimalFormat("# .00");

        for (Item d : things) {
            System.out.println("Customer Name: " + d.getCustomerName());
            System.out.println("Customer Address: " + d.getCustomerAddress());
            System.out.println("Date: " + d.getDate());
            System.out.println("Account Number: " + d.getAccountNumber());
            System.out.print("Item Name         Quantity         Price       Cost          Taxable\n");
            System.out.print("===========================================================================\n");
            System.out.print(d.getItem() + "  " + d.getQuantity() + "  " + d.getPrice() + "\n");
            subTotal = (d.getPrice() * d.getQuantity());
            finalTotal += (taxRate + subTotal);
            System.out.println("Subtotal $" + subTotal);
            System.out.println("Sales Tax " + taxRate);
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Total: " + df.format(finalTotal));

        }

    }
}
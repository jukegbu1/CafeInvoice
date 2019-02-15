package com.company;

import java.util.ArrayList;

public class Item {

//Define variables:

    private String name;
    private double price;
    private double quanity;
    private double subTotal;
    private double finalTotal;
    boolean taxable;
    private ArrayList<Invoice> variables;

//Default Constructor:

    public Item() {
    }


    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuanity() {
        return quanity;
    }

    public void setQuanity(double quanity) {
        this.quanity = quanity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }


//Overloaded Constructor

    public Item(String name, double price, double quanity, double subTotal, double finalTotal, boolean taxable) {
        this.name = name;
        this.price = price;
        this.quanity = quanity;
        this.subTotal = subTotal;
        this.finalTotal = finalTotal;
        this.taxable = taxable;


    }
}

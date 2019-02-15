package com.company;

import java.util.ArrayList;

public class Invoice {

//Define variables:

    private String customerName;
    private String transactionDate;
    private ArrayList<Invoice> items;

//Default Constructor:

    public Invoice() {
    }

//Overloaded Constructor

    public Invoice(String customerName, String transactionDate, ArrayList<Invoice> items) {
        this.customerName = customerName;
        this.transactionDate = transactionDate;
        this.items = items;
    }

//Getters & Setters

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public ArrayList<Invoice> getItems() {
        return items;
    }

    public void setItems(ArrayList<Invoice> items) {
        this.items = items;
    }
}

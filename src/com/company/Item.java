package com.company;


public class Item {
    private String customerName;
    private String customerAddress;
    private String date;
    private String accountNumber;
    private String item;
    private double price;
    private int quantity;
    private boolean taxable;

    public Item() {
    }

    public Item(String customerName, String customerAddress, String date, String accountNumber, String item, double price, int quantity, boolean taxable) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.date = date;
        this.accountNumber = accountNumber;
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
}
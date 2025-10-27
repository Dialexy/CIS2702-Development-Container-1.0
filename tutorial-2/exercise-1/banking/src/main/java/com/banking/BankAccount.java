package com.banking;

public class BankAccount {
    private double balance;
    protected String type;
    int customerID;
    public int number;

    public BankAccount(String type, int customerID, int number) {
        this.type = type;
        this.customerID = customerID;
        this.number = number;
    }
}

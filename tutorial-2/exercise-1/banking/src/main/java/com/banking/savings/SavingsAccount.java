package com.banking.savings;

import com.banking.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int customerID, int number, double interestRate) {
        // call super constructor
        super("SAVINGS", customerID, number);
        this.interestRate = interestRate;
    }

    public void printAccountNumber() {
        System.err.println("Account Number:" + super.number);
    }

    public void printAccountbalance() {
        // System.err.println("Account balance:" + super.balance); // - Unable to acccess balance as it's private, would need to use a getter to access it
    }
}

package org.skypay.test_banking;


public class Transaction {
    private final String date;
    private final int amount;
    private final int balance;

    // constructor without id
    public Transaction(String date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }


    // getters  /  Setters

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }
}

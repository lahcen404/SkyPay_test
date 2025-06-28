package org.skypay.test_banking;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService{
    private int currentBallance = 0;

    private final List<Transaction> transactions = new ArrayList<>();

    // deposiit
    public void deposit (int amount , String date){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit Amount must be Positive > 0 ");
        }
        currentBallance += amount;
        transactions.add(new Transaction(date,amount,currentBallance));
    }

    // withdraw
    public void withdraw (int amount , String date){

        if (amount <= 0){
            throw new IllegalArgumentException("Withdraw Amount must be Positive > 0 ");
        }
        if (currentBallance < amount){
            throw new IllegalStateException("insufficient for  withdraw");

        }
        currentBallance -= amount;
        transactions.add(new Transaction(date,-amount,currentBallance));

    }

    //ptintStatement
    public void printStatement(){

        System.out.println("Date       ||      Amount ||      Balance");

        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction transaction = transactions.get(i);
            System.out.println(
                    transaction.getDate() + " || " +
                            transaction.getAmount() + "    || " +
                            transaction.getBalance()
            );
        }
        }



}

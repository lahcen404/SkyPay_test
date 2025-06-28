package org.skypay.test_banking;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int currentBallance = 0;

    private final List<Transaction> transactions = new ArrayList<>();

    // deposiit
    public void deposit (int amount , String date){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit Amount must be Positive > 0 ")
        }
        currentBallance += amount;
        transactions.add(new Transaction(date,amount,currentBallance));
    }

}

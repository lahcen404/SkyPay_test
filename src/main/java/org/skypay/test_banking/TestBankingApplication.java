package org.skypay.test_banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestBankingApplication {

    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.deposit(1000, "10/01/2012");
        myAccount.deposit(2000, "13/01/2012");
        myAccount.withdraw(500, "14/01/2012");

        myAccount.printStatement();
    }

}

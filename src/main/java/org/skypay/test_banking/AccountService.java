package org.skypay.test_banking;

public interface AccountService {
    void deposit (int amount);
    void withdraw(int amount);
    void printStatement();
}

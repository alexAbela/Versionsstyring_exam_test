package jUnit_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount acc = new BankAccount(0);
        assertEquals(50,acc.deposit(50));
    }

    @Test
    void withdraw() {
        BankAccount acc = new BankAccount(50);
        assertEquals(0, acc.withdraw(100));

    }
    // Makes sure the get balance method returns the balance correctly.
    @Test
    void getBalance() {
        BankAccount acc = new BankAccount(1);
        assertEquals(1, acc.getBalance());
    }
}

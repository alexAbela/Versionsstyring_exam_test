package jUnit_tests;
public class BankAccount {

    private int balance;

    // Constructor, for a simple class

    public BankAccount(int balance) {

        this.balance = balance;

    }


    // Method for depositing money
    public int deposit(int amount) {

        balance += amount;
        System.out.println("--------------------------------------------\n" +
                "*       Your new balance is       " + this.balance + "     *\n" +
                "--------------------------------------------\n");
        return balance;

    }

    // Method for withdrawel, the withdraw method can't put balance below 0.

    public int withdraw(int amount) {

        this.balance -= amount;
        if (balance < 0) {

            this.balance = 0;
            System.out.println("--------------------------------------------\n" +
                    "*       Your new balance is       " + this.balance + "     *\n" +
                    "--------------------------------------------\n");
            return this.balance;

        } else {
            System.out.println("--------------------------------------------\n" +
                    "*       Your new balance is       " + this.balance + "     *\n" +
                    "--------------------------------------------\n");
            return balance;
        }
    }

    // standard method for returning balance.
    public int getBalance() {
        return this.balance;

    }
}
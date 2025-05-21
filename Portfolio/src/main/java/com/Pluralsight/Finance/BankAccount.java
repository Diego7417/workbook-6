package com.Pluralsight.Finance;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void desposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
       balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}

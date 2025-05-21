package com.Pluralsight.Finance;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, double marketValue, String accountNumber, double balance) {
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

    public void charge(double amount){
        balance += amount;
    }
    public void pay(double amount){
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance;
    }
}

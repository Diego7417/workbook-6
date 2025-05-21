package com.Pluralsight.Finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);
        account1.desposit(100);
        account2.desposit(100);
    }
}

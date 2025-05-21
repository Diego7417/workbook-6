package com.Pluralsight;

import com.Pluralsight.Finance.*;

public class Program {
    public static void main(String[] args) {
        //House
        House house = new House("Mi Casa", 680000, 2009, 5400, 7);
        System.out.println("House value: $" + house.getValue());

        //Gold
        Gold gold = new Gold("Gold Bar", 24329.28,1.0);
        System.out.println("Gold value: $" + gold.getValue());

        //Jewelry
        Jewelry jewelry = new Jewelry("Diamond necklace", 33210, 15);
        System.out.println("Jewelry value: $" + jewelry.getValue());

        //Bank account
        BankAccount bankAccount1 = new BankAccount("Trevor", "D4595L", 8956.64);
        bankAccount1.desposit(800);
        bankAccount1.withdraw(200);
        BankAccount bankAccount2 = new BankAccount("Susan", "O65473N", 49191.23);
        bankAccount2.desposit(8540);
        bankAccount2.withdraw(6200);
        BankAccount bankAccount3 = new BankAccount("Douglas", "W78164S", 12687.01);
        bankAccount3.desposit(2532);
        bankAccount3.withdraw(1500);

        System.out.println("BankAccount owner: " + bankAccount1.getName());
        System.out.println("BankAccount Balance: $" + bankAccount1.getBalance());
        System.out.println("BankAccount Value: $" + bankAccount1.getValue());

        System.out.println("BankAccount owner: " + bankAccount2.getName());
        System.out.println("BankAccount Balance: $" + bankAccount2.getBalance());
        System.out.println("BankAccount Value: $" + bankAccount2.getValue());

        System.out.println("BankAccount owner: " + bankAccount3.getName());
        System.out.println("BankAccount Balance: $" + bankAccount3.getBalance());
        System.out.println("BankAccount Value: $" + bankAccount3.getValue());

        //Credit Card
        CreditCard creditCard1 = new CreditCard("Wight", 28000, "T51463J", 8200);
        creditCard1.charge(680);
        creditCard1.pay(500);
        CreditCard creditCard2 = new CreditCard("Tiara", 12500, "D51324T", 4500);
        creditCard2.charge(880);
        creditCard2.pay(450);

        System.out.println("\nCreditCard Owner: " + creditCard1.getName());
        System.out.println("CreditCard Balance (owed): $" + creditCard1.getBalance());
        System.out.println("CreditCard Value: $" + creditCard1.getValue());

        System.out.println("\nCreditCard Owner: " + creditCard2.getName());
        System.out.println("CreditCard Balance (owed): $" + creditCard2.getBalance());
        System.out.println("CreditCard Value: $" + creditCard2.getValue());

        Valuable valuable1 = bankAccount1;
        Valuable valuable2 = bankAccount2;
        Valuable valuable3 = bankAccount3;
        Valuable valuable4 = creditCard1;
        Valuable valuable5 = creditCard2;

        System.out.println("\nValuable bankAccount1.getValue(): $" + valuable1.getValue());
        System.out.println("Valuable bankAccount2.getValue(): $" + valuable2.getValue());
        System.out.println("\nValuable bankAccount3.getValue(): $" + valuable3.getValue());
        System.out.println("Valuable creditCard1.getValue(): $" + valuable4.getValue());
        System.out.println("\nValuable creditCard2.getValue(): $" + valuable5.getValue());


    }


}
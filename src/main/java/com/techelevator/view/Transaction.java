package com.techelevator.view;

public class Transaction {
    //balance (g/s)
    private double balance = 0;

    //pick option
        //inventory method

    public void feedMoney(double moneyReceived) {
        balance += moneyReceived;
    }

    public double getBalance() {
        return balance*100;
    }

    public void displayBalance() {
        System.out.println("BALANCE: $" + balance);
    }

    public void getChange() {
        //counters for coins
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        if (balance/25>0) {
            quarter = (int) (balance / 25);
            balance = (int) (balance % 25);
        }
        if (balance/10>0) {
            dime = (int) (balance/10);
            balance = (int) (balance%10);
        }
        if (balance/5>0) {
            nickel = (int) (balance/5);
            balance = (int) (balance%5);
        }
        System.out.println("Here is your change: " + quarter + " quarters , " + dime + " dimes, " + nickel + " nickels");
    }

}

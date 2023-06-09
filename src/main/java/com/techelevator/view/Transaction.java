package com.techelevator.view;

import java.util.Map;

public class Transaction {
    //balance (g/s)
    private static double balance = 0;

    //pick option
    //inventory method

    public void setBalance(String moneyReceived) {
        Integer money = Integer.parseInt(moneyReceived);
        balance += money;
    }

    public static double getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("BALANCE: $" + balance);
    }

    public static void getChange() {
        //counters for coins
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        if (balance / 25 > 0) {
            quarter = (int) (balance*100 / 25);
            balance = (int) (balance*100 % 25);
        }
        if (balance / 10 > 0) {
            dime = (int) (balance / 10);
            balance = (int) (balance % 10);
        }
        if (balance / 5 > 0) {
            nickel = (int) (balance / 5);
            balance = (int) (balance % 5);
        }
        System.out.println("Here is your change: " + quarter + " quarters , " + dime + " dimes, " + nickel + " nickels");
    }


    public static void dispenseItem(String code) {
        Map<String, Item> inventory = Inventory.getInventoryMap();

        if (inventory.containsKey(code)) {
            Item currentItem = inventory.get(code);

            if (currentItem.getItemInventory() > 0) {
                balance -= currentItem.getPrice();

                //TODO need to add item inventory minus 1


                System.out.println(currentItem.getName() + " $" + currentItem.getPrice() + " Remaining Balance: $" + balance);
                //TODO need to return to purchase menu

            } else {
                System.out.println("OUT OF STOCK");
            }
        }
        else {
            System.out.println("INVALID CODE, PLEASE TRY AGAIN");
        }
    }
}
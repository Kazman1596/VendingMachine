package com.techelevator.view;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.sql.Array;
import java.util.*;

public class Inventory {
    private static ArrayList<String> inventory = new ArrayList<String>();
    public Inventory() {
        File vendingMachineInventory = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(vendingMachineInventory)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                inventory.add(line);
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong fetching inventory");
        }

    }

    public void displayInventory() {

    }




    public static ArrayList<String> getItems() {
        return inventory;
    }


}

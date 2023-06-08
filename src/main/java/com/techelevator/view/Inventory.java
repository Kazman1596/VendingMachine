package com.techelevator.view;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.sql.Array;
import java.util.*;

public class Inventory {
    Item item;
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
        for (String item: inventory) {

            String[] strSplit = item.split("\\|");
            item = new Item(strSplit[0]);
            System.out.println(strSplit[0] + strSplit[1] + strSplit[2] + item;
        }

    }




    public static ArrayList<String> getItems() {
        return inventory;
    }

}

package com.techelevator.view;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

    private static ArrayList<String> inventory = new ArrayList<String>();
    public static void main(String[] args) {
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
    public static Map<String, Integer> getInventory() {
        Map<String, Integer> inventoryMap= new HashMap<>();
        for (String item : inventory) {
            String[] itemArray = item.split("\\|");
            inventoryMap.put(itemArray[0], 5);
        }
        return inventoryMap;
    }

    public static void setInventory(String code) {

    }

    public static ArrayList<String> getItems() {
        return inventory;
    }
}

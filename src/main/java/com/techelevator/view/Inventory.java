package com.techelevator.view;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.sql.Array;
import java.util.*;

public class Inventory {
    private static Map<String, Integer> inventoryMap= new HashMap<>();


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
        for (String item : inventory) {
            String[] itemArray = item.split("\\|");
            inventoryMap.put(itemArray[0], 5);
        }


        System.out.println(getItems());


    }
    public static Map<String, Integer> getInventory() {
        //Map<String, Integer> inventoryMap= new HashMap<>();
        return inventoryMap;
    }

    //code, quantity
    public static void setInventory(String code) {
        int newValue = inventoryMap.get(code);
        inventoryMap.put(code, newValue - 1);
        System.out.println(inventoryMap);
    }

    public static ArrayList<String> getItems() {
        return inventory;
    }

}

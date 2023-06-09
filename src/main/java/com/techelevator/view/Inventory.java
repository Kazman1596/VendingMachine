package com.techelevator.view;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.sql.Array;
import java.util.*;

public class Inventory {
    Item item;
    private static ArrayList<String> inventory = new ArrayList<>();
    private static Map<String, Item> inventoryMap = new TreeMap<>();
    public Inventory() {
        File vendingMachineInventory = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(vendingMachineInventory)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                inventory.add(line);
            }
            for (String item: inventory) {
                String[] strSplit = item.split("\\|");
                String itemCode = strSplit[0];
                Item currentItem = new Item(itemCode, strSplit[1], strSplit[2], strSplit[3]);
                inventoryMap.put(itemCode, currentItem);
            }

        } catch (Exception ex) {
            System.out.println("Something went wrong fetching inventory");
        }

    }

    public static void displayInventory() {
        for (Map.Entry<String, Item> item: inventoryMap.entrySet()) {
            System.out.println(item.getValue());
        }
    }

    public static Map<String, Item> getInventoryMap() {
        return inventoryMap;
    }
}

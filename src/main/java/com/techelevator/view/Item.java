package com.techelevator.view;

import java.util.ArrayList;

public class Item extends Inventory{

    private String code;
    private String name;
    private double price;
    private String category;
    private int itemInventory = 5;


    public Item(String inputCode) {
        ArrayList<String> inventory = (super.getItems());
        for (String item : inventory) {
            if (item.startsWith(inputCode)) {
                String[] itemContents = item.split("\\|");
                this.code = itemContents[0];
                this.name = itemContents[1];
                this.price = Double.parseDouble(itemContents[2]);
                this.category = itemContents[3];
            }
        }
    }

    //Getters and Setters

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getItemInventory() {
        return itemInventory;
    }

    public void dispenseItem() {
        if (itemInventory > 0) {
            itemInventory -= 1;
        } else {
            System.out.println("OUT OF STOCK");
        }
    }


}

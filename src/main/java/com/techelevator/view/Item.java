package com.techelevator.view;

import java.util.ArrayList;

public class Item extends Inventory {

    private String code;
    private String name;
    private double price;
    private String category;
    private int itemInventory;


    public Item(String inputCode,String name, String price, String category) {
                this.code = inputCode;
                this.name = name;
                this.price = Double.parseDouble(price);
                this.category = category;
                this.itemInventory = 5;
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


    @Override
    public String toString() {
        return code + " | " + name + " | Price: $" + price + " | Quantity: " + itemInventory;
    }

}

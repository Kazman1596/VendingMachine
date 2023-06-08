package com.techelevator.view;

import java.util.ArrayList;

public class Item  {

    private String code;
    private String name;
    private double price;
    private String category;
    private int itemInventory = 5;


    public Item(String inputCode,String name, String price, String category) {
//        ArrayList<String> inventory = (super.getItems());       //test removing line 15-1
//        for (String item : inventory) {
//            if (item.startsWith(inputCode)) {
//                String[] itemContents = item.split("\\|");
                this.code = inputCode;
                this.name = name;
                this.price = Double.parseDouble(price);
                this.category = category;

//            }
//        }
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
    @Override
    public String toString() {
        return code + " | " + name + " | " + price;
    }

}

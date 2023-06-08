package com.techelevator.view;

import java.util.ArrayList;

public class Item extends Inventory{

    private String code;
    private String name;
    private double price;
    private String category;
    private int inventory = 5;

    public static void main(String[] args) {
    }

    public Item(String inputCode) {
        ArrayList<String> inventory = (super.getItems());
        for (String item : inventory) {
            if (item.startsWith(inputCode)) {
                String[] itemContents = item.split("\\|");
                this.code = itemContents[0];
                this.name = itemContents[1];
                this.price = Double.parseDouble(itemContents[2]);
            }
        }
    }



}

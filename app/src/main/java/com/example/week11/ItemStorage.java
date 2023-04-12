package com.example.week11;

import java.util.ArrayList;

public class ItemStorage {

    private ArrayList<Item> items = new ArrayList<>();

    private static ItemStorage itemStorage = null;

    private ItemStorage(){
    }

    public Item getItem(int id){return items.get(id);}

    public static ItemStorage getInstance(){
        if(itemStorage ==null){
            itemStorage = new ItemStorage();
        }
        return itemStorage;
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    public void removeItem(String name) {
        int k = 0;
        for (Item i : items) {
            if (i.getItem().equals(name)) {
                break;
            }
            k++;
        }
        items.remove(k);
    }


    public void addUser(String item, String amount, String amountUnit, String otherInformation){
        Item newItem = new Item(item, amount, amountUnit, otherInformation);
        items.add(newItem);
    }


}

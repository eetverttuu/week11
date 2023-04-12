package com.example.week11;

public class Item {
    private String item;
    private String amount;
    private String amountUnit;
    private String otherInformation;

    public String getItem() {
        return item;
    }

    public String getAmount() {
        return amount;
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public Item(String item, String amount, String amountUnit, String otherInformation){
        this.item=item;
        this.amount= amount;
        this.amountUnit=amountUnit;
        this.otherInformation=otherInformation;

    }

    public void setItem (String item){
        this.item=item;
    }
}

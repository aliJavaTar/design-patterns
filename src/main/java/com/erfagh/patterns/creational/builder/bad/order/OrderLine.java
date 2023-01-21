package com.erfagh.patterns.creational.builder.bad.order;

public class OrderLine {

    private String itemName;
    private  int count;
    private long price;

    public OrderLine(String itemName, int count, long price) {
        this.itemName = itemName;
        this.count = count;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getCount() {
        return count;
    }

    public long getPrice() {
        return price;
    }
}

package com.erfagh.patterns.creational.behavioral.observers;

public class Stock {
    private String name;
    private int price;
    private boolean isPopular;

    public Stock(String name, int price, boolean isPopular) {
        this.name = name;
        this.price = price;
        this.isPopular = isPopular;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean popular) {
        isPopular = popular;
    }
}

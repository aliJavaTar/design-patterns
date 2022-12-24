package com.erfagh.patterns.creational.behavioral.observers;

public class StockListView implements EventListener {

    private final Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void update() {
        System.out.println(stock.getPrice());
    }
}

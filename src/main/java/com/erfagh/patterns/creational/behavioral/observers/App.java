package com.erfagh.patterns.creational.behavioral.observers;

public class App {
    public static void main(String[] args) {
     Stock stock =new Stock("f",100,true);
     StockListView stockListView = new StockListView(stock);
     StatusBar statusBar = new StatusBar(stock);
     stock.addToObserver(statusBar);
     stock.addToObserver(stockListView);

     stock.setPrice(3);

    }
}

package com.erfagh.patterns.behavioral.observers;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Stock stock = new Stock("f", 100, true);

        List<Stock> stockList =new ArrayList<>();
        stockList.add(new Stock("a", 100, true));
        stockList.add(new Stock("b", 200, false));
        stockList.add(new Stock("c", 300, true));
        stockList.add(new Stock("d", 400, false));


        StockListView stockListView = new StockListView(stockList);
        StatusBar statusBar = new StatusBar(stockList);



        stock.addToObserver(statusBar);
        stock.addToObserver(stockListView);

        stock.setPrice(3);

    }
}

package com.erfagh.patterns.creational.behavioral.observers;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{
    private final List<Stock> stocks = new ArrayList<>();

    public void initializeStocks(Stock stock) {
        stocks.add(stock);
    }

    public void showListOfStock() {
        stocks.forEach(System.out::println);
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    @Override
    public void update(int price) {

    }
}

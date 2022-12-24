package com.erfagh.patterns.creational.behavioral.observers;

import java.util.List;
import java.util.stream.Collectors;

public class StockListView implements EventListener {

    private final List<Stock> stock;

    public StockListView( List<Stock> stock) {
        this.stock = stock;
    }


    @Override
    public void update() {
        System.out.println("list all");
        stock.stream()
                .map(Stock::getPrice).toList()
                .forEach(System.out::println);
    }
}

package com.erfagh.patterns.creational.behavioral.observers;

import java.util.List;

public class StatusBar implements EventListener {

    private final Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    public void ShowPopularStock(List<Stock> stocks) {
        stocks.stream().filter(Stock::isPopular).toList().forEach(System.out::println);
    }

    @Override
    public void update() {
        System.out.println(stock.getPrice());
    }
}

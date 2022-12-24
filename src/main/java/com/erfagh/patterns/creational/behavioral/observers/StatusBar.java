package com.erfagh.patterns.creational.behavioral.observers;

import java.util.List;
import java.util.stream.Collectors;

public class StatusBar implements EventListener {

    private final List<Stock> stock;

    public StatusBar(List<Stock> stock) {
        this.stock = stock;
    }



    @Override
    public void update() {
        System.out.println("list Popular");
        stock.stream().filter(Stock::isPopular)
                .map(Stock::getPrice).toList()
                .forEach(System.out::println);
    }
}

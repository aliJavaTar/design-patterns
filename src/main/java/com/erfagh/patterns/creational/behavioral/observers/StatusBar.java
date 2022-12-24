package com.erfagh.patterns.creational.behavioral.observers;

import java.util.List;

public class StatusBar implements Observer{

    public StatusBar(List<Stock> stocks) {
        stocks.stream().filter(Stock::isPopular).toList().forEach(System.out::println);
    }

    @Override
    public void update(int price) {

    }
}

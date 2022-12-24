package com.erfagh.patterns.creational.behavioral.observers;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addToObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeToObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notify(int price) {
        for (var o : observers) {
            o.update(price);
        }
    }
}

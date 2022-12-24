package com.erfagh.patterns.behavioral.observers;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<EventListener> observers = new ArrayList<>();

    public void addToObserver(EventListener observer) {
        observers.add(observer);
    }

    public void removeToObserver(EventListener observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(EventListener::update);
    }
}

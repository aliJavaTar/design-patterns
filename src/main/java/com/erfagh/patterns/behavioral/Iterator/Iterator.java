package com.erfagh.patterns.behavioral.Iterator;

public interface Iterator {
    boolean hasNext();

    String current();

    void next();
}

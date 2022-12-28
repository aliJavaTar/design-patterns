package com.erfagh.patterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BrowserHistory {
    private String[] urls = new String[10];
    int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[count--];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

//    public static class ListIterator implements Iterator {
//        private final BrowserHistory history;
//        private int index;
//
//        public ListIterator(BrowserHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history. );
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public static class ArrayIterator implements Iterator {
        private final BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}

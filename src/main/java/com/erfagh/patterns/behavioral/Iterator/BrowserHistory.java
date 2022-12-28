package com.erfagh.patterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public class ListIterator implements Iterator {
        private BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return null;
        }

        @Override
        public void next() {

        }
    }

}

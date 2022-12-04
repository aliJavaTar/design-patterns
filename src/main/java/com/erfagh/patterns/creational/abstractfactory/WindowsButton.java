package com.erfagh.patterns.creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("create WindowsButton");
    }
}

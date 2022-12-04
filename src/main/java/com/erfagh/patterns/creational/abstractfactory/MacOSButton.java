package com.erfagh.patterns.creational.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("create MacOsButton");
    }
}

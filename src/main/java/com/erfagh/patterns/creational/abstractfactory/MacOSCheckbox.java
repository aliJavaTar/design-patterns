package com.erfagh.patterns.creational.abstractfactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("create checkBox MacOs");
    }
}

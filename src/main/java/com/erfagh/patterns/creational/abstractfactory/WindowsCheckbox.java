package com.erfagh.patterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("create WindowsOs CheckBox");
    }
}

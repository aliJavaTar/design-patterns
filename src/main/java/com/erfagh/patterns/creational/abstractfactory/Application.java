package com.erfagh.patterns.creational.abstractfactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(Button button, Checkbox checkbox) {
        this.button = button;
        this.checkbox = checkbox;
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

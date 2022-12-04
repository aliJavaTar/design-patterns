package com.erfagh.patterns;

import com.erfagh.patterns.creational.abstractfactory.Application;
import com.erfagh.patterns.creational.abstractfactory.GUIFactory;
import com.erfagh.patterns.creational.abstractfactory.MacOSFactory;
import com.erfagh.patterns.creational.abstractfactory.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac"))
            factory = new MacOSFactory();
        else
            factory = new WindowsFactory();

        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

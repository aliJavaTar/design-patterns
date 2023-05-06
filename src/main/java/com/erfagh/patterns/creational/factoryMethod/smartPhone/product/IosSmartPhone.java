package com.erfagh.patterns.creational.factoryMethod.smartPhone.product;

public class IosSmartPhone implements SmartPhone {
    @Override
    public void companyName() {
        System.out.println("Apple phone ");
    }
}

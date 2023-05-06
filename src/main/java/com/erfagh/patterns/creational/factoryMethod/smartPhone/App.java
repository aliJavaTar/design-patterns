package com.erfagh.patterns.creational.factoryMethod.smartPhone;

import com.erfagh.patterns.creational.factoryMethod.smartPhone.factory.CraterSmartPhone;
import com.erfagh.patterns.creational.factoryMethod.smartPhone.factory.Ios;

public class App {
    public static void main(String[] args) {
        CraterSmartPhone craterSmartPhone = new Ios();
        craterSmartPhone.phoneCompany();
    }
}

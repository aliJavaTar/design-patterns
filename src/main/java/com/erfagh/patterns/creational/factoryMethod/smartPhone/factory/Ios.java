package com.erfagh.patterns.creational.factoryMethod.smartPhone.factory;

import com.erfagh.patterns.creational.factoryMethod.smartPhone.product.IosSmartPhone;
import com.erfagh.patterns.creational.factoryMethod.smartPhone.product.SmartPhone;

public class Ios extends CraterSmartPhone {
    @Override
    protected SmartPhone createPhone() {
        return new IosSmartPhone();
    }
}

package com.erfagh.patterns.creational.factoryMethod.smartPhone.factory;

import com.erfagh.patterns.creational.factoryMethod.smartPhone.product.GoogleSmartPhone;
import com.erfagh.patterns.creational.factoryMethod.smartPhone.product.SmartPhone;

public class Android extends CraterSmartPhone {
    @Override
    protected SmartPhone createPhone() {
        return new GoogleSmartPhone();
    }
}

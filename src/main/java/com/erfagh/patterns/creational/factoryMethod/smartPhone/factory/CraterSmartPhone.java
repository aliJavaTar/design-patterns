package com.erfagh.patterns.creational.factoryMethod.smartPhone.factory;

import com.erfagh.patterns.creational.factoryMethod.smartPhone.product.SmartPhone;

public abstract class CraterSmartPhone {
    public void phoneCompany() {
        SmartPhone phone = createPhone();
        phone.companyName();
    }

    protected abstract SmartPhone createPhone();
}

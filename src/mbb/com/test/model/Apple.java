package mbb.com.test.model;

import mbb.com.test.model.enumType.AppleIModelType;
import mbb.com.test.model.enumType.BrandType;

public class Apple implements Brand {

    private AppleIModelType appleModelType;

    public Apple(AppleIModelType appleModelType) {
        this.appleModelType = appleModelType;
    }

    public AppleIModelType getAppleModelType() {
        return appleModelType;
    }

    @Override
    public String toString() {
        return BrandType.APPLE.getValue() + " " + appleModelType.getValue();
    }
}

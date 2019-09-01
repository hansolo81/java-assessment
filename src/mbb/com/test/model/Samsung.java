package mbb.com.test.model;

import mbb.com.test.model.enumType.SamsungIModelType;

public class Samsung implements Brand {

    private SamsungIModelType samsungModelType;


    public Samsung(SamsungIModelType samsungModelType) {
        this.samsungModelType = samsungModelType;
    }


    public SamsungIModelType getSamsungModelType() {
        return samsungModelType;
    }


}

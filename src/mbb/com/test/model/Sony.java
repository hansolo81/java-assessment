package mbb.com.test.model;

import mbb.com.test.model.enumType.SonyIModelType;

public class Sony implements Brand {

    private SonyIModelType sonyModelType;

    public Sony(SonyIModelType sonyModelType) {
        this.sonyModelType = sonyModelType;
    }

    public SonyIModelType getSonyModelType() {
        return sonyModelType;
    }


}

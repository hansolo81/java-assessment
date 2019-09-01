package mbb.com.test.model;

import mbb.com.test.model.enumType.ToshibaIModelType;

public class Toshiba implements Brand {

    private ToshibaIModelType toshibaModelType;

    public Toshiba(ToshibaIModelType toshibaModelType) {
        this.toshibaModelType = toshibaModelType;
    }

    public ToshibaIModelType getToshibaModelType() {
        return toshibaModelType;
    }


}

package mbb.com.test.model;

import mbb.com.test.model.enumType.MicrosoftIModelType;

public class Microsoft implements Brand {

    private MicrosoftIModelType microsoftModelType;

    public Microsoft(MicrosoftIModelType microsoftModelType) {
        this.microsoftModelType = microsoftModelType;
    }

    public MicrosoftIModelType getMicrosoftModelType() {
        return microsoftModelType;
    }


}

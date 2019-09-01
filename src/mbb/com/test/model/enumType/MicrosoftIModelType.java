package mbb.com.test.model.enumType;

public enum MicrosoftIModelType implements IModelType {


    XBOX_ONE("XBox One");


    private String value;

    private MicrosoftIModelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

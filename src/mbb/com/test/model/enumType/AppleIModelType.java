package mbb.com.test.model.enumType;

public enum AppleIModelType implements IModelType {


    MACBOOK("Macbook");


    private String value;

    private AppleIModelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

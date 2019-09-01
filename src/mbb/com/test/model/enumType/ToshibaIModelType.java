package mbb.com.test.model.enumType;

public enum ToshibaIModelType implements IModelType {

    WASHING_MACHINE("Washing Machine");
    private String value;

    private ToshibaIModelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

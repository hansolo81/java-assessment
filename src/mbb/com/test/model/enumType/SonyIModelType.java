package mbb.com.test.model.enumType;

public enum SonyIModelType implements IModelType {

    PLAYSTATION_4("Playstation 4"),
    SMART_TV("Smart TV");


    private String value;

    private SonyIModelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

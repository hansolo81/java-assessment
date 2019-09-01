package mbb.com.test.model.enumType;

public enum SamsungIModelType implements IModelType {

    SMART_TV("Smart TV"),
    LASERJET_PRINTER("Laserjet Printer"),
    VACUUM_CLEANER("Vacuum Cleaner");



    private String value;

    private SamsungIModelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

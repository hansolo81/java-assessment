package mbb.com.test.model.enumType;

public enum BrandType {

    TOSHIBA("Toshiba"),SONY("Sony"), MICROSOFT("Microsoft"), APPLE("Apple"), SAMSUNG("Samsung"), GENERIC("Generic");


    private String value;

    private BrandType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

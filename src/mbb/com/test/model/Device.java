package mbb.com.test.model;

import mbb.com.test.model.enumType.BrandType;
import mbb.com.test.model.enumType.IModelType;

public class Device {

    private BrandType brand;
    private IModelType model;

    public Device() {
    }

    public Device(IModelType model) {
        this.model = model;
    }

    public Device(BrandType brand, IModelType model) {
        this.brand = brand;
        this.model = model;
    }

    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public IModelType getModel() {
        return model;
    }

    public void setModel(IModelType model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return  brand.getValue() + " " + model.getValue();
    }
}

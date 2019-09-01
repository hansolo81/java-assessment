package mbb.com.test.factory;

import mbb.com.test.model.Device;
import mbb.com.test.model.enumType.BrandType;
import mbb.com.test.model.enumType.IModelType;

public class DeviceFactory {

    public static Device factory(BrandType brand, IModelType model) {
        Device device = null;

        if (BrandType.SONY.equals(brand)) {

            device = DeviceGenerator.generateSonyDevice(model);

        } else if (BrandType.SAMSUNG.equals(brand)) {
            device = DeviceGenerator.generateSamsungDevice(model);

        } else if (BrandType.MICROSOFT.equals(brand)) {
            device = DeviceGenerator.generateMicrosoftDevice(model);

        } else if (BrandType.APPLE.equals(brand)) {
            device = DeviceGenerator.generateAppleDevice(model);

        }else if(BrandType.TOSHIBA.equals(brand)){
            device = DeviceGenerator.generateToshibaDevice(model);
        }
        return device;
    }


}

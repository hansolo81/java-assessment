package mbb.com.test.factory;

import mbb.com.test.model.*;
import mbb.com.test.model.enumType.*;

public class DeviceGenerator {

    public static Device generateAppleDevice(IModelType model) {
        Device device = null;
        if (AppleIModelType.MACBOOK.equals(model)) {
            Apple apple = new Apple((AppleIModelType) model);
            device = generateDevice(BrandType.APPLE, apple.getAppleModelType());
        }
        return device;
    }

    public static Device generateMicrosoftDevice(IModelType model) {
        Device device = null;
        if (MicrosoftIModelType.XBOX_ONE.equals(model)) {
            Microsoft microsoft = new Microsoft((MicrosoftIModelType) model);
            device = generateDevice(BrandType.MICROSOFT, microsoft.getMicrosoftModelType());

        }
        return device;
    }

    public static Device generateSamsungDevice(IModelType model) {
        Device device = null;
        if (SamsungIModelType.SMART_TV.equals(model)
                || SamsungIModelType.VACUUM_CLEANER.equals(model)
                || SamsungIModelType.LASERJET_PRINTER.equals(model)) {
            Samsung samsung = new Samsung((SamsungIModelType) model);
            device = generateDevice(BrandType.SONY, samsung.getSamsungModelType());

        }
        return device;
    }

    public static Device generateSonyDevice(IModelType model) {
        Device device = null;

        if (SonyIModelType.PLAYSTATION_4.equals(model)
                || SonyIModelType.SMART_TV.equals(model)) {
            Sony sony = new Sony((SonyIModelType) model);
            device = generateDevice(BrandType.SONY, sony.getSonyModelType());

        }
        return device;
    }

    public static Device generateDevice(BrandType brand, IModelType model) {
        Device device = new Device();
        device.setBrand(brand);
        device.setModel(model);
        return device;
    }

    public static Device generateToshibaDevice(IModelType model) {

        Device device = null;
        if (ToshibaIModelType.WASHING_MACHINE.equals(model)) {
            Toshiba toshiba = new Toshiba((ToshibaIModelType) model);
            device = generateDevice(BrandType.TOSHIBA, toshiba.getToshibaModelType());

        }
        return device;
    }
}

package mbb.com.test;

import mbb.com.test.factory.DeviceFactory;
import mbb.com.test.model.enumType.*;

public class Main {

    public static void main(String[] args) {

        Socket socket = new Socket();
        socket.plugIn(DeviceFactory.factory(BrandType.SONY, SonyIModelType.PLAYSTATION_4));
        socket.plugIn(DeviceFactory.factory(BrandType.MICROSOFT, MicrosoftIModelType.XBOX_ONE));
        socket.plugIn(DeviceFactory.factory(BrandType.SONY, SonyIModelType.SMART_TV));
        socket.plugIn(DeviceFactory.factory(BrandType.APPLE, AppleIModelType.MACBOOK));
        socket.plugIn(DeviceFactory.factory(BrandType.SAMSUNG, SamsungIModelType.SMART_TV));
        socket.plugIn(DeviceFactory.factory(BrandType.SAMSUNG, SamsungIModelType.LASERJET_PRINTER));
        socket.plugIn(DeviceFactory.factory(BrandType.SAMSUNG, SamsungIModelType.VACUUM_CLEANER));
        socket.plugIn(DeviceFactory.factory(BrandType.TOSHIBA, ToshibaIModelType.WASHING_MACHINE));
    }

}

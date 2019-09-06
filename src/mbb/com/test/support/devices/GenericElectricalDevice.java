package mbb.com.test.support.devices;

import mbb.com.test.support.Device;

/**
 * Created by MAX COMPUTER on 9/6/2019.
 */
public class GenericElectricalDevice implements Device {
    String name;
    public GenericElectricalDevice(String deviceName) {
        name = deviceName;
    }

    @Override
    public String getName() {
        return name;
    }
}

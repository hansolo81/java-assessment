package mbb.com.test.support;

import mbb.com.test.support.devices.*;

import java.util.HashMap;
import java.util.Map;

public class Socket {

    private Map<String, Device> supportedDevices = new HashMap<>();
    private Map<String, Device> pluggedDevices = new HashMap<>();

    protected Socket() {
    }


    /**
     * Registers new Device to supported devices by Socket. we might be adding new devices in future
     *
     * @param device
     */
    public synchronized void registerDevice(Device device) {
        if (!isSupportedDevice(device.getName())) {
            supportedDevices.put(device.getName(), device);
        }
    }

    void registerDefaultSupportedDevices() {
        registerDevice(new SonyPlaystation4());
        registerDevice(new MicrosoftXBoxOne());
        registerDevice(new SonySmartTV());
        registerDevice(new AppleMacbook());
        registerDevice(new SamsungSmartTV());
        registerDevice(new SamsungVacuumCleaner());
        registerDevice(new SamsungLaserjetPrinter());
    }


    /**
     * Checks device is in supported devices by socket
     *
     * @param device
     * @return
     */
    private boolean isSupportedDevice(String device) {
        return supportedDevices.containsKey(device);
    }

    /**
     * Plugs in new device with name
     *
     * @param deviceName
     */
    public void plugIn(String deviceName) {
        Device device = getSupportedDevice(deviceName);
        if (isSupportedDevice(deviceName)) {
            System.out.println("You have plugged in a(an) " + device.getName());
        } else {
            System.out.println("You have plugged in a Generic Electrical Device: " + deviceName);
        }
        if (!pluggedDevices.containsKey(deviceName)) {
            addPluggedInDevices(device);
        }
    }

    /**
     * Registers new device to plugged-in devices
     *
     * @param device
     */
    private synchronized void addPluggedInDevices(Device device) {
        if (!pluggedDevices.containsKey(device.getName())) {
            pluggedDevices.put(device.getName(), device);
        } else {
            Device pluggedDevice = pluggedDevices.get(device.getName());
            // replace plugged device with non generic ones
            if (pluggedDevice instanceof GenericElectricalDevice && !(device instanceof GenericElectricalDevice)) {
                pluggedDevices.put(device.getName(), device);
            }
        }


    }

    /**
     * Gets supported device, if does not support then return new {@link GenericElectricalDevice}
     *
     * @param deviceName
     * @return
     */
    private Device getSupportedDevice(String deviceName) {
        Device device = supportedDevices.get(deviceName);
        return device != null ? device : new GenericElectricalDevice(deviceName);
    }


    /**
     * Prints all plugged-in devices
     */
    public void showPluggedInDevices() {
        pluggedDevices.forEach((name, device) -> {
            if (!isSupportedDevice(device.getName())){
                System.out.println("Generic Device: " + device.getName());
            }else {
                System.out.println(device.getName());
            }
        });
    }

}

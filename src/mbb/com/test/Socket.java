package mbb.com.test;

import mbb.com.test.support.Device;
import mbb.com.test.support.devices.*;

import java.util.HashMap;
import java.util.Map;

public class Socket {

    private Map<String, Device> supportedDevices = new HashMap<>();
    private Map<String, Device> pluggedDevices = new HashMap<>();

    public Socket() {
        registerSupportedDevices();
    }


    /**
     * Registers new Device to supported devices by Socket. we might be adding new devices in future
     *
     * @param device
     */
    public void registerDevice(Device device) {
        addDevice(device);
    }

    private void registerSupportedDevices() {
        addDevice(new SonyPlaystation4());
        addDevice(new MicrosoftXBoxOne());
        addDevice(new SonySmartTV());
        addDevice(new AppleMacbook());
        addDevice(new SamsungSmartTV());
        addDevice(new SamsungVacuumCleaner());
        addDevice(new SamsungLaserjetPrinter());
    }

    private void addDevice(Device device) {
        supportedDevices.put(device.getName(), device);
        System.out.println("");
    }

    private boolean isSupportedDevice(String device) {
        return supportedDevices.containsKey(device);
    }

    public void plugIn(String deviceName) {
        Device device = getDevice(deviceName);
        if (isSupportedDevice(deviceName)) {
            System.out.println("You have plugged in a(an) " + device.getName());
        } else {
            System.out.println("You have plugged in a Generic Electrical Device: " + deviceName);
        }
        if (!pluggedDevices.containsKey(deviceName)) {
            addPluggedInDevices(device);
        }
    }

    private void addPluggedInDevices(Device device) {
        pluggedDevices.put(device.getName(), device);
    }

    private Device getDevice(String deviceName) {
        Device device = supportedDevices.get(deviceName);
        return device!=null ? device : new GenericElectricalDevice(deviceName);
    }


    public void showPluggedInDevices() {
        pluggedDevices.forEach((name, device) -> System.out.println(device));
    }

    public static void main(String[] args) {
        Socket socket = new Socket();
        socket.plugIn("Sony Playstation 4");
        socket.plugIn("Microsoft XBox One");
        socket.plugIn("Sony Smart TV");
        socket.plugIn("Apple Macbook");
        socket.plugIn("Samsung Smart TV");
        socket.plugIn("Samsung Vacuum Cleaner");
        socket.plugIn("Samsung Laserjet Printer");
        socket.plugIn("Toshiba Washing Machine");
        socket.registerDevice(new ToshibaWashingMachine());
        socket.plugIn("Toshiba Washing Machine");
        socket.showPluggedInDevices();
        //we might be adding new devices in future
    }

}

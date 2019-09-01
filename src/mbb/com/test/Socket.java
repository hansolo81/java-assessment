package mbb.com.test;

import mbb.com.test.model.Device;

public class Socket {

    public Socket() {
    }

    public void plugIn(Device device) {
        if (device != null) {
            System.out.println("You have plugged in a " + device.toString());
        } else {
            System.out.println("You have plugged in a Generic Electrical Device");
        }
    }

}

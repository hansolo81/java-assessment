package mbb.com.test.support;

/**
 * Created by MAX COMPUTER on 9/6/2019.
 */
public class SocketBuilder {
    private Socket socket;

    public SocketBuilder() {
        socket = new Socket();
        socket.registerDefaultSupportedDevices();
    }

    public SocketBuilder registerDevice(Device device) {
        socket.registerDevice(device);
        return this;
    }

    public SocketBuilder plugIn(String deviceName) {
        socket.plugIn(deviceName);
        return this;
    }

    public Socket build() {
        return socket;
    }
}

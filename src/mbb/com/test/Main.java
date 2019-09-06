package mbb.com.test;

import mbb.com.test.support.Socket;
import mbb.com.test.support.SocketBuilder;

/**
 * Created by MAX COMPUTER on 9/6/2019.
 */
public class Main {
    public static void main(String[] args) {
        Socket socket = new SocketBuilder()
                .plugIn("Sony Playstation 4")
                .plugIn("Microsoft XBox One")
                .plugIn("Sony Smart TV")
                .plugIn("Apple Macbook")
                .plugIn("Samsung Smart TV")
                .plugIn("Samsung Vacuum Cleaner")
                .plugIn("Samsung Laserjet Printer")
                .plugIn("Toshiba Washing Machine").build();
        // shows that Toshiba Washing Machine is a Generic Device
        System.out.println();
        // register Toshiba Washing Machine as a supported device
        socket.registerDevice(new ToshibaWashingMachine());
        // shows that Toshiba Washing Machine is a Supported Device
        socket.showPluggedInDevices();


        // register toshiba device at build time
        Socket socket2 = new SocketBuilder().registerDevice(new ToshibaWashingMachine())
                .plugIn("Sony Playstation 4")
                .plugIn("Microsoft XBox One")
                .plugIn("Sony Smart TV")
                .plugIn("Apple Macbook")
                .plugIn("Samsung Smart TV")
                .plugIn("Samsung Vacuum Cleaner")
                .plugIn("Samsung Laserjet Printer")
                .plugIn("Toshiba Washing Machine").build();
        // shows that Toshiba Washing Machine is a Supported Device
        socket2.showPluggedInDevices();

    }
}

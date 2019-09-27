package com.solid.solid;

/**
 * @author Omid
 *
 */
public class Socket
{

    public Socket()
    {
    }

    public void plugIn(String device)
    {
        String plugIn = DeviceFactory.getDevice(device).plugIn();
        System.out.println(plugIn);
    }

    public static void main(String[] args)
    {
        Socket socket = new Socket();
        socket.plugIn("Sony Playstation 4");
        socket.plugIn("Microsoft XBox One");
        socket.plugIn("Sony Smart TV");
        socket.plugIn("Apple Macbook");
        socket.plugIn("Samsung Smart TV");
        socket.plugIn("Samsung Vacuum Cleaner");
        socket.plugIn("Samsung Laserjet Printer");
        socket.plugIn("Toshiba Washing Machine");
        // we might be adding new devices in future
    }

}

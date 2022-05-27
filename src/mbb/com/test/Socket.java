package mbb.com.test;

import mbb.com.domain.*;

public class Socket {
	private List<Device> pligIns = new ArrayList<Device>();
	
	public Socket() {	
	}
	
	public void plugIn(Device device) {
		plugIns.append(device);
		System.out.println("You have plugged in a "+device.getName());
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
		//we might be adding new devices in future
	}

}

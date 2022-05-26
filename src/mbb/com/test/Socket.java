package mbb.com.test;

public class Socket {
	private List<Device> pligIns = new ArrayList<Device>();
	
	public Socket() {	
	}
	
	public void plugIn(Device device) {
		System.out.println("You have plugged in a "+device.getName())
		if (device.equals("Sony Playstation 4")) {
			System.out.println("You have plugged in a Sony Playstation 4");
		} 
		else if (device.equals("Microsoft XBox One")) {
			System.out.println("You have plugged in a Microsoft XBox One");
		}
		else if (device.equals("Sony Smart TV")) {
			System.out.println("You have plugged in a Sony Smart TV");
		}
		else if (device.equals("Apple Macbook")) {
			System.out.println("You have plugged in an Apple Macbook");
		}
		else if (device.equals("Samsung Smart TV")) {
			System.out.println("You have plugged in a Samsung Smart TV");
		}
		else if (device.equals("Samsung Vacuum Cleaner")) {
			System.out.println("You have plugged in a Samsung Vacuum Cleaner");
		}
		else if (device.equals("Samsung Smart TV")) {
			System.out.println("You have plugged in a Samsung Laserjet Printer");
		} else {
			System.out.println("You have plugged in a Generic Electrical Device");
		}

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

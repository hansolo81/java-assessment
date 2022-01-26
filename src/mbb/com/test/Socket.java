package mbb.com.test;

import java.util.*;

class Device // data model
{
        public  String  Name ;
        public String  Value ;
} 

interface Plugin  // interface
 {
       void addDevice (Device device);
        void plugIn(String device);
        void printout(String device);
 }

class Socket implements Plugin  // parent class 
{
    
   ArrayList<Device> Listofdevice = new ArrayList<Device>();
   
    public Socket() {
	}
	
	public void addDevice (Device device) // method to add the device
    {
        if(device != null)
        {
            Listofdevice.add(device);
        }
        else
        {
            //log the error 
        }
    }
	
	public void plugIn(String device) // method to find the value 
	{	
	    boolean isJavaFun = false;
		for (var tdevice : Listofdevice)
        {
            if (tdevice.Name.equals(device))
            {
                 printout(tdevice.Value);
                 isJavaFun = true;
            }
        }
        
        if(!isJavaFun)
        {
             printout("You have plugged in a Generic Electrical Device");
        }
	}
	
    public void printout(String device) // method print out the value
    {
        System.out.println(device);
    }
    
    
     public static void main(String[] args) {
        Socket socket = new Socket();
        initialize(socket);
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
    
    static void initialize(Socket socket) // initialize the data 
    {
        Device myObj1 = new Device(); 
        myObj1.Name = "Sony Playstation 4";
        myObj1.Value= "You have plugged in a Sony Playstation 4";
        socket.addDevice(myObj1);
        
        Device myObj2 = new Device();  
        myObj2.Name = "Microsoft XBox One";
        myObj2.Value= "You have plugged in a Microsoft XBox One";
        socket.addDevice(myObj2);
        
        Device myObj3 = new Device();  
        myObj3.Name =  "Sony Smart TV";
        myObj3.Value= "You have plugged in a Sony Smart TV";
        socket.addDevice(myObj3);
        
        Device myObj4 = new Device();  
        myObj4.Name ="Apple Macbook";
        myObj4.Value= "You have plugged in an Apple Macbook";
        socket.addDevice(myObj4);
        
        Device myObj5 = new Device();  
        myObj5.Name = "Samsung Smart TV";
        myObj5.Value= "You have plugged in a Samsung Smart TV";
        socket.addDevice(myObj5);
        
        Device myObj6 = new Device();  
        myObj6.Name = "Samsung Vacuum Cleaner";
        myObj6.Value= "You have plugged in a Samsung Vacuum Cleaner";
        socket.addDevice(myObj6);
        
         Device myObj7 = new Device();  
        myObj7.Name = "Samsung Smart TV";
        myObj7.Value= "You have plugged in a Samsung Laserjet Printer";
        socket.addDevice(myObj7);
    }
}

package com.solid.solid;

/**
 * @author Omid
 *
 */
public enum DeviceType implements Device
{

    PS4("Sony Playstation 4"){
        public String plugIn()
        {
            return "You have plugged in a Sony Playstation 4";
        }
    },
    XBOX("Microsoft XBox One"){
        public String plugIn()
        {
            return "You have plugged in a Microsoft XBox One";
            
        }
    },
    SonySmartTV("Sony Smart TV"){
        public String plugIn()
        {
            return "You have plugged in a Sony Smart TV";
            
        }
    },
    MAC("Apple Macbook"){
        @Override
        public String plugIn()
        {
            return "You have plugged in an Apple Macbook";
            
        }
    },
    SamsungSmartTV("Samsung Smart TV"){
        @Override
        public String plugIn()
        {
            return "You have plugged in a Samsung Smart TV";            
        }
    },
    SamsungVaccumCleaner("Samsung Vacuum Cleaner"){
        @Override
        public String plugIn()
        {
            return "You have plugged in a Samsung Vacuum Cleaner";
            
        }
    },
    SamsungLaserJet("Samsung Laserjet Printer"){
        @Override
        public String plugIn()
        {
            return "You have plugged in a Samsung Laserjet Printer";
        }
    },
    GENRAL(""){
        @Override
        public String plugIn()
        {
            return "You have plugged in a Generic Electrical Device";            
        }
    };
    
    private String label;
    
    

    private DeviceType(String label)
    {
        this.label = label;
    }



    public String getLabel()
    {
        return label;
    }
    
    
    
}

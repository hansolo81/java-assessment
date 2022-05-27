package mbb.com.domain;

//singleton
//factory 
public class DeviceFactory{
  private DeviceFactory(){}
  private DeviceFactory instanse;
  public DeviceFactory getInstanse(){
    if (instanse==null){
      instanse = new DeviceFactory();
      return instanse;
    }
  };
  public Device createDevice(String deviceType){
    //simplification here to reduce code amount
    Device device = new Device(deviceType){
      //override
      public void doDeviceFunction(){
        System.out.println("This is immitattion of unique "+this.name+"'s functionality")
      }
    }
    return device;
  }
    
}

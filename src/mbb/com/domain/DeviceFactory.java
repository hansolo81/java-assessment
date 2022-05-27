package mbb.com.domain;

public class DeviceFactory{
  private DeviceFactory(){}
  private DeviceFactory instanse;
  public DeviceFactory getInstanse(){
    if (instanse==null){
      instanse = new DeviceFactory();
      return instanse;
    }
  };
  public Device getDevice(String deviceType){
    return device;
  }
    
}

package com.solid.solid;

import java.util.Arrays;

/**
 * @author Omid
 *
 */
public class DeviceFactory
{

    
    public static Device getDevice(String deviceType)
    {
        return Arrays.stream(DeviceType.values())
            .filter(f->f.getLabel().equals(deviceType))
            .findFirst()
            .orElse(DeviceType.GENRAL);
    }
    
    
}

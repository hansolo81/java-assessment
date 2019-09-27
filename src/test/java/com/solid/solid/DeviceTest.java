package com.solid.solid;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * Omid
 */
public class DeviceTest 
{
    
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testSony()
    {
        Device device = DeviceFactory.getDevice("Sony Playstation 4");
        String plugIn = device.plugIn();
        Assert.assertEquals(plugIn, "You have plugged in a Sony Playstation 4");
    }
    
}

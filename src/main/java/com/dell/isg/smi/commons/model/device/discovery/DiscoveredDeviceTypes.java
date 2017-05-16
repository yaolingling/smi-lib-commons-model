/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class DiscoveredDeviceTypes.
 */
public class DiscoveredDeviceTypes {

    String deviceName;

    int discovered;

    List<DiscoveredDeviceInfo> discoveredDeviceInfoList = new ArrayList<DiscoveredDeviceInfo>();


    /**
     * Gets the device name.
     *
     * @return the device name
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the device name.
     *
     * @param deviceName the new device name
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the discovered.
     *
     * @return the discovered
     */
    public int getDiscovered() {
        return discovered;
    }


    /**
     * Sets the discovered.
     *
     * @param discovered the new discovered
     */
    public void setDiscovered(int discovered) {
        this.discovered = discovered;
    }


    /**
     * Gets the discovered device info list.
     *
     * @return the discovered device info list
     */
    public List<DiscoveredDeviceInfo> getDiscoveredDeviceInfoList() {
        return discoveredDeviceInfoList;
    }


    /**
     * Sets the discovered device info list.
     *
     * @param discoveredDeviceInfoList the new discovered device info list
     */
    public void setDiscoveredDeviceInfoList(List<DiscoveredDeviceInfo> discoveredDeviceInfoList) {
        this.discoveredDeviceInfoList = discoveredDeviceInfoList;
    }

}

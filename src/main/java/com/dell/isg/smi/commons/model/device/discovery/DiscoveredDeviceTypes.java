/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.ArrayList;
import java.util.List;

public class DiscoveredDeviceTypes {

    String deviceName;

    int discovered;

    List<DiscoveredDeviceInfo> discoveredDeviceInfoList = new ArrayList<DiscoveredDeviceInfo>();


    public String getDeviceName() {
        return deviceName;
    }


    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    public int getDiscovered() {
        return discovered;
    }


    public void setDiscovered(int discovered) {
        this.discovered = discovered;
    }


    public List<DiscoveredDeviceInfo> getDiscoveredDeviceInfoList() {
        return discoveredDeviceInfoList;
    }


    public void setDiscoveredDeviceInfoList(List<DiscoveredDeviceInfo> discoveredDeviceInfoList) {
        this.discoveredDeviceInfoList = discoveredDeviceInfoList;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class DiscoverdDeviceResponse.
 */
public class DiscoverdDeviceResponse {

    private String deviceGroup;
    private List<DiscoveredDeviceTypes> discoveredDeviceList = new ArrayList<>();


    /**
     * Gets the device group.
     *
     * @return the device group
     */
    public String getDeviceGroup() {
        return deviceGroup;
    }


    /**
     * Sets the device group.
     *
     * @param deviceGroup the new device group
     */
    public void setDeviceGroup(String deviceGroup) {
        this.deviceGroup = deviceGroup;
    }


    /**
     * Gets the discovered device list.
     *
     * @return the discovered device list
     */
    public List<DiscoveredDeviceTypes> getDiscoveredDeviceList() {
        return discoveredDeviceList;
    }


    /**
     * Sets the discovered device types list.
     *
     * @param discoveredDeviceList the new discovered device types list
     */
    public void setDiscoveredDeviceTypesList(List<DiscoveredDeviceTypes> discoveredDeviceList) {
        this.discoveredDeviceList = discoveredDeviceList;
    }

}

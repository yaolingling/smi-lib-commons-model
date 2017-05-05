/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.ArrayList;
import java.util.List;

public class DiscoverdDeviceResponse {

    public String deviceGroup;

    List<DiscoveredDeviceTypes> discoveredDeviceList = new ArrayList<>();


    public String getDeviceGroup() {
        return deviceGroup;
    }


    public void setDeviceGroup(String deviceGroup) {
        this.deviceGroup = deviceGroup;
    }


    public List<DiscoveredDeviceTypes> getDiscoveredDeviceList() {
        return discoveredDeviceList;
    }


    public void setDiscoveredDeviceTypesList(List<DiscoveredDeviceTypes> discoveredDeviceList) {
        this.discoveredDeviceList = discoveredDeviceList;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class DiscoveredDeviceTypes.
 */

@ApiModel(value = "DiscoveredDeviceTypes", description = " Discovered devices are grouped by filter types such as SERVER / CHASSIS / SWITCH or STORAGE . ")
public class DiscoveredDeviceTypes {

	@ApiModelProperty(value = "Device type name .It could be IDRAC6 : IDRAC7 : IDRAC8 : IDRAC9 : CMC : CMC_FX2 : CSERVER : VRTX : VCENTER : FORCE10_S4810 : FORCE10_S5000 : FORCE10_S6000 : FORCE10_S4048 : FORCE10_S55 : FORCE10IOM : FX2_IOM : DELL_IOM_84 : BROCADE : POWERCONNECT : POWERCONNECT_N3000 : POWERCONNECT_N4000 : CISCONEXUS : EQUALLOGIC_NODISCOVER : EM_COMPELLENT : EQUALLOGIC : COMPELLENT ", dataType = "string")
    String deviceName;

	@ApiModelProperty(value = "Number of device typediscovered in the range. ", dataType = "integer")
    int discovered;

	@ApiModelProperty(value = "List of discovered type information.", dataType = "DiscoveredDeviceInfo.class")
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

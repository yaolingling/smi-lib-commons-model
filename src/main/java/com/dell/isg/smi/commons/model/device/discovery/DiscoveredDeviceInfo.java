/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class DiscoveredDeviceInfo.
 */

@ApiModel(value = "DiscoveredDeviceInfo", description = "Discovered device information. ")

public class DiscoveredDeviceInfo {
	
	@ApiModelProperty(value = "IPv4 address of the device", dataType = "string")
    String ipAddress;

	@ApiModelProperty(value = "Mac Address of the device would be null based on the network layer of discovery. arping is used for finding the mac address ", dataType = "string")
    String macAddress;

    @ApiModelProperty(value = "Device of the associated IP. It could be IDRAC6 : IDRAC7 : IDRAC8 : IDRAC9 : CMC : CMC_FX2 : CSERVER : VRTX : VCENTER : FORCE10_S4810 : FORCE10_S5000 : FORCE10_S6000 : FORCE10_S4048 : FORCE10_S55 : FORCE10IOM : FX2_IOM : DELL_IOM_84 : BROCADE : POWERCONNECT : POWERCONNECT_N3000 : POWERCONNECT_N4000 : CISCONEXUS : EQUALLOGIC_NODISCOVER : EM_COMPELLENT : EQUALLOGIC : COMPELLENT  : UNKNOWN", dataType = "string")
	String deviceType = DiscoveryDeviceTypeEnum.UNKNOWN.name();

	@ApiModelProperty(value = "Discovery status . It could be any on these status . UNKNOWN : TIMEDOUT : STARTED(\"Started discovery process\") : DEVICE_IDENTFIED : NO_DEVICE(\"No device identifed\") : SUMMARY_INPROGRESS : DEVICE_DISCOVERED_SUMMARY_FAILED(\"Device is discovered without summary.\") : SUCCESS(\"Successfully discovered with device summary.\") : FAILED(\"Failed to discover\")", dataType = "string")
    String status = DiscoveryDeviceStatus.UNKNOWN.name();
	
	@ApiModelProperty(value = "Brief summary  for discovered device. Supported - SERVER,CHASSIS and STORAGE (Complellent) .Not supported SWITCH. ", dataType = "HwSystem.class")
    Object summary;


    /**
     * Gets the mac address.
     *
     * @return the mac address
     */
    public String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the mac address.
     *
     * @param macAddress the new mac address
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the device type.
     *
     * @return the device type
     */
    public String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the device type.
     *
     * @param deviceType the new device type
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the ip address.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ip address.
     *
     * @param ipAddress the new ip address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }


    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * Gets the summary.
     *
     * @return the summary
     */
    public Object getSummary() {
        return summary;
    }


    /**
     * Sets the summary.
     *
     * @param summary the new summary
     */
    public void setSummary(Object summary) {
        this.summary = summary;
    }

}

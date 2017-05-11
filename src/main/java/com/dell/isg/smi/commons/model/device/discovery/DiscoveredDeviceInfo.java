/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

/**
 * The Class DiscoveredDeviceInfo.
 */
public class DiscoveredDeviceInfo {
    String ipAddress;

    String macAddress;

    String deviceType = DiscoveryDeviceTypeEnum.UNKNOWN.name();

    String status = DiscoveryDeviceStatus.UNKNOWN.name();

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

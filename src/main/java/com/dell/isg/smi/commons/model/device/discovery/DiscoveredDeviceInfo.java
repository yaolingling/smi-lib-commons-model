/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

public class DiscoveredDeviceInfo {
    String ipAddress;

    String macAddress;

    String deviceType = DiscoveryDeviceTypeEnum.UNKNOWN.name();

    String status = DiscoveryDeviceStatus.UNKNOWN.name();

    Object summary;


    public String getMacAddress() {
        return macAddress;
    }


    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }


    public String getDeviceType() {
        return deviceType;
    }


    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    public String getIpAddress() {
        return ipAddress;
    }


    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Object getSummary() {
        return summary;
    }


    public void setSummary(Object summary) {
        this.summary = summary;
    }

}

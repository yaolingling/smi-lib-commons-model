/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = { "deviceId", "deviceIdentifier", "manufacturer", "model", "deviceType", "powerState", "deviceState", "overallHealth", "deviceStatusCode", "deviceStatusMessageCode", "managementInfo" })
public class DeviceInfo {

    @XmlElement(required = true)
    private long deviceId;

    @XmlElement(required = true)
    private String deviceIdentifier;

    @XmlElement(required = false)
    private String manufacturer;

    @XmlElement(required = false)
    private String model;

    @XmlElement(required = false)
    private String deviceType;

    @XmlElement(required = false)
    private String powerState;

    @XmlElement(required = false)
    private String deviceState;

    @XmlElement(required = false)
    private String overallHealth;

    @XmlElement(required = false)
    private long deviceStatusCode;

    @XmlElement(required = false)
    private long deviceStatusMessageCode;

    @XmlElement(required = false)
    private List<ManagementInfo> managementInfo;


    public long getDeviceId() {
        return deviceId;
    }


    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }


    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getDeviceType() {
        return deviceType;
    }


    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    public String getPowerState() {
        return powerState;
    }


    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }


    public String getDeviceState() {
        return deviceState;
    }


    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }


    public String getOverallHealth() {
        return overallHealth;
    }


    public void setOverallHealth(String overallHealth) {
        this.overallHealth = overallHealth;
    }


    public long getDeviceStatusCode() {
        return deviceStatusCode;
    }


    public void setDeviceStatusCode(long deviceStatusCode) {
        this.deviceStatusCode = deviceStatusCode;
    }


    public long getDeviceStatusMessageCode() {
        return deviceStatusMessageCode;
    }


    public void setDeviceStatusMessageCode(long deviceStatusMessageCode) {
        this.deviceStatusMessageCode = deviceStatusMessageCode;
    }


    public List<ManagementInfo> getManagementInfo() {
        return managementInfo;
    }


    public void setManagementInfo(List<ManagementInfo> managementInfo) {
        this.managementInfo = managementInfo;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class DeviceInfo.
 */
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


    /**
     * Gets the device id.
     *
     * @return the device id
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the device id.
     *
     * @param deviceId the new device id
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the device identifier.
     *
     * @return the device identifier
     */
    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the device identifier.
     *
     * @param deviceIdentifier the new device identifier
     */
    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the new manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }


    /**
     * Sets the model.
     *
     * @param model the new model
     */
    public void setModel(String model) {
        this.model = model;
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
     * Gets the power state.
     *
     * @return the power state
     */
    public String getPowerState() {
        return powerState;
    }


    /**
     * Sets the power state.
     *
     * @param powerState the new power state
     */
    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }


    /**
     * Gets the device state.
     *
     * @return the device state
     */
    public String getDeviceState() {
        return deviceState;
    }


    /**
     * Sets the device state.
     *
     * @param deviceState the new device state
     */
    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }


    /**
     * Gets the overall health.
     *
     * @return the overall health
     */
    public String getOverallHealth() {
        return overallHealth;
    }


    /**
     * Sets the overall health.
     *
     * @param overallHealth the new overall health
     */
    public void setOverallHealth(String overallHealth) {
        this.overallHealth = overallHealth;
    }


    /**
     * Gets the device status code.
     *
     * @return the device status code
     */
    public long getDeviceStatusCode() {
        return deviceStatusCode;
    }


    /**
     * Sets the device status code.
     *
     * @param deviceStatusCode the new device status code
     */
    public void setDeviceStatusCode(long deviceStatusCode) {
        this.deviceStatusCode = deviceStatusCode;
    }


    /**
     * Gets the device status message code.
     *
     * @return the device status message code
     */
    public long getDeviceStatusMessageCode() {
        return deviceStatusMessageCode;
    }


    /**
     * Sets the device status message code.
     *
     * @param deviceStatusMessageCode the new device status message code
     */
    public void setDeviceStatusMessageCode(long deviceStatusMessageCode) {
        this.deviceStatusMessageCode = deviceStatusMessageCode;
    }


    /**
     * Gets the management info.
     *
     * @return the management info
     */
    public List<ManagementInfo> getManagementInfo() {
        return managementInfo;
    }


    /**
     * Sets the management info.
     *
     * @param managementInfo the new management info
     */
    public void setManagementInfo(List<ManagementInfo> managementInfo) {
        this.managementInfo = managementInfo;
    }

}

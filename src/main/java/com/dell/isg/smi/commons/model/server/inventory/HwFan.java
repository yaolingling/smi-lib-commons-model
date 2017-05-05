/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */

package com.dell.isg.smi.commons.model.server.inventory;

public class HwFan {

    public HwFan() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected long id;

    protected String fqdd;

    protected String activeCooling;

    protected String currentReading;

    protected String deviceDescription;

    protected String pwm;

    protected String primaryStatus;

    protected String redundancyStatus;
    protected String minWarningThreshold;
    protected String maxWarningThreshold;
    protected String minCriticalThreshold;
    protected String maxCriticalThreshold;


    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the fqdd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFqdd() {
        return fqdd;
    }


    /**
     * Sets the value of the fqdd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFqdd(String value) {
        this.fqdd = value;
    }


    /**
     * Gets the value of the activeCooling property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getActiveCooling() {
        return activeCooling;
    }


    /**
     * Sets the value of the activeCooling property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setActiveCooling(String value) {
        this.activeCooling = value;
    }


    /**
     * Gets the value of the currentReading property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCurrentReading() {
        return currentReading;
    }


    /**
     * Sets the value of the currentReading property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCurrentReading(String value) {
        this.currentReading = value;
    }


    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }


    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }


    /**
     * Gets the value of the pwm property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPwm() {
        return pwm;
    }


    /**
     * Sets the value of the pwm property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPwm(String value) {
        this.pwm = value;
    }


    /**
     * Gets the value of the primaryStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPrimaryStatus() {
        return primaryStatus;
    }


    /**
     * Sets the value of the primaryStatus property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPrimaryStatus(String value) {
        this.primaryStatus = value;
    }


    /**
     * Gets the value of the redundancyStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRedundancyStatus() {
        return redundancyStatus;
    }


    /**
     * Sets the value of the redundancyStatus property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRedundancyStatus(String value) {
        this.redundancyStatus = value;
    }


    /**
     * Gets the value of the minWarningThreshold property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMinWarningThreshold() {
        return minWarningThreshold;
    }


    /**
     * Sets the value of the minWarningThreshold property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMinWarningThreshold(String value) {
        this.minWarningThreshold = value;
    }


    /**
     * Gets the value of the maxWarningThreshold property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMaxWarningThreshold() {
        return maxWarningThreshold;
    }


    /**
     * Sets the value of the maxWarningThreshold property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMaxWarningThreshold(String value) {
        this.maxWarningThreshold = value;
    }


    /**
     * Gets the value of the minCriticalThreshold property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMinCriticalThreshold() {
        return minCriticalThreshold;
    }


    /**
     * Sets the value of the minCriticalThreshold property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMinCriticalThreshold(String value) {
        this.minCriticalThreshold = value;
    }


    /**
     * Gets the value of the maxCriticalThreshold property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMaxCriticalThreshold() {
        return maxCriticalThreshold;
    }


    /**
     * Sets the value of the maxCriticalThreshold property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMaxCriticalThreshold(String value) {
        this.maxCriticalThreshold = value;
    }

}

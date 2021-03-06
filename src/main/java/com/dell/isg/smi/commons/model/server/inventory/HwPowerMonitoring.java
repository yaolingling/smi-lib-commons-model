/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.10 at 02:30:44 PM CST 
//

package com.dell.isg.smi.commons.model.server.inventory;

/**
 * The Class HwPowerMonitoring.
 */
public class HwPowerMonitoring {

    public HwPowerMonitoring() {
        super();
    }

    protected long id;

    protected String fqdd;

    protected String powerCap;

    protected String profile;

    protected String warningThreshold;

    protected String failureThreshold;

    protected String systemInstantaneousHeadroom;

    protected String systemPeakHeadroom;

    protected String energyConsumption;

    protected String energyConsumptionStartDateTime;

    protected String energyConsumptionEndDateTime;

    protected String systemPeakPower;

    protected String systemPeakPowerStartDateTime;

    protected String systemPeakPowerEndDateTime;

    protected String systemPeakAmps;

    protected String peakAmpsStartDateTime;

    protected String peakAmpsEndDateTime;

    protected String probeName;

    protected String currentReading;

    protected String lastHourPeakTime;

    protected String lastHourPeakAverage;

    protected String lastHourPeakMax;

    protected String lastHourPeakMaxTime;

    protected String lastHourPeakMin;

    protected String lastHourPeakMinTime;

    protected String lastDayPeakTime;

    protected String lastDayPeakAverage;

    protected String lastDayPeakMax;

    protected String lastDayPeakMaxTime;

    protected String lastDayPeakMin;

    protected String lastDayPeakMinTime;

    protected String lastWeekPeakTime;

    protected String lastWeekPeakAverage;

    protected String lastWeekPeakMax;

    protected String lastWeekPeakMaxTime;

    protected String lastWeekPeakMin;

    protected String lastWeekPeakMinTime;


    /**
     * Gets the value of the id property.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     * @param value the new id
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
     * Gets the value of the powerCap property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPowerCap() {
        return powerCap;
    }


    /**
     * Sets the value of the powerCap property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPowerCap(String value) {
        this.powerCap = value;
    }


    /**
     * Gets the value of the profile property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProfile() {
        return profile;
    }


    /**
     * Sets the value of the profile property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setProfile(String value) {
        this.profile = value;
    }


    /**
     * Gets the value of the warningThreshold property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWarningThreshold() {
        return warningThreshold;
    }


    /**
     * Sets the value of the warningThreshold property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setWarningThreshold(String value) {
        this.warningThreshold = value;
    }


    /**
     * Gets the value of the failureThreshold property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFailureThreshold() {
        return failureThreshold;
    }


    /**
     * Sets the value of the failureThreshold property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFailureThreshold(String value) {
        this.failureThreshold = value;
    }


    /**
     * Gets the value of the systemInstantaneousHeadroom property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSystemInstantaneousHeadroom() {
        return systemInstantaneousHeadroom;
    }


    /**
     * Sets the value of the systemInstantaneousHeadroom property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSystemInstantaneousHeadroom(String value) {
        this.systemInstantaneousHeadroom = value;
    }


    /**
     * Gets the value of the systemPeakHeadroom property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSystemPeakHeadroom() {
        return systemPeakHeadroom;
    }


    /**
     * Sets the value of the systemPeakHeadroom property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSystemPeakHeadroom(String value) {
        this.systemPeakHeadroom = value;
    }


    /**
     * Gets the value of the energyConsumption property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEnergyConsumption() {
        return energyConsumption;
    }


    /**
     * Sets the value of the energyConsumption property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setEnergyConsumption(String value) {
        this.energyConsumption = value;
    }


    /**
     * Gets the value of the energyConsumptionStartDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEnergyConsumptionStartDateTime() {
        return energyConsumptionStartDateTime;
    }


    /**
     * Sets the value of the energyConsumptionStartDateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setEnergyConsumptionStartDateTime(String value) {
        this.energyConsumptionStartDateTime = value;
    }


    /**
     * Gets the value of the energyConsumptionEndDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEnergyConsumptionEndDateTime() {
        return energyConsumptionEndDateTime;
    }


    /**
     * Sets the value of the energyConsumptionEndDateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setEnergyConsumptionEndDateTime(String value) {
        this.energyConsumptionEndDateTime = value;
    }


    /**
     * Gets the value of the systemPeakPower property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSystemPeakPower() {
        return systemPeakPower;
    }


    /**
     * Sets the value of the systemPeakPower property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSystemPeakPower(String value) {
        this.systemPeakPower = value;
    }


    /**
     * Gets the value of the systemPeakPowerStartDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSystemPeakPowerStartDateTime() {
        return systemPeakPowerStartDateTime;
    }


    /**
     * Sets the value of the systemPeakPowerStartDateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSystemPeakPowerStartDateTime(String value) {
        this.systemPeakPowerStartDateTime = value;
    }


    /**
     * Gets the value of the systemPeakPowerEndDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSystemPeakPowerEndDateTime() {
        return systemPeakPowerEndDateTime;
    }


    /**
     * Sets the value of the systemPeakPowerEndDateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSystemPeakPowerEndDateTime(String value) {
        this.systemPeakPowerEndDateTime = value;
    }


    /**
     * Gets the value of the systemPeakAmps property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSystemPeakAmps() {
        return systemPeakAmps;
    }


    /**
     * Sets the value of the systemPeakAmps property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSystemPeakAmps(String value) {
        this.systemPeakAmps = value;
    }


    /**
     * Gets the value of the peakAmpsStartDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPeakAmpsStartDateTime() {
        return peakAmpsStartDateTime;
    }


    /**
     * Sets the value of the peakAmpsStartDateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPeakAmpsStartDateTime(String value) {
        this.peakAmpsStartDateTime = value;
    }


    /**
     * Gets the value of the peakAmpsEndDateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPeakAmpsEndDateTime() {
        return peakAmpsEndDateTime;
    }


    /**
     * Sets the value of the peakAmpsEndDateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPeakAmpsEndDateTime(String value) {
        this.peakAmpsEndDateTime = value;
    }


    /**
     * Gets the value of the probeName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProbeName() {
        return probeName;
    }


    /**
     * Sets the value of the probeName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setProbeName(String value) {
        this.probeName = value;
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
     * Gets the value of the lastHourPeakTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastHourPeakTime() {
        return lastHourPeakTime;
    }


    /**
     * Sets the value of the lastHourPeakTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastHourPeakTime(String value) {
        this.lastHourPeakTime = value;
    }


    /**
     * Gets the value of the lastHourPeakAverage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastHourPeakAverage() {
        return lastHourPeakAverage;
    }


    /**
     * Sets the value of the lastHourPeakAverage property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastHourPeakAverage(String value) {
        this.lastHourPeakAverage = value;
    }


    /**
     * Gets the value of the lastHourPeakMax property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastHourPeakMax() {
        return lastHourPeakMax;
    }


    /**
     * Sets the value of the lastHourPeakMax property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastHourPeakMax(String value) {
        this.lastHourPeakMax = value;
    }


    /**
     * Gets the value of the lastHourPeakMaxTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastHourPeakMaxTime() {
        return lastHourPeakMaxTime;
    }


    /**
     * Sets the value of the lastHourPeakMaxTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastHourPeakMaxTime(String value) {
        this.lastHourPeakMaxTime = value;
    }


    /**
     * Gets the value of the lastHourPeakMin property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastHourPeakMin() {
        return lastHourPeakMin;
    }


    /**
     * Sets the value of the lastHourPeakMin property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastHourPeakMin(String value) {
        this.lastHourPeakMin = value;
    }


    /**
     * Gets the value of the lastHourPeakMinTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastHourPeakMinTime() {
        return lastHourPeakMinTime;
    }


    /**
     * Sets the value of the lastHourPeakMinTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastHourPeakMinTime(String value) {
        this.lastHourPeakMinTime = value;
    }


    /**
     * Gets the value of the lastDayPeakTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastDayPeakTime() {
        return lastDayPeakTime;
    }


    /**
     * Sets the value of the lastDayPeakTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastDayPeakTime(String value) {
        this.lastDayPeakTime = value;
    }


    /**
     * Gets the value of the lastDayPeakAverage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastDayPeakAverage() {
        return lastDayPeakAverage;
    }


    /**
     * Sets the value of the lastDayPeakAverage property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastDayPeakAverage(String value) {
        this.lastDayPeakAverage = value;
    }


    /**
     * Gets the value of the lastDayPeakMax property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastDayPeakMax() {
        return lastDayPeakMax;
    }


    /**
     * Sets the value of the lastDayPeakMax property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastDayPeakMax(String value) {
        this.lastDayPeakMax = value;
    }


    /**
     * Gets the value of the lastDayPeakMaxTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastDayPeakMaxTime() {
        return lastDayPeakMaxTime;
    }


    /**
     * Sets the value of the lastDayPeakMaxTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastDayPeakMaxTime(String value) {
        this.lastDayPeakMaxTime = value;
    }


    /**
     * Gets the value of the lastDayPeakMin property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastDayPeakMin() {
        return lastDayPeakMin;
    }


    /**
     * Sets the value of the lastDayPeakMin property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastDayPeakMin(String value) {
        this.lastDayPeakMin = value;
    }


    /**
     * Gets the value of the lastDayPeakMinTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastDayPeakMinTime() {
        return lastDayPeakMinTime;
    }


    /**
     * Sets the value of the lastDayPeakMinTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastDayPeakMinTime(String value) {
        this.lastDayPeakMinTime = value;
    }


    /**
     * Gets the value of the lastWeekPeakTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastWeekPeakTime() {
        return lastWeekPeakTime;
    }


    /**
     * Sets the value of the lastWeekPeakTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastWeekPeakTime(String value) {
        this.lastWeekPeakTime = value;
    }


    /**
     * Gets the value of the lastWeekPeakAverage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastWeekPeakAverage() {
        return lastWeekPeakAverage;
    }


    /**
     * Sets the value of the lastWeekPeakAverage property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastWeekPeakAverage(String value) {
        this.lastWeekPeakAverage = value;
    }


    /**
     * Gets the value of the lastWeekPeakMax property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastWeekPeakMax() {
        return lastWeekPeakMax;
    }


    /**
     * Sets the value of the lastWeekPeakMax property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastWeekPeakMax(String value) {
        this.lastWeekPeakMax = value;
    }


    /**
     * Gets the value of the lastWeekPeakMaxTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastWeekPeakMaxTime() {
        return lastWeekPeakMaxTime;
    }


    /**
     * Sets the value of the lastWeekPeakMaxTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastWeekPeakMaxTime(String value) {
        this.lastWeekPeakMaxTime = value;
    }


    /**
     * Gets the value of the lastWeekPeakMin property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastWeekPeakMin() {
        return lastWeekPeakMin;
    }


    /**
     * Sets the value of the lastWeekPeakMin property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastWeekPeakMin(String value) {
        this.lastWeekPeakMin = value;
    }


    /**
     * Gets the value of the lastWeekPeakMinTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastWeekPeakMinTime() {
        return lastWeekPeakMinTime;
    }


    /**
     * Sets the value of the lastWeekPeakMinTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastWeekPeakMinTime(String value) {
        this.lastWeekPeakMinTime = value;
    }

}

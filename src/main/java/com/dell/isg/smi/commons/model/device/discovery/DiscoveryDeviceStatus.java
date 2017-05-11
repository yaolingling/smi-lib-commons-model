/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

/**
 * The Enum DiscoveryDeviceStatus.
 */
public enum DiscoveryDeviceStatus {

    UNKNOWN("Unknown status"), TIMEDOUT("Device timeout"), STARTED("Started discovery process"), DEVICE_IDENTFIED("Device Identified."), NO_DEVICE("No device identifed"), SUMMARY_INPROGRESS("Summary Inprogress"), DEVICE_DISCOVERED_SUMMARY_FAILED("Device is discovered without summary."), SUCCESS("Successfully discovered with device summary."), FAILED("Failed to discover"), INPROGRESS("Transaction Inprogress"), COMPLETED("Transaction Completed.");

    private String _label;


    private DiscoveryDeviceStatus(String label) {
        _label = label;
    }


    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel() {
        return _label;
    }


    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue() {
        return name();
    }


    @Override
    public String toString() {
        return _label;
    }
}

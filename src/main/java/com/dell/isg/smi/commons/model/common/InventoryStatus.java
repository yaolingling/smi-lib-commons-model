/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

/**
 * The Enum InventoryStatus.
 */
public enum InventoryStatus {

    UNKNOWN("Unknown"), FAILED("Failed"), INPROGRESS("Inprogress"), COMPLETED("Completed.");

    private String _label;


    private InventoryStatus(String label) {
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

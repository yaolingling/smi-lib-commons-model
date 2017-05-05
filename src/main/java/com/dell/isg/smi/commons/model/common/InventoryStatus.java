/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

public enum InventoryStatus {

    UNKNOWN("Unknown"), FAILED("Failed"), INPROGRESS("Inprogress"), COMPLETED("Completed.");

    private String _label;


    private InventoryStatus(String label) {
        _label = label;
    }


    public String getLabel() {
        return _label;
    }


    public String getValue() {
        return name();
    }


    @Override
    public String toString() {
        return _label;
    }
}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.commons.chassis.inventory;

/**
 * The Class SeverityEnumUtil.
 */
public class SeverityEnumUtil {
    
    private SeverityEnumUtil(){}

    /**
     * Gets the severity id.
     *
     * @param status the status
     * @return the severity id
     */
    public static int getSeverityId(final String status) {
        int id = 0;

        if (status == null) {
            id = 1;
        }
        else{
            if (status.contains(ChassisConstants.INFORMATION)) {
                id = 2;
            } else if (status.contains(ChassisConstants.WARNING)) {
                id = 3;
            } else if (status.contains(ChassisConstants.CRITICAL)) {
                id = 4;
            }
        }
        return id;
    }

}

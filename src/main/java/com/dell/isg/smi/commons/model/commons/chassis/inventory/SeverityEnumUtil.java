/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.commons.chassis.inventory;

public class SeverityEnumUtil {

    public static int getSeverityId(final String status) {
        int id = 0;

        if (status == null) {
            id = 1;
        }

        if (status.contains(ChassisConstants.INFORMATION)) {
            id = 2;
        } else if (status.contains(ChassisConstants.WARNING)) {
            id = 3;
        } else if (status.contains(ChassisConstants.CRITICAL)) {
            id = 4;
        }
        return id;
    }

}

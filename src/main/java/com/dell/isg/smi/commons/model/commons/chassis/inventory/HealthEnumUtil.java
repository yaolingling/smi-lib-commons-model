/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.commons.chassis.inventory;

public class HealthEnumUtil {

    public static String getHealthStatus(final String status) {

        if (status == null) {
            return Health.UNKNOWN.name();
        }

        int istatus = Integer.parseInt(status);

        switch (istatus) {
        case 1:
            return Health.OK.name();
        case 2:
            return Health.WARNING.name();
        case 3:
            return Health.CRITICAL.name();
        default:
            return Health.UNKNOWN.name();
        }
    }

}

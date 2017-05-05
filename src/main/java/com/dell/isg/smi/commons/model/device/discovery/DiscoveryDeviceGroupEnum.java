/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

public enum DiscoveryDeviceGroupEnum {

    SERVER, CHASSIS, VM, IOM, STORAGE, SWITCH;

    public String value() {
        return name();
    }


    public static DiscoveryDeviceGroupEnum fromValue(String v) {
        return valueOf(v);
    }

}

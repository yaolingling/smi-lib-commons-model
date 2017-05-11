/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

/**
 * The Enum DiscoveryDeviceGroupEnum.
 */
public enum DiscoveryDeviceGroupEnum {

    SERVER, CHASSIS, VM, IOM, STORAGE, SWITCH;

    /**
     * Value.
     *
     * @return the string
     */
    public String value() {
        return name();
    }


    /**
     * From value.
     *
     * @param v the v
     * @return the discovery device group enum
     */
    public static DiscoveryDeviceGroupEnum fromValue(String v) {
        return valueOf(v);
    }

}

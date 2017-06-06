/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

/**
 * The Enum DiscoveryDeviceIdentifierEnum.
 */
public enum DiscoveryDeviceIdentifierEnum {

    REGULAR, REGEX;

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
     * @return the discovery device identifier enum
     */
    public static DiscoveryDeviceIdentifierEnum fromValue(String v) {
        return valueOf(v);
    }

}

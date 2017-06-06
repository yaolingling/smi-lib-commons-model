/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

/**
 * The Enum DiscoveryDeviceProtocolEnum.
 */
public enum DiscoveryDeviceProtocolEnum {

    HTTPS, HTTP, TCP, SSH, TFTP;

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
     * @return the discovery device protocol enum
     */
    public static DiscoveryDeviceProtocolEnum fromValue(String v) {
        return valueOf(v);
    }

}

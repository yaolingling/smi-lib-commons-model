/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

public enum DiscoveryDeviceProtocolEnum {

    HTTPS, HTTP, TCP, SSH, TFTP;

    public String value() {
        return name();
    }


    public static DiscoveryDeviceProtocolEnum fromValue(String v) {
        return valueOf(v);
    }

}

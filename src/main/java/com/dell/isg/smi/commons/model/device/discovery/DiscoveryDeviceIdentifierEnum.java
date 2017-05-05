/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

public enum DiscoveryDeviceIdentifierEnum {

    REGULAR, REGEX;

    public String value() {
        return name();
    }


    public static DiscoveryDeviceIdentifierEnum fromValue(String v) {
        return valueOf(v);
    }

}

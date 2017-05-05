/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.osdeployment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HypervisorEnum", namespace = "")
@XmlEnum
public enum HypervisorEnum {
    UNKNOWN, ESX4, ESXi4, ESXi5, ESXi6;

    public String value() {
        return name();
    }


    public static HypervisorEnum fromValue(String v) {
        return valueOf(v);
    }
}

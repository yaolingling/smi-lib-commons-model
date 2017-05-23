/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

/**
 * The Enum DiscoveryDeviceTypeEnum.
 */
public enum DiscoveryDeviceTypeEnum {

    IDRAC6, IDRAC7, IDRAC8, IDRAC9, CMC, CMC_FX2, CSERVER, VRTX, VCENTER, FORCE10_S4810, FORCE10_S5000, FORCE10_S6000, FORCE10_S4048, FORCE10_S55, FORCE10IOM, FX2_IOM, DELL_IOM_84, BROCADE, POWERCONNECT, POWERCONNECT_N3000, POWERCONNECT_N4000, CISCONEXUS, EQUALLOGIC_NODISCOVER, EM_COMPELLENT, EQUALLOGIC, COMPELLENT, UNKNOWN;

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
     * @return the discovery device type enum
     */
    public static DiscoveryDeviceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

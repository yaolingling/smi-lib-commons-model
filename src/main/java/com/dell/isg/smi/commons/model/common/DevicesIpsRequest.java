/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class DevicesIpsRequest.
 */
@ApiModel(value = "DevicesIpsRequest", description = "Array of IP request  for device discovery. ")
public class DevicesIpsRequest {

    @ApiModelProperty(value = "Credential", required = false)
    private Credential credential;

    @ApiModelProperty(value = "Device type", required = false)
    private String[] deviceType;

    @ApiModelProperty(value = "IP Array", required = true)
    String ips[];


    /**
     * Gets the credential.
     *
     * @return the credential
     */
    public Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential.
     *
     * @param credential the new credential
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the ips.
     *
     * @return the ips
     */
    public String[] getIps() {
        return ips;
    }


    /**
     * Sets the ips.
     *
     * @param ips the new ips
     */
    public void setIps(String[] ips) {
        this.ips = ips;
    }


    /**
     * Gets the device type.
     *
     * @return the device type
     */
    public String[] getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the device type.
     *
     * @param deviceType the new device type
     */
    public void setDeviceType(String[] deviceType) {
        this.deviceType = deviceType;
    }

}

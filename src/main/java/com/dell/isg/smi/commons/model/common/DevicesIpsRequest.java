/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DevicesIpsRequest", description = "Array of IP request  for device discovery. ")
public class DevicesIpsRequest {

    @ApiModelProperty(value = "Credential", required = false)
    private Credential credential;

    @ApiModelProperty(value = "Device type", required = false)
    private String[] deviceType;

    @ApiModelProperty(value = "IP Array", required = true)
    String ips[];


    public Credential getCredential() {
        return credential;
    }


    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    public String[] getIps() {
        return ips;
    }


    public void setIps(String[] ips) {
        this.ips = ips;
    }


    public String[] getDeviceType() {
        return deviceType;
    }


    public void setDeviceType(String[] deviceType) {
        this.deviceType = deviceType;
    }

}

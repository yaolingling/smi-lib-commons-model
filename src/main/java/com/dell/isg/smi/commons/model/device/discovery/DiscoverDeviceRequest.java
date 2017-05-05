/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import com.dell.isg.smi.commons.model.common.Credential;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DiscoverDeviceRequest", description = "IP range request  for device discovery. ")
public class DiscoverDeviceRequest {

    @ApiModelProperty(value = "Device type", required = false)
    private String[] deviceType;
    @ApiModelProperty(value = "IP start range", required = true)
    private String deviceStartIp;
    @ApiModelProperty(value = "IP end range", required = true)
    private String deviceEndIp;
    @ApiModelProperty(value = "Credential", required = false)
    private Credential credential;


    public DiscoverDeviceRequest() {
    }


    public DiscoverDeviceRequest(DiscoverDeviceRequest req) {
        this.setCredential(req.getCredential());
        this.setDeviceType(req.getDeviceType());
        this.setDeviceStartIp(req.getDeviceStartIp());
        this.setDeviceEndIp(req.getDeviceEndIp());
    }


    public String[] getDeviceType() {
        return deviceType;
    }


    public void setDeviceType(String[] deviceType) {
        this.deviceType = deviceType;
    }


    public String getDeviceStartIp() {
        return deviceStartIp;
    }


    public void setDeviceStartIp(String deviceStartIp) {
        this.deviceStartIp = deviceStartIp;
    }


    public String getDeviceEndIp() {
        return deviceEndIp;
    }


    public void setDeviceEndIp(String deviceEndIp) {
        this.deviceEndIp = deviceEndIp;
    }


    public Credential getCredential() {
        return credential;
    }


    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((credential == null) ? 0 : credential.hashCode());
        result = prime * result + ((deviceEndIp == null) ? 0 : deviceEndIp.hashCode());
        result = prime * result + ((deviceStartIp == null) ? 0 : deviceStartIp.hashCode());
        result = prime * result + ((deviceType == null) ? 0 : deviceType.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiscoverDeviceRequest other = (DiscoverDeviceRequest) obj;
        if (credential == null) {
            if (other.credential != null)
                return false;
        } else if (!credential.equals(other.credential))
            return false;
        if (deviceEndIp == null) {
            if (other.deviceEndIp != null)
                return false;
        } else if (!deviceEndIp.equals(other.deviceEndIp))
            return false;
        if (deviceStartIp == null) {
            if (other.deviceStartIp != null)
                return false;
        } else if (!deviceStartIp.equals(other.deviceStartIp))
            return false;
        if (deviceType == null) {
            if (other.deviceType != null)
                return false;
        } else if (!deviceType.equals(other.deviceType))
            return false;
        return true;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.Arrays;

import com.dell.isg.smi.commons.model.common.Credential;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class DiscoverDeviceRequest.
 */
@ApiModel(value = "DiscoverDeviceRequest", description = "IP range request  for device discovery. ")
public class DiscoverDeviceRequest {

    @ApiModelProperty(value = "Device type filter. Filter can SERVER / CHASSIS / SWITCH or STORAGE. By default all types would be selected. ", required = false)
    private String[] deviceType;
    @ApiModelProperty(value = "IP start range", required = true)
    private String deviceStartIp;
    @ApiModelProperty(value = "IP end range", required = true)
    private String deviceEndIp;
    @ApiModelProperty(value = "Credential for all the devices for summary extraction.", required = false)
    private Credential credential;


    /**
     * Instantiates a new discover device request.
     */
    public DiscoverDeviceRequest() {
        //empty instance
    }


    /**
     * Instantiates a new discover device request.
     *
     * @param req the req
     */
    public DiscoverDeviceRequest(DiscoverDeviceRequest req) {
        this.setCredential(req.getCredential());
        this.setDeviceType(req.getDeviceType());
        this.setDeviceStartIp(req.getDeviceStartIp());
        this.setDeviceEndIp(req.getDeviceEndIp());
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


    /**
     * Gets the device start ip.
     *
     * @return the device start ip
     */
    public String getDeviceStartIp() {
        return deviceStartIp;
    }


    /**
     * Sets the device start ip.
     *
     * @param deviceStartIp the new device start ip
     */
    public void setDeviceStartIp(String deviceStartIp) {
        this.deviceStartIp = deviceStartIp;
    }


    /**
     * Gets the device end ip.
     *
     * @return the device end ip
     */
    public String getDeviceEndIp() {
        return deviceEndIp;
    }


    /**
     * Sets the device end ip.
     *
     * @param deviceEndIp the new device end ip
     */
    public void setDeviceEndIp(String deviceEndIp) {
        this.deviceEndIp = deviceEndIp;
    }


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


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((credential == null) ? 0 : credential.hashCode());
        result = prime * result + ((deviceEndIp == null) ? 0 : deviceEndIp.hashCode());
        result = prime * result + ((deviceStartIp == null) ? 0 : deviceStartIp.hashCode());
        result = prime * result + ((deviceType == null) ? 0 : Arrays.hashCode(deviceType));
        return result;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
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
        } else if (!Arrays.equals(deviceType, other.deviceType))
            return false;
        return true;
    }

}

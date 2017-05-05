/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.HashSet;
import java.util.Set;

import com.dell.isg.smi.commons.model.common.Credential;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DiscoverIPRangeDeviceRequests", description = "IP range request object for device discovery. ")
public class DiscoverIPRangeDeviceRequests {

    @ApiModelProperty(value = "Credential", required = false)
    private Credential credential;

    @ApiModelProperty(value = "DiscoverDeviceRequest", required = false)
    private Set<DiscoverDeviceRequest> reqs;


    public DiscoverIPRangeDeviceRequests() {
    }


    public Credential getCredential() {
        return credential;
    }


    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    public Set<DiscoverDeviceRequest> getDiscoverIpRangeDeviceRequests() {
        if (reqs == null)
            reqs = new HashSet<DiscoverDeviceRequest>();
        return reqs;
    }


    public void setDiscoverIpRangeDeviceRequests(Set<DiscoverDeviceRequest> discoverDeviceRequestSet) {
        this.reqs = discoverDeviceRequestSet;
    }


    public DiscoverIPRangeDeviceRequests(Set<DiscoverDeviceRequest> reqs) {
        for (DiscoverDeviceRequest req : reqs) {
            getDiscoverIpRangeDeviceRequests().add(new DiscoverDeviceRequest(req));
        }
    }

}
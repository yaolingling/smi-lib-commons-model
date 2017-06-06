/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

import java.util.HashSet;
import java.util.Set;

import com.dell.isg.smi.commons.model.common.Credential;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class DiscoverIPRangeDeviceRequests.
 */
@ApiModel(value = "DiscoverIPRangeDeviceRequests", description = "IP range request object for device discovery. ")
public class DiscoverIPRangeDeviceRequests {

    @ApiModelProperty(value = "Credential", required = false)
    private Credential credential;

    @ApiModelProperty(value = "DiscoverDeviceRequest", required = false)
    private Set<DiscoverDeviceRequest> reqs;


    /**
     * Instantiates a new discover IP range device requests.
     */
    public DiscoverIPRangeDeviceRequests() {
        // empty constructor
    }
    
    
    /**
     * Instantiates a new discover IP range device requests.
     *
     * @param reqs the reqs
     */
    public DiscoverIPRangeDeviceRequests(Set<DiscoverDeviceRequest> reqs) {
        for (DiscoverDeviceRequest req : reqs) {
            getDiscoverIpRangeDeviceRequests().add(new DiscoverDeviceRequest(req));
        }
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


    /**
     * Gets the discover ip range device requests.
     *
     * @return the discover ip range device requests
     */
    public Set<DiscoverDeviceRequest> getDiscoverIpRangeDeviceRequests() {
        if (reqs == null)
            reqs = new HashSet<>();
        return reqs;
    }


    /**
     * Sets the discover ip range device requests.
     *
     * @param discoverDeviceRequestSet the new discover ip range device requests
     */
    public void setDiscoverIpRangeDeviceRequests(Set<DiscoverDeviceRequest> discoverDeviceRequestSet) {
        this.reqs = discoverDeviceRequestSet;
    }

}
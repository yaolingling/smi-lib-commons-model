/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.osdeployment;

import com.dell.isg.smi.commons.model.fileshare.FileShare;

/**
 * The Class OSDeploymentPayload.
 */

public class OSDeploymentPayload  extends ObmRequestBase{
        
    protected FileShare isoFileShare;
    protected HypervisorEnum hypervisorType;
    protected String hypervisorVersion;


  
    /**
     * Gets the iso file share.
     *
     * @return the isoFileShare
     */
    public FileShare getIsoFileShare() {
        return isoFileShare;
    }


    /**
     * Sets the iso file share.
     *
     * @param isoFileShare the isoFileShare to set
     */
    public void setIsoFileShare(FileShare isoFileShare) {
        this.isoFileShare = isoFileShare;
    }


    /**
     * Gets the hypervisor type.
     *
     * @return the hypervisorType
     */
    public HypervisorEnum getHypervisorType() {
        return hypervisorType;
    }


    /**
     * Sets the hypervisor type.
     *
     * @param hypervisorType the hypervisorType to set
     */
    public void setHypervisorType(HypervisorEnum hypervisorType) {
        this.hypervisorType = hypervisorType;
    }


    /**
     * Gets the hypervisor version.
     *
     * @return the hypervisorVersion
     */
    public String getHypervisorVersion() {
        return hypervisorVersion;
    }


    /**
     * Sets the hypervisor version.
     *
     * @param hypervisorVersion the hypervisorVersion to set
     */
    public void setHypervisorVersion(String hypervisorVersion) {
        this.hypervisorVersion = hypervisorVersion;
    }

}

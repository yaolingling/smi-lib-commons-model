/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.osdeployment;

import com.dell.isg.smi.commons.model.credential.PasswordCredential;
import com.dell.isg.smi.commons.model.fileshare.FileShare;

/**
 * The Class OSDeploymentPayload.
 */
public class OSDeploymentPayload {
    protected String oobIp;
    protected PasswordCredential oobCredentials;
    protected FileShare isoFileShare;
    protected HypervisorEnum hypervisorType;
    protected String hypervisorVersion;


    /**
     * Gets the oob ip.
     *
     * @return the oobIp
     */
    public String getOobIp() {
        return oobIp;
    }


    /**
     * Sets the oob ip.
     *
     * @param oobIp the oobIp to set
     */
    public void setOobIp(String oobIp) {
        this.oobIp = oobIp;
    }


    /**
     * Gets the oob credentials.
     *
     * @return the oobCredentials
     */
    public PasswordCredential getOobCredentials() {
        return oobCredentials;
    }


    /**
     * Sets the oob credentials.
     *
     * @param oobCredentials the oobCredentials to set
     */
    public void setOobCredentials(PasswordCredential oobCredentials) {
        this.oobCredentials = oobCredentials;
    }


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

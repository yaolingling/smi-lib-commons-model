/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.osdeployment;

import com.dell.isg.smi.commons.model.credential.PasswordCredential;
import com.dell.isg.smi.commons.model.fileshare.FileShare;

public class OSDeploymentPayload {
    protected String oobIp;
    protected PasswordCredential oobCredentials;
    protected FileShare isoFileShare;
    protected HypervisorEnum hypervisorType;
    protected String hypervisorVersion;


    /**
     * @return the oobIp
     */
    public String getOobIp() {
        return oobIp;
    }


    /**
     * @param oobIp the oobIp to set
     */
    public void setOobIp(String oobIp) {
        this.oobIp = oobIp;
    }


    /**
     * @return the oobCredentials
     */
    public PasswordCredential getOobCredentials() {
        return oobCredentials;
    }


    /**
     * @param oobCredentials the oobCredentials to set
     */
    public void setOobCredentials(PasswordCredential oobCredentials) {
        this.oobCredentials = oobCredentials;
    }


    /**
     * @return the isoFileShare
     */
    public FileShare getIsoFileShare() {
        return isoFileShare;
    }


    /**
     * @param isoFileShare the isoFileShare to set
     */
    public void setIsoFileShare(FileShare isoFileShare) {
        this.isoFileShare = isoFileShare;
    }


    /**
     * @return the hypervisorType
     */
    public HypervisorEnum getHypervisorType() {
        return hypervisorType;
    }


    /**
     * @param hypervisorType the hypervisorType to set
     */
    public void setHypervisorType(HypervisorEnum hypervisorType) {
        this.hypervisorType = hypervisorType;
    }


    /**
     * @return the hypervisorVersion
     */
    public String getHypervisorVersion() {
        return hypervisorVersion;
    }


    /**
     * @param hypervisorVersion the hypervisorVersion to set
     */
    public void setHypervisorVersion(String hypervisorVersion) {
        this.hypervisorVersion = hypervisorVersion;
    }

}

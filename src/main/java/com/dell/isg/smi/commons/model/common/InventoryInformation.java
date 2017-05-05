/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class InventoryInformation {

    String ipAddress;

    @JsonIgnore
    Credential credential;

    String status = InventoryStatus.UNKNOWN.name();

    Object inventory;


    public String getIpAddress() {
        return ipAddress;
    }


    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Credential getCredential() {
        return credential;
    }


    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    public Object getInventory() {
        return inventory;
    }


    public void setInventory(Object inventory) {
        this.inventory = inventory;
    }

}

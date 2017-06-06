/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The Class InventoryInformation.
 */
public class InventoryInformation {

    String ipAddress;

    @JsonIgnore
    Credential credential;

    String status = InventoryStatus.UNKNOWN.name();

    Object inventory;


    /**
     * Gets the ip address.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ip address.
     *
     * @param ipAddress the new ip address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }


    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * Gets the inventory.
     *
     * @return the inventory
     */
    public Object getInventory() {
        return inventory;
    }


    /**
     * Sets the inventory.
     *
     * @param inventory the new inventory
     */
    public void setInventory(Object inventory) {
        this.inventory = inventory;
    }

}

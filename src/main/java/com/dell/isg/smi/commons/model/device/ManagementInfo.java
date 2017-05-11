/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device;

import com.dell.isg.smi.commons.model.objectvault.VaultItem;

/**
 * The Class ManagementInfo.
 */
public class ManagementInfo {
    private long id;
    private String deviceIdentifier;
    private String managementType;
    private String addressType;
    private String address;
    private VaultItem credentialVaultItem;


    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the device identifier.
     *
     * @return the device identifier
     */
    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the device identifier.
     *
     * @param deviceIdentifier the new device identifier
     */
    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the management type.
     *
     * @return the management type
     */
    public String getManagementType() {
        return managementType;
    }


    /**
     * Sets the management type.
     *
     * @param managementType the new management type
     */
    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }


    /**
     * Gets the address type.
     *
     * @return the address type
     */
    public String getAddressType() {
        return addressType;
    }


    /**
     * Sets the address type.
     *
     * @param addressType the new address type
     */
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the credential vault item.
     *
     * @return the credential vault item
     */
    public VaultItem getCredentialVaultItem() {
        return credentialVaultItem;
    }


    /**
     * Sets the credential valt item.
     *
     * @param credentialVaultItem the new credential valt item
     */
    public void setCredentialValtItem(VaultItem credentialVaultItem) {
        this.credentialVaultItem = credentialVaultItem;
    }
}

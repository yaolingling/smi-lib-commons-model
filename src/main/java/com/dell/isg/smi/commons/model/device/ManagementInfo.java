/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device;

import com.dell.isg.smi.commons.model.objectvault.VaultItem;

public class ManagementInfo {
    private long id;
    private String deviceIdentifier;
    private String managementType;
    private String addressType;
    private String address;
    private VaultItem credentialVaultItem;


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }


    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    public String getManagementType() {
        return managementType;
    }


    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }


    public String getAddressType() {
        return addressType;
    }


    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public VaultItem getCredentialVaultItem() {
        return credentialVaultItem;
    }


    public void setCredentialValtItem(VaultItem credentialVaultItem) {
        this.credentialVaultItem = credentialVaultItem;
    }
}

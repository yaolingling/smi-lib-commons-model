/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware.request;

/**
 * The Class ApplicableUpdateRequest.
 *
 * @author rahman.muhammad
 */
public class ApplicableUpdateRequest {
    private String address;
    private String catalogPath;
    private String type;
    private String updateableComponentInventory;


    /**
     * Gets the catalog path.
     *
     * @return the catalog path
     */
    public String getCatalogPath() {
        return catalogPath;
    }


    /**
     * Sets the catalog path.
     *
     * @param catalogPath the new catalog path
     */
    public void setCatalogPath(String catalogPath) {
        this.catalogPath = catalogPath;
    }


    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the updateable component inventory.
     *
     * @return the updateable component inventory
     */
    public String getUpdateableComponentInventory() {
        return updateableComponentInventory;
    }


    /**
     * Sets the updateable component inventory.
     *
     * @param updateableComponentInventory the new updateable component inventory
     */
    public void setUpdateableComponentInventory(String updateableComponentInventory) {
        this.updateableComponentInventory = updateableComponentInventory;
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

}

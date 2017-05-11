/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class ComputerSystem.
 *
 * @author rahman.muhammad
 */
public class ComputerSystem {
    private String deviceId;
    private String model;
    private String collectionTime;
    private List<UpdateableComponent> updateableComponent;


    /**
     * Gets the device id.
     *
     * @return the device id
     */
    public String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the device id.
     *
     * @param deviceId the new device id
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }


    /**
     * Sets the model.
     *
     * @param model the new model
     */
    public void setModel(String model) {
        this.model = model;
    }


    /**
     * Gets the collection time.
     *
     * @return the collection time
     */
    public String getCollectionTime() {
        return collectionTime;
    }


    /**
     * Sets the collection time.
     *
     * @param collectionTime the new collection time
     */
    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }


    /**
     * Gets the updateable component.
     *
     * @return the updateable component
     */
    public List<UpdateableComponent> getUpdateableComponent() {
        if (updateableComponent == null) {
            updateableComponent = new ArrayList<UpdateableComponent>();
        }

        return updateableComponent;
    }


    /**
     * Sets the updateable component.
     *
     * @param updateableComponent the new updateable component
     */
    public void setUpdateableComponent(List<UpdateableComponent> updateableComponent) {
        this.updateableComponent = updateableComponent;
    }

}

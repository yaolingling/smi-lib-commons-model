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
 * @author rahman.muhammad
 *
 */
public class ComputerSystem {
    private String deviceId;
    private String model;
    private String collectionTime;
    private List<UpdateableComponent> updateableComponent;


    public String getDeviceId() {
        return deviceId;
    }


    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getCollectionTime() {
        return collectionTime;
    }


    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }


    public List<UpdateableComponent> getUpdateableComponent() {
        if (updateableComponent == null) {
            updateableComponent = new ArrayList<UpdateableComponent>();
        }

        return updateableComponent;
    }


    public void setUpdateableComponent(List<UpdateableComponent> updateableComponent) {
        this.updateableComponent = updateableComponent;
    }

}

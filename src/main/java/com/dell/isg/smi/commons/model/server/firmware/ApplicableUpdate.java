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
 * The Class ApplicableUpdate.
 *
 * @author rahman.muhammad
 */
public class ApplicableUpdate {
    private String deviceId;
    private List<Update> updates;


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
     * Gets the updates.
     *
     * @return the updates
     */
    public List<Update> getUpdates() {
        if (updates == null)
            updates = new ArrayList<Update>();

        return updates;
    }


    /**
     * Sets the updates.
     *
     * @param updates the new updates
     */
    public void setUpdates(List<Update> updates) {
        this.updates = updates;
    }

}

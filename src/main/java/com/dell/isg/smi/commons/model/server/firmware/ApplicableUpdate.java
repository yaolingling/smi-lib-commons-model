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
public class ApplicableUpdate {
    private String deviceId;
    private List<Update> updates;


    public String getDeviceId() {
        return deviceId;
    }


    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    public List<Update> getUpdates() {
        if (updates == null)
            updates = new ArrayList<Update>();

        return updates;
    }


    public void setUpdates(List<Update> updates) {
        this.updates = updates;
    }

}

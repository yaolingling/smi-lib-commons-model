/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware.request;

import java.util.ArrayList;
import java.util.List;

import com.dell.isg.smi.commons.model.server.firmware.Update;

/**
 * @author rahman.muhammad
 *
 */
public class CustomRepoRequest {
    private List<Update> updates = null;
    private String catalogFilePath = "";
    private String targetFilePath = "";


    public List<Update> getUpdates() {

        updates = (updates != null ? updates : new ArrayList<Update>());

        return updates;
    }


    public void setUpdates(List<Update> updates) {
        this.updates = updates;
    }


    public String getCatalogFilePath() {
        return catalogFilePath;
    }


    public void setCatalogFilePath(String catalogFilePath) {
        this.catalogFilePath = catalogFilePath;
    }


    public String getTargetFilePath() {
        return targetFilePath;
    }


    public void setTargetFilePath(String targetFilePath) {
        this.targetFilePath = targetFilePath;
    }

}

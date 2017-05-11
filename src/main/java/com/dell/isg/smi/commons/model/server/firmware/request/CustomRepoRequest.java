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
 * The Class CustomRepoRequest.
 *
 * @author rahman.muhammad
 */
public class CustomRepoRequest {
    private List<Update> updates = null;
    private String catalogFilePath = "";
    private String targetFilePath = "";


    /**
     * Gets the updates.
     *
     * @return the updates
     */
    public List<Update> getUpdates() {

        updates = (updates != null ? updates : new ArrayList<Update>());

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


    /**
     * Gets the catalog file path.
     *
     * @return the catalog file path
     */
    public String getCatalogFilePath() {
        return catalogFilePath;
    }


    /**
     * Sets the catalog file path.
     *
     * @param catalogFilePath the new catalog file path
     */
    public void setCatalogFilePath(String catalogFilePath) {
        this.catalogFilePath = catalogFilePath;
    }


    /**
     * Gets the target file path.
     *
     * @return the target file path
     */
    public String getTargetFilePath() {
        return targetFilePath;
    }


    /**
     * Sets the target file path.
     *
     * @param targetFilePath the new target file path
     */
    public void setTargetFilePath(String targetFilePath) {
        this.targetFilePath = targetFilePath;
    }

}

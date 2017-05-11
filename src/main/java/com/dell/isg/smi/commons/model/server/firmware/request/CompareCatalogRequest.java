/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware.request;

/**
 * The Class CompareCatalogRequest.
 *
 * @author rahman.muhammad
 */
public class CompareCatalogRequest {
    String sourceCatalog;
    String targetCatalog;


    /**
     * Gets the source catalog.
     *
     * @return the source catalog
     */
    public String getSourceCatalog() {
        return sourceCatalog;
    }


    /**
     * Sets the source catalog.
     *
     * @param sourceCatalog the new source catalog
     */
    public void setSourceCatalog(String sourceCatalog) {
        this.sourceCatalog = sourceCatalog;
    }


    /**
     * Gets the target catalog.
     *
     * @return the target catalog
     */
    public String getTargetCatalog() {
        return targetCatalog;
    }


    /**
     * Sets the target catalog.
     *
     * @param targetCatalog the new target catalog
     */
    public void setTargetCatalog(String targetCatalog) {
        this.targetCatalog = targetCatalog;
    }

}

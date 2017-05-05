/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware.request;

/**
 * @author rahman.muhammad
 *
 */
public class CompareCatalogRequest {
    String sourceCatalog;
    String targetCatalog;


    public String getSourceCatalog() {
        return sourceCatalog;
    }


    public void setSourceCatalog(String sourceCatalog) {
        this.sourceCatalog = sourceCatalog;
    }


    public String getTargetCatalog() {
        return targetCatalog;
    }


    public void setTargetCatalog(String targetCatalog) {
        this.targetCatalog = targetCatalog;
    }

}

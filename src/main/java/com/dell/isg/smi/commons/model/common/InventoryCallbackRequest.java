/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class InventoryCallbackRequest.
 */
@ApiModel(value = "InventoryCallbackRequest", description = "Inventory callback request  for device inventory. ")
public class InventoryCallbackRequest {

    @ApiModelProperty(value = "Credential", required = true)
    Credential credential;


    /**
     * Instantiates a new inventory callback request.
     */
    public InventoryCallbackRequest() {
        super();
    }

    @ApiModelProperty(value = "CallbackUri.", dataType = "string", required = true)
    String callbackUri;

    @ApiModelProperty(value = "Type.", dataType = "string", required = true)
    String type;

    @ApiModelProperty(value = "CallbackGraph.", dataType = "string", required = false)
    String callbackGraph;


    /**
     * Gets the callback graph.
     *
     * @return the callback graph
     */
    public String getCallbackGraph() {
        return callbackGraph;
    }


    /**
     * Sets the callback graph.
     *
     * @param callbackGraph the new callback graph
     */
    public void setCallbackGraph(String callbackGraph) {
        this.callbackGraph = callbackGraph;
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
     * Gets the credential.
     *
     * @return the credential
     */
    public Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential.
     *
     * @param credential the new credential
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the callback uri.
     *
     * @return the callback uri
     */
    public String getCallbackUri() {
        return callbackUri;
    }


    /**
     * Sets the callback uri.
     *
     * @param callbackUri the new callback uri
     */
    public void setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
    }

}

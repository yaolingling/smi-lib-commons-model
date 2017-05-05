/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "InventoryCallbackRequest", description = "Inventory callback request  for device inventory. ")
public class InventoryCallbackRequest {

    @ApiModelProperty(value = "Credential", required = true)
    Credential credential;


    public InventoryCallbackRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

    @ApiModelProperty(value = "CallbackUri.", dataType = "string", required = true)
    String callbackUri;

    @ApiModelProperty(value = "Type.", dataType = "string", required = true)
    String type;

    @ApiModelProperty(value = "CallbackGraph.", dataType = "string", required = false)
    String callbackGraph;


    public String getCallbackGraph() {
        return callbackGraph;
    }


    public void setCallbackGraph(String callbackGraph) {
        this.callbackGraph = callbackGraph;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Credential getCredential() {
        return credential;
    }


    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    public String getCallbackUri() {
        return callbackUri;
    }


    public void setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
    }

}

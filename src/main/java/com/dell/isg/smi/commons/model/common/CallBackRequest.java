/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

public class CallBackRequest {

    String callbackUri;

    String type;

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


    public String getCallbackUri() {
        return callbackUri;
    }


    public void setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
    }

}

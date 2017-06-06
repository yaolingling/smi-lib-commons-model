/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

/**
 * The Class CallBackRequest.
 */
public class CallBackRequest {

    String callbackUri;

    String type;

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

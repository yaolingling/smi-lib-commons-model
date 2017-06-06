/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

/**
 * The Class ResponseString.
 */
public class ResponseString {
    public ResponseString(String response) {
        super();
        this.response = response;
    }


    /**
     * Instantiates a new response string.
     */
    public ResponseString() {
    }

    private String response;

    private String callbackUri;


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


    /**
     * Gets the response.
     *
     * @return the response
     */
    public String getResponse() {
        return response;
    }


    /**
     * Sets the response.
     *
     * @param response the new response
     */
    public void setResponse(String response) {
        this.response = response;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

public class ResponseString {
    public ResponseString(String response) {
        super();
        this.response = response;
    }


    public ResponseString() {
    }

    private String response;

    private String callbackUri;


    public String getCallbackUri() {
        return callbackUri;
    }


    public void setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
    }


    public String getResponse() {
        return response;
    }


    public void setResponse(String response) {
        this.response = response;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.fileshare;

public class CommandResponse {
    private String returnCode;
    private String returnMessage;


    public String getReturnCode() {
        return returnCode;
    }


    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }


    public String getReturnMessage() {
        return returnMessage;
    }


    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

}

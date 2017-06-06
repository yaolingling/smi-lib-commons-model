/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.fileshare;

/**
 * The Class CommandResponse.
 */
public class CommandResponse {
    private String returnCode;
    private String returnMessage;


    /**
     * Gets the return code.
     *
     * @return the return code
     */
    public String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the return code.
     *
     * @param returnCode the new return code
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the return message.
     *
     * @return the return message
     */
    public String getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the return message.
     *
     * @param returnMessage the new return message
     */
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

}

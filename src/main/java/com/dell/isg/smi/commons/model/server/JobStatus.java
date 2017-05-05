/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server;

/**
 * @author Rahman.Muhammad
 *
 */
public class JobStatus {

    private String serverAddress;
    private String jobId;
    private String status;
    private String message;
    private String description;


    /**
     * @return the jobId
     */
    public String getJobId() {
        return jobId;
    }


    /**
     * @param jobId the jobId to set
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }


    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }


    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }


    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }


    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * @return the serverAddress
     */
    public String getServerAddress() {
        return serverAddress;
    }


    /**
     * @param serverAddress the serverAddress to set
     */
    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

}

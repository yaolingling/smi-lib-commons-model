/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server;

/**
 * The Class JobStatus.
 *
 * @author Rahman.Muhammad
 */
public class JobStatus {

    private String serverAddress;
    private String jobId;
    private String status;
    private String message;
    private String description;


    /**
     * Gets the job id.
     *
     * @return the jobId
     */
    public String getJobId() {
        return jobId;
    }


    /**
     * Sets the job id.
     *
     * @param jobId the jobId to set
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the status.
     *
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
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the message.
     *
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description.
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the server address.
     *
     * @return the serverAddress
     */
    public String getServerAddress() {
        return serverAddress;
    }


    /**
     * Sets the server address.
     *
     * @param serverAddress the serverAddress to set
     */
    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

}

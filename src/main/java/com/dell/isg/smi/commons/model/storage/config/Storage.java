/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.storage.config;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Class Storage.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "storageType", "command", "clilib", "output", "dataCollection" })
public class Storage {

    @JsonProperty("storageType")
    private String storageType;
    @JsonProperty("command")
    private String command;
    @JsonProperty("clilib")
    private String clilib;
    @JsonProperty("output")
    private String output;
    @JsonProperty("dataCollection")
    private List<DataCollection> dataCollection = null;


    /**
     * Gets the storage type.
     *
     * @return the storage type
     */
    @JsonProperty("storageType")
    public String getStorageType() {
        return storageType;
    }


    /**
     * Sets the storage type.
     *
     * @param storageType the new storage type
     */
    @JsonProperty("storageType")
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the command.
     *
     * @return the command
     */
    @JsonProperty("command")
    public String getCommand() {
        return command;
    }


    /**
     * Sets the command.
     *
     * @param command the new command
     */
    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }


    /**
     * Gets the clilib.
     *
     * @return the clilib
     */
    @JsonProperty("clilib")
    public String getClilib() {
        return clilib;
    }


    /**
     * Sets the clilib.
     *
     * @param clilib the new clilib
     */
    @JsonProperty("clilib")
    public void setClilib(String clilib) {
        this.clilib = clilib;
    }


    /**
     * Gets the output.
     *
     * @return the output
     */
    @JsonProperty("output")
    public String getOutput() {
        return output;
    }


    /**
     * Sets the output.
     *
     * @param output the new output
     */
    @JsonProperty("output")
    public void setOutput(String output) {
        this.output = output;
    }


    /**
     * Gets the data collection.
     *
     * @return the data collection
     */
    @JsonProperty("dataCollection")
    public List<DataCollection> getDataCollection() {
        return dataCollection;
    }


    /**
     * Sets the data collection.
     *
     * @param dataCollection the new data collection
     */
    @JsonProperty("dataCollection")
    public void setDataCollection(List<DataCollection> dataCollection) {
        this.dataCollection = dataCollection;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storageType).append(command).append(clilib).append(output).append(dataCollection).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Storage) == false) {
            return false;
        }
        Storage rhs = ((Storage) other);
        return new EqualsBuilder().append(storageType, rhs.storageType).append(command, rhs.command).append(clilib, rhs.clilib).append(output, rhs.output).append(dataCollection, rhs.dataCollection).isEquals();
    }

}
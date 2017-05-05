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


    @JsonProperty("storageType")
    public String getStorageType() {
        return storageType;
    }


    @JsonProperty("storageType")
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }


    @JsonProperty("command")
    public String getCommand() {
        return command;
    }


    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }


    @JsonProperty("clilib")
    public String getClilib() {
        return clilib;
    }


    @JsonProperty("clilib")
    public void setClilib(String clilib) {
        this.clilib = clilib;
    }


    @JsonProperty("output")
    public String getOutput() {
        return output;
    }


    @JsonProperty("output")
    public void setOutput(String output) {
        this.output = output;
    }


    @JsonProperty("dataCollection")
    public List<DataCollection> getDataCollection() {
        return dataCollection;
    }


    @JsonProperty("dataCollection")
    public void setDataCollection(List<DataCollection> dataCollection) {
        this.dataCollection = dataCollection;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storageType).append(command).append(clilib).append(output).append(dataCollection).toHashCode();
    }


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
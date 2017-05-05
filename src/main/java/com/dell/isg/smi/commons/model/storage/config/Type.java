/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.storage.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "command", "xmlout" })
public class Type {

    @JsonProperty("name")
    private String name;
    @JsonProperty("command")
    private String command;
    @JsonProperty("xmlout")
    private String xmlout;


    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }


    /**
     * 
     * @param name
     * @param xmlout
     * @param command
     */
    public Type(String name, String command, String xmlout) {
        super();
        this.name = name;
        this.command = command;
        this.xmlout = xmlout;
    }


    @JsonProperty("name")
    public String getName() {
        return name;
    }


    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @JsonProperty("command")
    public String getCommand() {
        return command;
    }


    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }


    @JsonProperty("xmlout")
    public String getXmlout() {
        return xmlout;
    }


    @JsonProperty("xmlout")
    public void setXmlout(String xmlout) {
        this.xmlout = xmlout;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(command).append(xmlout).toHashCode();
    }


    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return new EqualsBuilder().append(name, rhs.name).append(command, rhs.command).append(xmlout, rhs.xmlout).isEquals();
    }

}

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

/**
 * The Class Type.
 */
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
     * No args constructor for use in serialization.
     */
    public Type() {
    }


    /**
     * Instantiates a new type.
     *
     * @param name the name
     * @param command the command
     * @param xmlout the xmlout
     */
    public Type(String name, String command, String xmlout) {
        super();
        this.name = name;
        this.command = command;
        this.xmlout = xmlout;
    }


    /**
     * Gets the name.
     *
     * @return the name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Sets the name.
     *
     * @param name the new name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     * Gets the xmlout.
     *
     * @return the xmlout
     */
    @JsonProperty("xmlout")
    public String getXmlout() {
        return xmlout;
    }


    /**
     * Sets the xmlout.
     *
     * @param xmlout the new xmlout
     */
    @JsonProperty("xmlout")
    public void setXmlout(String xmlout) {
        this.xmlout = xmlout;
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
        return new HashCodeBuilder().append(name).append(command).append(xmlout).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
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

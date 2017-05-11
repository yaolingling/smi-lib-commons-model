/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */

package com.dell.isg.smi.commons.model.device.discovery.config;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Class DiscoveryRules.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "protocol", "command", "identifyBy", "identifier", "deviceDefaultCredential" })
public class DiscoveryRules {

    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("command")
    private String command;
    @JsonProperty("identifyBy")
    private String identifyBy;
    @JsonProperty("identifier")
    private List<Identifier> identifier = null;
    @JsonProperty("deviceDefaultCredential")
    private DeviceDefaultCredential deviceDefaultCredential;


    /**
     * No args constructor for use in serialization.
     */
    public DiscoveryRules() {
    }


    /**
     * Instantiates a new discovery rules.
     *
     * @param protocol the protocol
     * @param command the command
     * @param identifyBy the identify by
     * @param identifier the identifier
     * @param deviceDefaultCredential the device default credential
     */
    public DiscoveryRules(String protocol, String command, String identifyBy, List<Identifier> identifier, DeviceDefaultCredential deviceDefaultCredential) {
        super();
        this.protocol = protocol;
        this.command = command;
        this.identifier = identifier;
        this.identifyBy = identifyBy;
        this.deviceDefaultCredential = deviceDefaultCredential;
    }


    /**
     * Gets the protocol.
     *
     * @return the protocol
     */
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol.
     *
     * @param protocol the new protocol
     */
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
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
     * Gets the identify by.
     *
     * @return the identify by
     */
    @JsonProperty("identifyBy")
    public String getIdentifyBy() {
        return identifyBy;
    }


    /**
     * Sets the identify by.
     *
     * @param identifyBy the new identify by
     */
    @JsonProperty("identifyBy")
    public void setIdentifyBy(String identifyBy) {
        this.identifyBy = identifyBy;
    }


    /**
     * Gets the identifier.
     *
     * @return the identifier
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier.
     *
     * @param identifier the new identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the device default credential.
     *
     * @return the device default credential
     */
    @JsonProperty("deviceDefaultCredential")
    public DeviceDefaultCredential getDeviceDefaultCredential() {
        return deviceDefaultCredential;
    }


    /**
     * Sets the device default credential.
     *
     * @param deviceDefaultCredential the new device default credential
     */
    @JsonProperty("deviceDefaultCredential")
    public void setDeviceDefaultCredential(DeviceDefaultCredential deviceDefaultCredential) {
        this.deviceDefaultCredential = deviceDefaultCredential;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(protocol).append(command).append(identifyBy).append(identifier).append(deviceDefaultCredential).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryRules) == false) {
            return false;
        }
        DiscoveryRules rhs = ((DiscoveryRules) other);
        return new EqualsBuilder().append(protocol, rhs.protocol).append(command, rhs.command).append(identifier, rhs.identifier).append(identifyBy, rhs.identifyBy).append(deviceDefaultCredential, rhs.deviceDefaultCredential).isEquals();
    }

}

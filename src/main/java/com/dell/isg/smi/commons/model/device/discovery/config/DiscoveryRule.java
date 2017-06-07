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
 * The Class DiscoveryRule.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "protocol",
    "command",
    "deviceType"
})
public class DiscoveryRule {

    /** The protocol. */
    @JsonProperty("protocol")
    private String protocol;
    
    /** The command. */
    @JsonProperty("command")
    private String command;
    
    /** The device type. */
    @JsonProperty("deviceType")
    private List<DeviceType> deviceType = null;

    /**
     * No args constructor for use in serialization.
     */
    public DiscoveryRule() {
    }

    /**
     * Instantiates a new discovery rule.
     *
     * @param protocol the protocol
     * @param command the command
     * @param deviceType the device type
     */
    public DiscoveryRule(String protocol, String command, List<DeviceType> deviceType) {
        super();
        this.protocol = protocol;
        this.command = command;
        this.deviceType = deviceType;
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
     * Gets the device type.
     *
     * @return the device type
     */
    @JsonProperty("deviceType")
    public List<DeviceType> getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the device type.
     *
     * @param deviceType the new device type
     */
    @JsonProperty("deviceType")
    public void setDeviceType(List<DeviceType> deviceType) {
        this.deviceType = deviceType;
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
        return new HashCodeBuilder().append(protocol).append(command).append(deviceType).toHashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryRule) == false) {
            return false;
        }
        DiscoveryRule rhs = ((DiscoveryRule) other);
        return new EqualsBuilder().append(protocol, rhs.protocol).append(command, rhs.command).append(deviceType, rhs.deviceType).isEquals();
    }

}

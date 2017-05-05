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
     * No args constructor for use in serialization
     * 
     */
    public DiscoveryRules() {
    }


    /**
     * 
     * @param protocol
     * @param deviceDefaultCredential
     * @param command
     * @param identifier
     */
    public DiscoveryRules(String protocol, String command, String identifyBy, List<Identifier> identifier, DeviceDefaultCredential deviceDefaultCredential) {
        super();
        this.protocol = protocol;
        this.command = command;
        this.identifier = identifier;
        this.identifyBy = identifyBy;
        this.deviceDefaultCredential = deviceDefaultCredential;
    }


    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }


    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    @JsonProperty("command")
    public String getCommand() {
        return command;
    }


    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }


    @JsonProperty("identifyBy")
    public String getIdentifyBy() {
        return identifyBy;
    }


    @JsonProperty("identifyBy")
    public void setIdentifyBy(String identifyBy) {
        this.identifyBy = identifyBy;
    }


    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }


    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }


    @JsonProperty("deviceDefaultCredential")
    public DeviceDefaultCredential getDeviceDefaultCredential() {
        return deviceDefaultCredential;
    }


    @JsonProperty("deviceDefaultCredential")
    public void setDeviceDefaultCredential(DeviceDefaultCredential deviceDefaultCredential) {
        this.deviceDefaultCredential = deviceDefaultCredential;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(protocol).append(command).append(identifyBy).append(identifier).append(deviceDefaultCredential).toHashCode();
    }


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

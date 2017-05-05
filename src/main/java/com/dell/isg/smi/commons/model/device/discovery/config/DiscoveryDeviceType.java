/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */

package com.dell.isg.smi.commons.model.device.discovery.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "discoveryDeviceName", "discoveryRules" })
public class DiscoveryDeviceType {

    @JsonProperty("discoveryDeviceName")
    private String discoveryDeviceName;
    @JsonProperty("discoveryRules")
    private DiscoveryRules discoveryRules;


    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoveryDeviceType() {
    }


    /**
     * 
     * @param discoveryDeviceName
     * @param discoveryRules
     */
    public DiscoveryDeviceType(String discoveryDeviceName, DiscoveryRules discoveryRules) {
        super();
        this.discoveryDeviceName = discoveryDeviceName;
        this.discoveryRules = discoveryRules;
    }


    @JsonProperty("discoveryDeviceName")
    public String getDiscoveryDeviceName() {
        return discoveryDeviceName;
    }


    @JsonProperty("discoveryDeviceName")
    public void setDiscoveryDeviceName(String discoveryDeviceName) {
        this.discoveryDeviceName = discoveryDeviceName;
    }


    @JsonProperty("discoveryRules")
    public DiscoveryRules getDiscoveryRules() {
        return discoveryRules;
    }


    @JsonProperty("discoveryRules")
    public void setDiscoveryRules(DiscoveryRules discoveryRules) {
        this.discoveryRules = discoveryRules;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(discoveryDeviceName).append(discoveryRules).toHashCode();
    }


    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryDeviceType) == false) {
            return false;
        }
        DiscoveryDeviceType rhs = ((DiscoveryDeviceType) other);
        return new EqualsBuilder().append(discoveryDeviceName, rhs.discoveryDeviceName).append(discoveryRules, rhs.discoveryRules).isEquals();
    }

}

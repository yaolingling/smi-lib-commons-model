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

/**
 * The Class DiscoveryDeviceType.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "discoveryDeviceName", "discoveryRules" })
public class DiscoveryDeviceType {

    @JsonProperty("discoveryDeviceName")
    private String discoveryDeviceName;
    @JsonProperty("discoveryRules")
    private DiscoveryRules discoveryRules;


    /**
     * No args constructor for use in serialization.
     */
    public DiscoveryDeviceType() {
    }


    /**
     * Instantiates a new discovery device type.
     *
     * @param discoveryDeviceName the discovery device name
     * @param discoveryRules the discovery rules
     */
    public DiscoveryDeviceType(String discoveryDeviceName, DiscoveryRules discoveryRules) {
        super();
        this.discoveryDeviceName = discoveryDeviceName;
        this.discoveryRules = discoveryRules;
    }


    /**
     * Gets the discovery device name.
     *
     * @return the discovery device name
     */
    @JsonProperty("discoveryDeviceName")
    public String getDiscoveryDeviceName() {
        return discoveryDeviceName;
    }


    /**
     * Sets the discovery device name.
     *
     * @param discoveryDeviceName the new discovery device name
     */
    @JsonProperty("discoveryDeviceName")
    public void setDiscoveryDeviceName(String discoveryDeviceName) {
        this.discoveryDeviceName = discoveryDeviceName;
    }


    /**
     * Gets the discovery rules.
     *
     * @return the discovery rules
     */
    @JsonProperty("discoveryRules")
    public DiscoveryRules getDiscoveryRules() {
        return discoveryRules;
    }


    /**
     * Sets the discovery rules.
     *
     * @param discoveryRules the new discovery rules
     */
    @JsonProperty("discoveryRules")
    public void setDiscoveryRules(DiscoveryRules discoveryRules) {
        this.discoveryRules = discoveryRules;
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
        return new HashCodeBuilder().append(discoveryDeviceName).append(discoveryRules).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
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

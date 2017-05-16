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
 * The Class DiscoveryDevice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "discoveryDeviceType", "discoveryDeviceGroup" })
public class DiscoveryDevice {

    @JsonProperty("discoveryDeviceType")
    private List<DiscoveryDeviceType> discoveryDeviceType = null;
    @JsonProperty("discoveryDeviceGroup")
    private String discoveryDeviceGroup;


    /**
     * No args constructor for use in serialization.
     */
    public DiscoveryDevice() {
    }


    /**
     * Instantiates a new discovery device.
     *
     * @param discoveryDeviceType the discovery device type
     * @param discoveryDeviceGroup the discovery device group
     */
    public DiscoveryDevice(List<DiscoveryDeviceType> discoveryDeviceType, String discoveryDeviceGroup) {
        super();
        this.discoveryDeviceType = discoveryDeviceType;
        this.discoveryDeviceGroup = discoveryDeviceGroup;
    }


    /**
     * Gets the discovery device type.
     *
     * @return the discovery device type
     */
    @JsonProperty("discoveryDeviceType")
    public List<DiscoveryDeviceType> getDiscoveryDeviceType() {
        return discoveryDeviceType;
    }


    /**
     * Sets the discovery device type.
     *
     * @param discoveryDeviceType the new discovery device type
     */
    @JsonProperty("discoveryDeviceType")
    public void setDiscoveryDeviceType(List<DiscoveryDeviceType> discoveryDeviceType) {
        this.discoveryDeviceType = discoveryDeviceType;
    }


    /**
     * Gets the discovery device group.
     *
     * @return the discovery device group
     */
    @JsonProperty("discoveryDeviceGroup")
    public String getDiscoveryDeviceGroup() {
        return discoveryDeviceGroup;
    }


    /**
     * Sets the discovery device group.
     *
     * @param discoveryDeviceGroup the new discovery device group
     */
    @JsonProperty("discoveryDeviceGroup")
    public void setDiscoveryDeviceGroup(String discoveryDeviceGroup) {
        this.discoveryDeviceGroup = discoveryDeviceGroup;
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
        return new HashCodeBuilder().append(discoveryDeviceType).append(discoveryDeviceGroup).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryDevice) == false) {
            return false;
        }
        DiscoveryDevice rhs = ((DiscoveryDevice) other);
        return new EqualsBuilder().append(discoveryDeviceType, rhs.discoveryDeviceType).append(discoveryDeviceGroup, rhs.discoveryDeviceGroup).isEquals();
    }

}

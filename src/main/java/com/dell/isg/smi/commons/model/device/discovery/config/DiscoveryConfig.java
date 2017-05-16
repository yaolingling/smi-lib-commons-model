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
 * The Class DiscoveryConfig.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "discoveryDevice" })
public class DiscoveryConfig {

    @JsonProperty("discoveryDevice")
    private List<DiscoveryDevice> discoveryDevice = null;


    /**
     * No args constructor for use in serialization.
     */
    public DiscoveryConfig() {
    }


    /**
     * Instantiates a new discovery config.
     *
     * @param discoveryDevice the discovery device
     */
    public DiscoveryConfig(List<DiscoveryDevice> discoveryDevice) {
        super();
        this.discoveryDevice = discoveryDevice;
    }


    /**
     * Gets the discovery device.
     *
     * @return the discovery device
     */
    @JsonProperty("discoveryDevice")
    public List<DiscoveryDevice> getDiscoveryDevice() {
        return discoveryDevice;
    }


    /**
     * Sets the discovery device.
     *
     * @param discoveryDevice the new discovery device
     */
    @JsonProperty("discoveryDevice")
    public void setDiscoveryDevice(List<DiscoveryDevice> discoveryDevice) {
        this.discoveryDevice = discoveryDevice;
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
        return new HashCodeBuilder().append(discoveryDevice).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryConfig) == false) {
            return false;
        }
        DiscoveryConfig rhs = ((DiscoveryConfig) other);
        return new EqualsBuilder().append(discoveryDevice, rhs.discoveryDevice).isEquals();
    }

}

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
@JsonPropertyOrder({ "discoveryConfig" })
public class DiscoveryDeviceConfig {

    @JsonProperty("discoveryConfig")
    private DiscoveryConfig discoveryConfig;


    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoveryDeviceConfig() {
    }


    /**
     * 
     * @param discoveryConfig
     */
    public DiscoveryDeviceConfig(DiscoveryConfig discoveryConfig) {
        super();
        this.discoveryConfig = discoveryConfig;
    }


    @JsonProperty("discoveryConfig")
    public DiscoveryConfig getDiscoveryConfig() {
        return discoveryConfig;
    }


    @JsonProperty("discoveryConfig")
    public void setDiscoveryConfig(DiscoveryConfig discoveryConfig) {
        this.discoveryConfig = discoveryConfig;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(discoveryConfig).toHashCode();
    }


    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryDeviceConfig) == false) {
            return false;
        }
        DiscoveryDeviceConfig rhs = ((DiscoveryDeviceConfig) other);
        return new EqualsBuilder().append(discoveryConfig, rhs.discoveryConfig).isEquals();
    }

}

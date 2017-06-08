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
 * The Class DiscoveryDeviceConfig.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "discoveryConfig" })
public class DiscoveryDeviceConfig {

	/** The discovery config. */
	@JsonProperty("discoveryConfig")
	private DiscoveryConfig discoveryConfig;

	/**
	 * No args constructor for use in serialization.
	 */
	public DiscoveryDeviceConfig() {
	}

	/**
	 * Instantiates a new discovery device config.
	 *
	 * @param discoveryConfig
	 *            the discovery config
	 */
	public DiscoveryDeviceConfig(DiscoveryConfig discoveryConfig) {
		super();
		this.discoveryConfig = discoveryConfig;
	}

	/**
	 * Gets the discovery config.
	 *
	 * @return the discovery config
	 */
	@JsonProperty("discoveryConfig")
	public DiscoveryConfig getDiscoveryConfig() {
		return discoveryConfig;
	}

	/**
	 * Sets the discovery config.
	 *
	 * @param discoveryConfig
	 *            the new discovery config
	 */
	@JsonProperty("discoveryConfig")
	public void setDiscoveryConfig(DiscoveryConfig discoveryConfig) {
		this.discoveryConfig = discoveryConfig;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(discoveryConfig).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

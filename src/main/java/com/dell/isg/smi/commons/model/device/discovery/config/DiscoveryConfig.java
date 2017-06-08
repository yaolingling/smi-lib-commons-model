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
@JsonPropertyOrder({ "deviceGroup" })
public class DiscoveryConfig {

	/** The device group. */
	@JsonProperty("deviceGroup")
	private List<DeviceGroup> deviceGroup = null;

	/**
	 * No args constructor for use in serialization.
	 */
	public DiscoveryConfig() {
	}

	/**
	 * Instantiates a new discovery config.
	 *
	 * @param deviceGroup
	 *            the device group
	 */
	public DiscoveryConfig(List<DeviceGroup> deviceGroup) {
		super();
		this.deviceGroup = deviceGroup;
	}

	/**
	 * Gets the device group.
	 *
	 * @return the device group
	 */
	@JsonProperty("deviceGroup")
	public List<DeviceGroup> getDeviceGroup() {
		return deviceGroup;
	}

	/**
	 * Sets the device group.
	 *
	 * @param deviceGroup
	 *            the new device group
	 */
	@JsonProperty("deviceGroup")
	public void setDeviceGroup(List<DeviceGroup> deviceGroup) {
		this.deviceGroup = deviceGroup;
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
		return new HashCodeBuilder().append(deviceGroup).toHashCode();
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
		if ((other instanceof DiscoveryConfig) == false) {
			return false;
		}
		DiscoveryConfig rhs = ((DiscoveryConfig) other);
		return new EqualsBuilder().append(deviceGroup, rhs.deviceGroup).isEquals();
	}

}

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
 * The Class DeviceGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "discoveryRule",
    "groupName"
})
public class DeviceGroup {

    /** The discovery rule. */
    @JsonProperty("discoveryRule")
    private List<DiscoveryRule> discoveryRule = null;
    
    /** The group name. */
    @JsonProperty("groupName")
    private String groupName;

    /**
     * No args constructor for use in serialization.
     */
    public DeviceGroup() {
    }

    /**
     * Instantiates a new device group.
     *
     * @param discoveryRule the discovery rule
     * @param groupName the group name
     */
    public DeviceGroup(List<DiscoveryRule> discoveryRule, String groupName) {
        super();
        this.discoveryRule = discoveryRule;
        this.groupName = groupName;
    }

    /**
     * Gets the discovery rule.
     *
     * @return the discovery rule
     */
    @JsonProperty("discoveryRule")
    public List<DiscoveryRule> getDiscoveryRule() {
        return discoveryRule;
    }

    /**
     * Sets the discovery rule.
     *
     * @param discoveryRule the new discovery rule
     */
    @JsonProperty("discoveryRule")
    public void setDiscoveryRule(List<DiscoveryRule> discoveryRule) {
        this.discoveryRule = discoveryRule;
    }

    /**
     * Gets the group name.
     *
     * @return the group name
     */
    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the group name.
     *
     * @param groupName the new group name
     */
    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
        return new HashCodeBuilder().append(discoveryRule).append(groupName).toHashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceGroup) == false) {
            return false;
        }
        DeviceGroup rhs = ((DeviceGroup) other);
        return new EqualsBuilder().append(discoveryRule, rhs.discoveryRule).append(groupName, rhs.groupName).isEquals();
    }

}

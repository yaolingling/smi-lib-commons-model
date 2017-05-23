
package com.dell.isg.smi.commons.model.device.discovery.config;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "discoveryRule",
    "groupName"
})
public class DeviceGroup {

    @JsonProperty("discoveryRule")
    private List<DiscoveryRule> discoveryRule = null;
    @JsonProperty("groupName")
    private String groupName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeviceGroup() {
    }

    /**
     * 
     * @param groupName
     * @param discoveryRule
     */
    public DeviceGroup(List<DiscoveryRule> discoveryRule, String groupName) {
        super();
        this.discoveryRule = discoveryRule;
        this.groupName = groupName;
    }

    @JsonProperty("discoveryRule")
    public List<DiscoveryRule> getDiscoveryRule() {
        return discoveryRule;
    }

    @JsonProperty("discoveryRule")
    public void setDiscoveryRule(List<DiscoveryRule> discoveryRule) {
        this.discoveryRule = discoveryRule;
    }

    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(discoveryRule).append(groupName).toHashCode();
    }

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

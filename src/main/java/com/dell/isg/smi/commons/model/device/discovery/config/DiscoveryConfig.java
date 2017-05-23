
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
    "deviceGroup"
})
public class DiscoveryConfig {

    @JsonProperty("deviceGroup")
    private List<DeviceGroup> deviceGroup = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoveryConfig() {
    }

    /**
     * 
     * @param deviceGroup
     */
    public DiscoveryConfig(List<DeviceGroup> deviceGroup) {
        super();
        this.deviceGroup = deviceGroup;
    }

    @JsonProperty("deviceGroup")
    public List<DeviceGroup> getDeviceGroup() {
        return deviceGroup;
    }

    @JsonProperty("deviceGroup")
    public void setDeviceGroup(List<DeviceGroup> deviceGroup) {
        this.deviceGroup = deviceGroup;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceGroup).toHashCode();
    }

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

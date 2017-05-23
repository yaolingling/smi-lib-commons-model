
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
    "protocol",
    "command",
    "deviceType"
})
public class DiscoveryRule {

    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("command")
    private String command;
    @JsonProperty("deviceType")
    private List<DeviceType> deviceType = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoveryRule() {
    }

    /**
     * 
     * @param protocol
     * @param deviceType
     * @param command
     */
    public DiscoveryRule(String protocol, String command, List<DeviceType> deviceType) {
        super();
        this.protocol = protocol;
        this.command = command;
        this.deviceType = deviceType;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("command")
    public String getCommand() {
        return command;
    }

    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }

    @JsonProperty("deviceType")
    public List<DeviceType> getDeviceType() {
        return deviceType;
    }

    @JsonProperty("deviceType")
    public void setDeviceType(List<DeviceType> deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(protocol).append(command).append(deviceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscoveryRule) == false) {
            return false;
        }
        DiscoveryRule rhs = ((DiscoveryRule) other);
        return new EqualsBuilder().append(protocol, rhs.protocol).append(command, rhs.command).append(deviceType, rhs.deviceType).isEquals();
    }

}

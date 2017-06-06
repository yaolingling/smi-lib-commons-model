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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "identifyBy",
    "identifier",
    "deviceDefaultCredential",
    "enabled"
})
public class DeviceType {

    @JsonProperty("name")
    private String name;
    @JsonProperty("identifyBy")
    private String identifyBy;
    @JsonProperty("identifier")
    private List<Identifier> identifier = null;
    @JsonProperty("deviceDefaultCredential")
    private DeviceDefaultCredential deviceDefaultCredential;
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeviceType() {
    }

    /**
     * 
     * @param enabled
     * @param identifyBy
     * @param deviceDefaultCredential
     * @param name
     * @param identifier
     */
    public DeviceType(String name, String identifyBy, List<Identifier> identifier, DeviceDefaultCredential deviceDefaultCredential, Boolean enabled) {
        super();
        this.name = name;
        this.identifyBy = identifyBy;
        this.identifier = identifier;
        this.deviceDefaultCredential = deviceDefaultCredential;
        this.enabled = enabled;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("identifyBy")
    public String getIdentifyBy() {
        return identifyBy;
    }

    @JsonProperty("identifyBy")
    public void setIdentifyBy(String identifyBy) {
        this.identifyBy = identifyBy;
    }

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("deviceDefaultCredential")
    public DeviceDefaultCredential getDeviceDefaultCredential() {
        return deviceDefaultCredential;
    }

    @JsonProperty("deviceDefaultCredential")
    public void setDeviceDefaultCredential(DeviceDefaultCredential deviceDefaultCredential) {
        this.deviceDefaultCredential = deviceDefaultCredential;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(identifyBy).append(identifier).append(deviceDefaultCredential).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceType) == false) {
            return false;
        }
        DeviceType rhs = ((DeviceType) other);
        return new EqualsBuilder().append(name, rhs.name).append(identifyBy, rhs.identifyBy).append(identifier, rhs.identifier).append(deviceDefaultCredential, rhs.deviceDefaultCredential).append(enabled, rhs.enabled).isEquals();
    }

}

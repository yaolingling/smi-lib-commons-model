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
 * The Class DeviceType.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "identifyBy",
    "identifier",
    "deviceDefaultCredential",
    "enabled"
})
public class DeviceType {

    /** The name. */
    @JsonProperty("name")
    private String name;
    
    /** The identify by. */
    @JsonProperty("identifyBy")
    private String identifyBy;
    
    /** The identifier. */
    @JsonProperty("identifier")
    private List<Identifier> identifier = null;
    
    /** The device default credential. */
    @JsonProperty("deviceDefaultCredential")
    private DeviceDefaultCredential deviceDefaultCredential;
    
    /** The enabled. */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * No args constructor for use in serialization.
     */
    public DeviceType() {
    }

    /**
     * Instantiates a new device type.
     *
     * @param name the name
     * @param identifyBy the identify by
     * @param identifier the identifier
     * @param deviceDefaultCredential the device default credential
     * @param enabled the enabled
     */
    public DeviceType(String name, String identifyBy, List<Identifier> identifier, DeviceDefaultCredential deviceDefaultCredential, Boolean enabled) {
        super();
        this.name = name;
        this.identifyBy = identifyBy;
        this.identifier = identifier;
        this.deviceDefaultCredential = deviceDefaultCredential;
        this.enabled = enabled;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the identify by.
     *
     * @return the identify by
     */
    @JsonProperty("identifyBy")
    public String getIdentifyBy() {
        return identifyBy;
    }

    /**
     * Sets the identify by.
     *
     * @param identifyBy the new identify by
     */
    @JsonProperty("identifyBy")
    public void setIdentifyBy(String identifyBy) {
        this.identifyBy = identifyBy;
    }

    /**
     * Gets the identifier.
     *
     * @return the identifier
     */
    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier.
     *
     * @param identifier the new identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the device default credential.
     *
     * @return the device default credential
     */
    @JsonProperty("deviceDefaultCredential")
    public DeviceDefaultCredential getDeviceDefaultCredential() {
        return deviceDefaultCredential;
    }

    /**
     * Sets the device default credential.
     *
     * @param deviceDefaultCredential the new device default credential
     */
    @JsonProperty("deviceDefaultCredential")
    public void setDeviceDefaultCredential(DeviceDefaultCredential deviceDefaultCredential) {
        this.deviceDefaultCredential = deviceDefaultCredential;
    }

    /**
     * Gets the enabled.
     *
     * @return the enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled.
     *
     * @param enabled the new enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        return new HashCodeBuilder().append(name).append(identifyBy).append(identifier).append(deviceDefaultCredential).append(enabled).toHashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
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

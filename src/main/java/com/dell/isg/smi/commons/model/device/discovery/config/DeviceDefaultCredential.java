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
 * The Class DeviceDefaultCredential.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "password"
})
public class DeviceDefaultCredential {

    /** The username. */
    @JsonProperty("username")
    private String username;
    
    /** The password. */
    @JsonProperty("password")
    private String password;

    /**
     * No args constructor for use in serialization.
     */
    public DeviceDefaultCredential() {
    }

    /**
     * Instantiates a new device default credential.
     *
     * @param username the username
     * @param password the password
     */
    public DeviceDefaultCredential(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username the new username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password the new password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
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
        return new HashCodeBuilder().append(username).append(password).toHashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceDefaultCredential) == false) {
            return false;
        }
        DeviceDefaultCredential rhs = ((DeviceDefaultCredential) other);
        return new EqualsBuilder().append(username, rhs.username).append(password, rhs.password).isEquals();
    }

}

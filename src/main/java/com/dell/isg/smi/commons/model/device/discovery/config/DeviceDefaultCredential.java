/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */

package com.dell.isg.smi.commons.model.device.discovery.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.lang.reflect.Field;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * The Class DeviceDefaultCredential.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "user", "password" })
public class DeviceDefaultCredential {

    @JsonProperty("user")
    private String user;
    @JsonProperty("password")
    private String password;


    /**
     * No args constructor for use in serialization.
     */
    public DeviceDefaultCredential() {
        // empty instance
    }


    /**
     * Instantiates a new device default credential.
     *
     * @param user the user
     * @param password the password
     */
    public DeviceDefaultCredential(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }


    /**
     * Gets the user.
     *
     * @return the user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }


    /**
     * Sets the user.
     *
     * @param user the new user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
        return (new ReflectionToStringBuilder(this) {
            protected boolean accept(Field f) {
                return super.accept(f) && !"password".equals(f.getName());
            }
        }).toString();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(user).append(password).toHashCode();
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
        return new EqualsBuilder().append(user, rhs.user).append(password, rhs.password).isEquals();
    }

}

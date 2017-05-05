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
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "user", "password" })
public class DeviceDefaultCredential {

    @JsonProperty("user")
    private String user;
    @JsonProperty("password")
    private String password;


    /**
     * No args constructor for use in serialization
     * 
     */
    public DeviceDefaultCredential() {
    }


    /**
     * 
     * @param password
     * @param user
     */
    public DeviceDefaultCredential(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }


    @JsonProperty("user")
    public String getUser() {
        return user;
    }


    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }


    @JsonProperty("password")
    public String getPassword() {
        return password;
    }


    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return (new ReflectionToStringBuilder(this) {
            protected boolean accept(Field f) {
                return super.accept(f) && !f.getName().equals("password");
            }
        }).toString();
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(user).append(password).toHashCode();
    }


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

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import java.lang.reflect.Field;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class Credential.
 */
@ApiModel(value = "Credential", description = "Device access credential. ")
public class Credential {

    @ApiModelProperty(value = "IP Address", dataType = "string", required = true)
    private String address;
    @ApiModelProperty(value = "Service identifier like service tag ... etc", dataType = "string", required = false)
    private String identifier;
    @ApiModelProperty(value = "Username.", dataType = "string", required = false)
    private String userName;
    @ApiModelProperty(value = "Password.", dataType = "string", required = false)
    private String password;


    /**
     * Instantiates a new credential.
     *
     * @param address the address
     * @param user the user
     * @param password the password
     */
    public Credential(String address, String user, String password) {
        super();
        this.address = address;
        this.userName = user;
        this.password = password;
    }


    /**
     * Instantiates a new credential.
     */
    public Credential() {
        super();
    }


    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the user name.
     *
     * @param userName the new user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the identifier.
     *
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier.
     *
     * @param identifier the new identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Credential other = (Credential) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return (new ReflectionToStringBuilder(this) {
            @Override
            protected boolean accept(Field f) {
                return super.accept(f) && !"password".equals(f.getName());
            }
        }).toString();
    }

}

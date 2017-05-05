/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import java.lang.reflect.Field;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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


    public Credential(String address, String user, String password) {
        super();
        this.address = address;
        this.userName = user;
        this.password = password;
    }


    public Credential() {
        super();
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getIdentifier() {
        return identifier;
    }


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


    public String toString() {
        return (new ReflectionToStringBuilder(this) {
            protected boolean accept(Field f) {
                return super.accept(f) && !f.getName().equals("password");
            }
        }).toString();
    }

}

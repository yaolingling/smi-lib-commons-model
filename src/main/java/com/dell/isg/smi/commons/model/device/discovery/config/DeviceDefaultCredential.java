
package com.dell.isg.smi.commons.model.device.discovery.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "password"
})
public class DeviceDefaultCredential {

    @JsonProperty("username")
    private String username;
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
     * @param username
     * @param password
     */
    public DeviceDefaultCredential(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
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
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(username).append(password).toHashCode();
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
        return new EqualsBuilder().append(username, rhs.username).append(password, rhs.password).isEquals();
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.storage.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Class StorageConfig.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "storage" })
public class StorageConfig {

    @JsonProperty("storage")
    private Storage storage;


    /**
     * No args constructor for use in serialization.
     */
    public StorageConfig() {
    }


    /**
     * Instantiates a new storage config.
     *
     * @param storage the storage
     */
    public StorageConfig(Storage storage) {
        super();
        this.storage = storage;
    }


    /**
     * Gets the storage.
     *
     * @return the storage
     */
    @JsonProperty("storage")
    public Storage getStorage() {
        return storage;
    }


    /**
     * Sets the storage.
     *
     * @param storage the new storage
     */
    @JsonProperty("storage")
    public void setStorage(Storage storage) {
        this.storage = storage;
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
        return new HashCodeBuilder().append(storage).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageConfig) == false) {
            return false;
        }
        StorageConfig rhs = ((StorageConfig) other);
        return new EqualsBuilder().append(storage, rhs.storage).isEquals();
    }

}
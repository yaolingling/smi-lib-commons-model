/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.storage.config;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Class DataCollection.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "collection" })
public class DataCollection {

    @JsonProperty("type")
    private List<Type> type = null;
    @JsonProperty("collection")
    private String collection;


    /**
     * No args constructor for use in serialization.
     */
    public DataCollection() {
    }


    /**
     * Instantiates a new data collection.
     *
     * @param type the type
     * @param collection the collection
     */
    public DataCollection(List<Type> type, String collection) {
        super();
        this.type = type;
        this.collection = collection;
    }


    /**
     * Gets the type.
     *
     * @return the type
     */
    @JsonProperty("type")
    public List<Type> getType() {
        return type;
    }


    /**
     * Sets the type.
     *
     * @param type the new type
     */
    @JsonProperty("type")
    public void setType(List<Type> type) {
        this.type = type;
    }


    @JsonProperty("collection")
    public String getCollection() {
        return collection;
    }


    /**
     * Sets the collection.
     *
     * @param collection the new collection
     */
    @JsonProperty("collection")
    public void setCollection(String collection) {
        this.collection = collection;
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
        return new HashCodeBuilder().append(type).append(collection).toHashCode();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataCollection) == false) {
            return false;
        }
        DataCollection rhs = ((DataCollection) other);
        return new EqualsBuilder().append(type, rhs.type).append(collection, rhs.collection).isEquals();
    }

}
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "collection" })
public class DataCollection {

    @JsonProperty("type")
    private List<Type> type = null;
    @JsonProperty("collection")
    private String collection;


    /**
     * No args constructor for use in serialization
     * 
     */
    public DataCollection() {
    }


    /**
     * 
     * @param collection
     * @param type
     */
    public DataCollection(List<Type> type, String collection) {
        super();
        this.type = type;
        this.collection = collection;
    }


    @JsonProperty("type")
    public List<Type> getType() {
        return type;
    }


    @JsonProperty("type")
    public void setType(List<Type> type) {
        this.type = type;
    }


    @JsonProperty("collection")
    public String getCollection() {
        return collection;
    }


    @JsonProperty("collection")
    public void setCollection(String collection) {
        this.collection = collection;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(collection).toHashCode();
    }


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
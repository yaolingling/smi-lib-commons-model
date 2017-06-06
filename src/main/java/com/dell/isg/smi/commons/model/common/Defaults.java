/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class Defaults.
 */
@ApiModel(value = "Defaults", description = "Inventory data object. ")
public class Defaults {

    @ApiModelProperty(value = "type", required = true)
    String type;

    @ApiModelProperty(value = "data", required = true)
    Object data;


    /**
     * Instantiates a new defaults.
     */
    public Defaults() {
        super();
    }


    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }


    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(Object data) {
        this.data = data;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class InventoryCallbackResponse.
 */
@ApiModel(value = "InventoryCallbackResponse", description = "Inventory callback response  for device inventory. ")
public class InventoryCallbackResponse {

    /**
     * Instantiates a new inventory callback response.
     */
    public InventoryCallbackResponse() {
        super();
    }

    @ApiModelProperty(value = "name.", dataType = "string", required = false)
    String name;

    Options options;


    /**
     * Gets the options.
     *
     * @return the options
     */
    public Options getOptions() {
        return options;
    }


    /**
     * Sets the options.
     *
     * @param options the new options
     */
    public void setOptions(Options options) {
        this.options = options;
    }


    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

}

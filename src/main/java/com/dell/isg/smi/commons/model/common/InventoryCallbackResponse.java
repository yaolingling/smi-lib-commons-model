/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "InventoryCallbackResponse", description = "Inventory callback response  for device inventory. ")
public class InventoryCallbackResponse {

    public InventoryCallbackResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

    @ApiModelProperty(value = "name.", dataType = "string", required = false)
    String name;

    Options options;


    public Options getOptions() {
        return options;
    }


    public void setOptions(Options options) {
        this.options = options;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}

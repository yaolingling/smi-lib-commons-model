/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Defaults", description = "Inventory data object. ")
public class Defaults {

    @ApiModelProperty(value = "type", required = true)
    String type;

    @ApiModelProperty(value = "data", required = true)
    Object data;


    public Defaults() {
        super();
        // TODO Auto-generated constructor stub
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }

}

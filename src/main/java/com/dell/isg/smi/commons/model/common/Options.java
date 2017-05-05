/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Options", description = "Option object for call back inventory. ")
public class Options {

    @ApiModelProperty(value = "Defaults", required = true)
    Defaults defaults;


    public Options() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Defaults getDefaults() {
        return defaults;
    }


    public void setDefaults(Defaults defaults) {
        this.defaults = defaults;
    }

}

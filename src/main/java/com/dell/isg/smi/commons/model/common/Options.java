/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class Options.
 */
@ApiModel(value = "Options", description = "Option object for call back inventory. ")
public class Options {

    @ApiModelProperty(value = "Defaults", required = true)
    Defaults defaults;


    /**
     * Instantiates a new options.
     */
    public Options() {
        super();
    }


    /**
     * Gets the defaults.
     *
     * @return the defaults
     */
    public Defaults getDefaults() {
        return defaults;
    }


    /**
     * Sets the defaults.
     *
     * @param defaults the new defaults
     */
    public void setDefaults(Defaults defaults) {
        this.defaults = defaults;
    }

}

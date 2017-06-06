/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.storage;

import com.dell.isg.smi.commons.model.common.IServiceData;

/**
 * The Class Data.
 */
public class Data implements IServiceData {

    private String dataType;

    private Object data;


    /**
     * Instantiates a new data.
     */
    public Data() {
        super();
    }


    /**
     * Instantiates a new data.
     *
     * @param dataType the data type
     * @param data the data
     */
    public Data(String dataType, Object data) {
        super();
        this.dataType = dataType;
        this.data = data;
    }


    /**
     * Gets the data type.
     *
     * @return the data type
     */
    public String getDataType() {
        return dataType;
    }


    /**
     * Sets the data type.
     *
     * @param dataType the new data type
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
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

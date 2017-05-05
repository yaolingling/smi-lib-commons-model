/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.storage;

import com.dell.isg.smi.commons.model.common.IServiceData;

public class Data implements IServiceData {

    private String dataType;

    private Object data;


    public Data() {
        super();
    }


    public Data(String dataType, Object data) {
        super();
        this.dataType = dataType;
        this.data = data;
    }


    public String getDataType() {
        return dataType;
    }


    public void setDataType(String dataType) {
        this.dataType = dataType;
    }


    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }

}

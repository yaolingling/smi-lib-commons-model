/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.common;

/**
 * @author rahman.muhammad
 *
 */
public class CallBackResponse {
    private String id;
    private String name;
    private String descrioption;
    private String data;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescrioption() {
        return descrioption;
    }


    public void setDescrioption(String descrioption) {
        this.descrioption = descrioption;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

}

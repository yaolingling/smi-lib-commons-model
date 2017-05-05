/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware;

/**
 * @author rahman.muhammad
 *
 */
public class UpdateableComponent {

    private String name;
    private String componentType;
    private String targetIdentifier;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getComponentType() {
        return componentType;
    }


    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }


    public String getTargetIdentifier() {
        return targetIdentifier;
    }


    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

}

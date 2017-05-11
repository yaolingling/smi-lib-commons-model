/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware;

/**
 * The Class UpdateableComponent.
 *
 * @author rahman.muhammad
 */
public class UpdateableComponent {

    private String name;
    private String componentType;
    private String targetIdentifier;


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


    /**
     * Gets the component type.
     *
     * @return the component type
     */
    public String getComponentType() {
        return componentType;
    }


    /**
     * Sets the component type.
     *
     * @param componentType the new component type
     */
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }


    /**
     * Gets the target identifier.
     *
     * @return the target identifier
     */
    public String getTargetIdentifier() {
        return targetIdentifier;
    }


    /**
     * Sets the target identifier.
     *
     * @param targetIdentifier the new target identifier
     */
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

}

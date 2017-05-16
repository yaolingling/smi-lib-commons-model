/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware;

/**
 * The Class Update.
 *
 * @author rahman.muhammad
 */
public class Update {

    private String version;
    private String path;
    private String name;
    private String criticality;
    private String uniqueIdentifier;
    private String updateAction;
    private String targetIdentifier;
    private String packageInformationPath;
    private String sourceName;
    private String category;


    /**
     * Gets the version.
     *
     * @return the version
     */
    public String getVersion() {
        return version;
    }


    /**
     * Sets the version.
     *
     * @param version the new version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * Gets the path.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }


    /**
     * Sets the path.
     *
     * @param path the new path
     */
    public void setPath(String path) {
        this.path = path;
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


    /**
     * Gets the criticality.
     *
     * @return the criticality
     */
    public String getCriticality() {
        return criticality;
    }


    /**
     * Sets the criticality.
     *
     * @param criticality the new criticality
     */
    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }


    /**
     * Gets the unique identifier.
     *
     * @return the unique identifier
     */
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }


    /**
     * Sets the unique identifier.
     *
     * @param uniqueIdentifier the new unique identifier
     */
    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }


    /**
     * Gets the update action.
     *
     * @return the update action
     */
    public String getUpdateAction() {
        return updateAction;
    }


    /**
     * Sets the update action.
     *
     * @param updateAction the new update action
     */
    public void setUpdateAction(String updateAction) {
        this.updateAction = updateAction;
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


    /**
     * Gets the package information path.
     *
     * @return the package information path
     */
    public String getPackageInformationPath() {
        return packageInformationPath;
    }


    /**
     * Sets the package information path.
     *
     * @param packageInformationPath the new package information path
     */
    public void setPackageInformationPath(String packageInformationPath) {
        this.packageInformationPath = packageInformationPath;
    }


    /**
     * Gets the source name.
     *
     * @return the source name
     */
    public String getSourceName() {
        return sourceName;
    }


    /**
     * Sets the source name.
     *
     * @param sourceName the new source name
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }


    /**
     * Gets the category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }


    /**
     * Sets the category.
     *
     * @param category the new category
     */
    public void setCategory(String category) {
        this.category = category;
    }

}

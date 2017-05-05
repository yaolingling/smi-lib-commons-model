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


    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCriticality() {
        return criticality;
    }


    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }


    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }


    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }


    public String getUpdateAction() {
        return updateAction;
    }


    public void setUpdateAction(String updateAction) {
        this.updateAction = updateAction;
    }


    public String getTargetIdentifier() {
        return targetIdentifier;
    }


    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }


    public String getPackageInformationPath() {
        return packageInformationPath;
    }


    public void setPackageInformationPath(String packageInformationPath) {
        this.packageInformationPath = packageInformationPath;
    }


    public String getSourceName() {
        return sourceName;
    }


    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

}

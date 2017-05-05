/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.fileshare;

import com.dell.isg.smi.commons.model.credential.PasswordCredential;

public class FileShare {

    private FileShareTypeEnum type;
    private String name;
    private String description;
    private String address;
    private String path;
    private String fileName;
    private PasswordCredential PasswordCredential;
    private String scriptName;
    private String scriptDirectory;


    public FileShare() {
    }


    /**
     * @return the type
     */
    public FileShareTypeEnum getType() {
        return type;
    }


    /**
     * @param type the type to set
     */
    public void setType(FileShareTypeEnum type) {
        this.type = type;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }


    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }


    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }


    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public PasswordCredential getPasswordCredential() {
        return PasswordCredential;
    }


    public void setPasswordCredential(PasswordCredential passwordCredential) {
        PasswordCredential = passwordCredential;
    }


    /**
     * @return the scriptName
     */
    public String getScriptName() {
        return scriptName;
    }


    /**
     * @param scriptName the scriptName to set
     */
    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }


    /**
     * @return the scriptDirectory
     */
    public String getScriptDirectory() {
        return scriptDirectory;
    }


    /**
     * @param scriptDirectory the scriptDirectory to set
     */
    public void setScriptDirectory(String scriptDirectory) {
        this.scriptDirectory = scriptDirectory;
    }

}

/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.fileshare;

import com.dell.isg.smi.commons.model.credential.PasswordCredential;

/**
 * The Class FileShare.
 */
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
     * Gets the type.
     *
     * @return the type
     */
    public FileShareTypeEnum getType() {
        return type;
    }


    /**
     * Sets the type.
     *
     * @param type the type to set
     */
    public void setType(FileShareTypeEnum type) {
        this.type = type;
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
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description.
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }


    /**
     * Gets the file name.
     *
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * Sets the file name.
     *
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the password credential.
     *
     * @return the password credential
     */
    public PasswordCredential getPasswordCredential() {
        return PasswordCredential;
    }


    /**
     * Sets the password credential.
     *
     * @param passwordCredential the new password credential
     */
    public void setPasswordCredential(PasswordCredential passwordCredential) {
        PasswordCredential = passwordCredential;
    }


    /**
     * Gets the script name.
     *
     * @return the scriptName
     */
    public String getScriptName() {
        return scriptName;
    }


    /**
     * Sets the script name.
     *
     * @param scriptName the scriptName to set
     */
    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }


    /**
     * Gets the script directory.
     *
     * @return the scriptDirectory
     */
    public String getScriptDirectory() {
        return scriptDirectory;
    }


    /**
     * Sets the script directory.
     *
     * @param scriptDirectory the scriptDirectory to set
     */
    public void setScriptDirectory(String scriptDirectory) {
        this.scriptDirectory = scriptDirectory;
    }

}

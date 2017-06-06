/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server.firmware;

import java.io.Serializable;

import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The Class SoftwareIdentity.
 *
 * @author rahman.muhammad
 */
public class SoftwareIdentity implements Cloneable, Serializable {

    private static final long serialVersionUID = 5886980529255451962L;
    private long id;
    private String buildNumber = "";
    private String classifications = "";
    private String componentID = "";
    private String componentType = "";
    private String description = "";
    private String detailedStatus = "";
    private String deviceID = "";
    private String elementName = "";
    private String identityInfoValue = "";
    private String installDate = "";
    private String installationDate = "";
    private String instanceID = "";
    private String isEntity = "";
    private String jobIdIfScheduled = "";
    private String majorVersion = "";
    private String minorVersion = "";
    private String releaseDate = "";
    private String revisionNumber = "";
    private String revisionString = "";
    private String serialNumber = "";
    private String status = "";
    private String subDeviceID = "";
    private String subVendorID = "";
    private String targetOSTypes = "";
    private String targetOperatingSystems = "";
    private String vendorID = "";
    private String versionString = "";
    private String manufacturer = "";
    private String nextVersion = "N/A";
    private boolean updateable = true;


    /**
     * Gets the builds the number.
     *
     * @return the builds the number
     */
    public String getBuildNumber() {
        return buildNumber;
    }


    /**
     * Sets the builds the number.
     *
     * @param buildNumber the new builds the number
     */
    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }


    /**
     * Gets the classifications.
     *
     * @return the classifications
     */
    public String getClassifications() {
        return this.classifications;
    }


    /**
     * Sets the classifications.
     *
     * @param classifications the new classifications
     */
    public void setClassifications(String classifications) {
        this.classifications = classifications;
    }


    /**
     * Gets the component ID.
     *
     * @return the component ID
     */
    public String getComponentID() {
        return componentID;
    }


    /**
     * Sets the component ID.
     *
     * @param componentID the new component ID
     */
    public void setComponentID(String componentID) {
        this.componentID = componentID;
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
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the detailed status.
     *
     * @return the detailed status
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }


    /**
     * Sets the detailed status.
     *
     * @param detailedStatus the new detailed status
     */
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }


    /**
     * Gets the device ID.
     *
     * @return the device ID
     */
    public String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the device ID.
     *
     * @param deviceID the new device ID
     */
    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the element name.
     *
     * @return the element name
     */
    public String getElementName() {
        return elementName;
    }


    /**
     * Sets the element name.
     *
     * @param elementName the new element name
     */
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the identity info value.
     *
     * @return the identity info value
     */
    public String getIdentityInfoValue() {
        return identityInfoValue;
    }


    /**
     * Sets the identity info value.
     *
     * @param identityInfoValue the new identity info value
     */
    public void setIdentityInfoValue(String identityInfoValue) {
        this.identityInfoValue = identityInfoValue;
    }


    /**
     * Gets the install date.
     *
     * @return the install date
     */
    public String getInstallDate() {
        return installDate;
    }


    /**
     * Sets the install date.
     *
     * @param installDate the new install date
     */
    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }


    /**
     * Gets the installation date.
     *
     * @return the installation date
     */
    public String getInstallationDate() {
        return installationDate;
    }


    /**
     * Sets the installation date.
     *
     * @param installationDate the new installation date
     */
    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }


    /**
     * Gets the instance ID.
     *
     * @return the instance ID
     */
    public String getInstanceID() {
        return instanceID;
    }


    /**
     * Sets the instance ID.
     *
     * @param instanceID the new instance ID
     */
    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }


    /**
     * Gets the checks if is entity.
     *
     * @return the checks if is entity
     */
    public String getIsEntity() {
        return isEntity;
    }


    /**
     * Sets the checks if is entity.
     *
     * @param isEntity the new checks if is entity
     */
    public void setIsEntity(String isEntity) {
        this.isEntity = isEntity;
    }


    /**
     * Gets the major version.
     *
     * @return the major version
     */
    public String getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the major version.
     *
     * @param majorVersion the new major version
     */
    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minor version.
     *
     * @return the minor version
     */
    public String getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minor version.
     *
     * @param minorVersion the new minor version
     */
    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the release date.
     *
     * @return the release date
     */
    public String getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the release date.
     *
     * @param releaseDate the new release date
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the revision number.
     *
     * @return the revision number
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }


    /**
     * Sets the revision number.
     *
     * @param revisionNumber the new revision number
     */
    public void setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }


    /**
     * Gets the revision string.
     *
     * @return the revision string
     */
    public String getRevisionString() {
        return revisionString;
    }


    /**
     * Sets the revision string.
     *
     * @param revisionString the new revision string
     */
    public void setRevisionString(String revisionString) {
        this.revisionString = revisionString;
    }


    /**
     * Gets the serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serial number.
     *
     * @param serialNumber the new serial number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }


    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * Gets the sub device ID.
     *
     * @return the sub device ID
     */
    public String getSubDeviceID() {
        return subDeviceID;
    }


    /**
     * Sets the sub device ID.
     *
     * @param subDeviceID the new sub device ID
     */
    public void setSubDeviceID(String subDeviceID) {
        this.subDeviceID = subDeviceID;
    }


    /**
     * Gets the sub vendor ID.
     *
     * @return the sub vendor ID
     */
    public String getSubVendorID() {
        return subVendorID;
    }


    /**
     * Sets the sub vendor ID.
     *
     * @param subVendorID the new sub vendor ID
     */
    public void setSubVendorID(String subVendorID) {
        this.subVendorID = subVendorID;
    }


    /**
     * Gets the target OS types.
     *
     * @return the target OS types
     */
    public String getTargetOSTypes() {
        return targetOSTypes;
    }


    /**
     * Sets the target OS types.
     *
     * @param targetOSTypes the new target OS types
     */
    public void setTargetOSTypes(String targetOSTypes) {
        this.targetOSTypes = targetOSTypes;
    }


    /**
     * Gets the target operating systems.
     *
     * @return the target operating systems
     */
    public String getTargetOperatingSystems() {
        return targetOperatingSystems;
    }


    /**
     * Sets the target operating systems.
     *
     * @param rargetOperatingSystems the new target operating systems
     */
    public void setTargetOperatingSystems(String rargetOperatingSystems) {
        this.targetOperatingSystems = rargetOperatingSystems;
    }


    /**
     * Gets the vendor ID.
     *
     * @return the vendor ID
     */
    public String getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendor ID.
     *
     * @param vendorID the new vendor ID
     */
    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the version string.
     *
     * @return the version string
     */
    public String getVersionString() {
        return versionString;
    }


    /**
     * Sets the version string.
     *
     * @param versionString the new version string
     */
    public void setVersionString(String versionString) {
        this.versionString = versionString;
    }


    /**
     * Checks if is updateable.
     *
     * @return true, if is updateable
     */
    public boolean isUpdateable() {
        return updateable;
    }


    /**
     * Sets the updateable.
     *
     * @param updateable the new updateable
     */
    public void setUpdateable(boolean updateable) {
        this.updateable = updateable;
    }


    /**
     * Gets the job id if scheduled.
     *
     * @return the job id if scheduled
     */
    public String getJobIdIfScheduled() {
        return jobIdIfScheduled;
    }


    /**
     * Sets the job id if scheduled.
     *
     * @param jobIdIfScheduled the new job id if scheduled
     */
    public void setJobIdIfScheduled(String jobIdIfScheduled) {
        this.jobIdIfScheduled = jobIdIfScheduled;
    }


    /**
     * Gets the next version.
     *
     * @return the next version
     */
    public String getNextVersion() {
        return nextVersion;
    }


    /**
     * Sets the next version.
     *
     * @param nextVersion the new next version
     */
    public void setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
    }


    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the new manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof SoftwareIdentity) {
            SoftwareIdentity identity = (SoftwareIdentity) object;
            return this.instanceID.equals(identity.getInstanceID());
        }
        return false;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instanceID).toHashCode();
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id.
     *
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

}

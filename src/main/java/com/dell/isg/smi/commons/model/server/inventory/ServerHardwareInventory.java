/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.server.inventory;

import java.util.ArrayList;
import java.util.List;

public class ServerHardwareInventory {

    public ServerHardwareInventory() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String id;
    protected HwSystem system;
    protected List<HwBattery> batteries;
    protected List<HwCpu> cpus;
    protected List<HwFan> fans;
    protected List<HwLed> leds;
    protected List<HwIntrusion> intrusions;
    protected List<HwMemory> memories;
    protected List<HwNic> nics;
    protected List<HwPsu> powerSupplyUnits;
    protected List<HwSDCard> sdCards;
    protected List<HwTemperature> temperatures;
    protected List<HwVoltage> voltages;
    protected List<HwNote> notes;
    protected HwStorage storage;
    protected HwPowerMonitoring powerMonitoring;


    public ServerHardwareInventory(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }


    /**
     * Gets the value of the system property.
     * 
     * @return possible object is {@link HwSystem }
     * 
     */
    public HwSystem getSystem() {
        return system;
    }


    /**
     * Sets the value of the system property.
     * 
     * @param value allowed object is {@link HwSystem }
     * 
     */
    public void setSystem(HwSystem value) {
        this.system = value;
    }


    /**
     * Gets the value of the batteries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getBatteries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwBattery }
     * 
     * 
     */
    public List<HwBattery> getBatteries() {
        if (batteries == null) {
            batteries = new ArrayList<HwBattery>();
        }
        return this.batteries;
    }


    /**
     * Gets the value of the cpus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCpus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwCpu }
     * 
     * 
     */
    public List<HwCpu> getCpus() {
        if (cpus == null) {
            cpus = new ArrayList<HwCpu>();
        }
        return this.cpus;
    }


    /**
     * Gets the value of the fans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwFan }
     * 
     * 
     */
    public List<HwFan> getFans() {
        if (fans == null) {
            fans = new ArrayList<HwFan>();
        }
        return this.fans;
    }


    /**
     * Gets the value of the leds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getLeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwLed }
     * 
     * 
     */
    public List<HwLed> getLeds() {
        if (leds == null) {
            leds = new ArrayList<HwLed>();
        }
        return this.leds;
    }


    /**
     * Gets the value of the intrusions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrusions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIntrusions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwIntrusion }
     * 
     * 
     */
    public List<HwIntrusion> getIntrusions() {
        if (intrusions == null) {
            intrusions = new ArrayList<HwIntrusion>();
        }
        return this.intrusions;
    }


    /**
     * Gets the value of the memories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMemories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwMemory }
     * 
     * 
     */
    public List<HwMemory> getMemories() {
        if (memories == null) {
            memories = new ArrayList<HwMemory>();
        }
        return this.memories;
    }


    /**
     * Gets the value of the nics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwNic }
     * 
     * 
     */
    public List<HwNic> getNics() {
        if (nics == null) {
            nics = new ArrayList<HwNic>();
        }
        return this.nics;
    }


    /**
     * Gets the value of the powerSupplyUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerSupplyUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPowerSupplyUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwPsu }
     * 
     * 
     */
    public List<HwPsu> getPowerSupplyUnits() {
        if (powerSupplyUnits == null) {
            powerSupplyUnits = new ArrayList<HwPsu>();
        }
        return this.powerSupplyUnits;
    }


    /**
     * Gets the value of the sdCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSdCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwSDCard }
     * 
     * 
     */
    public List<HwSDCard> getSdCards() {
        if (sdCards == null) {
            sdCards = new ArrayList<HwSDCard>();
        }
        return this.sdCards;
    }


    /**
     * Gets the value of the temperatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTemperatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwTemperature }
     * 
     * 
     */
    public List<HwTemperature> getTemperatures() {
        if (temperatures == null) {
            temperatures = new ArrayList<HwTemperature>();
        }
        return this.temperatures;
    }


    /**
     * Gets the value of the voltages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voltages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVoltages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwVoltage }
     * 
     * 
     */
    public List<HwVoltage> getVoltages() {
        if (voltages == null) {
            voltages = new ArrayList<HwVoltage>();
        }
        return this.voltages;
    }


    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HwNote }
     * 
     * 
     */
    public List<HwNote> getNotes() {
        if (notes == null) {
            notes = new ArrayList<HwNote>();
        }
        return this.notes;
    }


    /**
     * Gets the value of the storage property.
     * 
     * @return possible object is {@link HwStorage }
     * 
     */
    public HwStorage getStorage() {
        return storage;
    }


    /**
     * Sets the value of the storage property.
     * 
     * @param value allowed object is {@link HwStorage }
     * 
     */
    public void setStorage(HwStorage value) {
        this.storage = value;
    }


    /**
     * Gets the value of the powerMonitoring property.
     * 
     * @return possible object is {@link HwPowerMonitoring }
     * 
     */
    public HwPowerMonitoring getPowerMonitoring() {
        return powerMonitoring;
    }


    /**
     * Sets the value of the powerMonitoring property.
     * 
     * @param value allowed object is {@link HwPowerMonitoring }
     * 
     */
    public void setPowerMonitoring(HwPowerMonitoring value) {
        this.powerMonitoring = value;
    }

}

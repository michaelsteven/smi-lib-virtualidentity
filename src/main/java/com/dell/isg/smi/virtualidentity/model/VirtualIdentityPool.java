/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.virtualidentity.model;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@ApiModel
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualIdentityPool", propOrder = { "id", "type", "prefix", "autoGenerateIdentities", "available", "assigned", "reserved" })
public class VirtualIdentityPool {

    protected long id;
    @XmlElement(required = true)
    protected VirtualIdentityType type;
    @XmlElement(required = true)
    protected String prefix;
    @XmlElement(defaultValue = "true")
    protected boolean autoGenerateIdentities;
    protected long available;
    protected long assigned;
    protected long reserved;


    /**
     * Gets the value of the id property.
     *
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link VirtualIdentityType }
     *
     */
    public VirtualIdentityType getType() {
        return type;
    }


    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link VirtualIdentityType }
     *
     */
    public void setType(VirtualIdentityType value) {
        this.type = value;
    }


    /**
     * Gets the value of the prefix property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrefix() {
        return prefix;
    }


    /**
     * Sets the value of the prefix property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }


    /**
     * Gets the value of the autoGenerateIdentities property.
     *
     */
    public boolean isAutoGenerateIdentities() {
        return autoGenerateIdentities;
    }


    /**
     * Sets the value of the autoGenerateIdentities property.
     *
     */
    public void setAutoGenerateIdentities(boolean value) {
        this.autoGenerateIdentities = value;
    }


    /**
     * Gets the value of the available property.
     *
     */
    public long getAvailable() {
        return available;
    }


    /**
     * Sets the value of the available property.
     *
     */
    public void setAvailable(long value) {
        this.available = value;
    }


    /**
     * Gets the value of the assigned property.
     *
     */
    public long getAssigned() {
        return assigned;
    }


    /**
     * Sets the value of the assigned property.
     *
     */
    public void setAssigned(long value) {
        this.assigned = value;
    }


    /**
     * Gets the value of the reserved property.
     *
     */
    public long getReserved() {
        return reserved;
    }


    /**
     * Sets the value of the reserved property.
     *
     */
    public void setReserved(long value) {
        this.reserved = value;
    }

}

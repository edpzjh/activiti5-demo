//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.19 at 12:56:04 ���� CST 
//

package com.bulain.swift.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Restriction1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Restriction1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}CodeOrProprietary1Choice"/>
 *         &lt;element name="VldFr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}ISODateTime"/>
 *         &lt;element name="VldUntil" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction1", propOrder = {"rstrctnTp", "vldFr", "vldUntil"})
public class Restriction1 {

    @XmlElement(name = "RstrctnTp", required = true)
    protected CodeOrProprietary1Choice rstrctnTp;
    @XmlElement(name = "VldFr", required = true)
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "VldUntil")
    protected XMLGregorianCalendar vldUntil;

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return possible object is {@link CodeOrProprietary1Choice }
     * 
     */
    public CodeOrProprietary1Choice getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *            allowed object is {@link CodeOrProprietary1Choice }
     * 
     */
    public void setRstrctnTp(CodeOrProprietary1Choice value) {
        this.rstrctnTp = value;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
    }

}

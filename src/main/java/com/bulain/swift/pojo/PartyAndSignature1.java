//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.19 at 12:56:14 ���� CST 
//


package com.bulain.swift.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAndSignature1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAndSignature1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.01}PartyIdentification41"/>
 *         &lt;element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.01}ProprietaryData3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAndSignature1", propOrder = {
    "pty",
    "sgntr"
})
public class PartyAndSignature1 {

    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification41 pty;
    @XmlElement(name = "Sgntr", required = true)
    protected ProprietaryData3 sgntr;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification41 }
     *     
     */
    public PartyIdentification41 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification41 }
     *     
     */
    public void setPty(PartyIdentification41 value) {
        this.pty = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData3 }
     *     
     */
    public ProprietaryData3 getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData3 }
     *     
     */
    public void setSgntr(ProprietaryData3 value) {
        this.sgntr = value;
    }

}

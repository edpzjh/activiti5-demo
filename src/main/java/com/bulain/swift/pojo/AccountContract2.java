//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.19 at 12:56:09 ���� CST 
//


package com.bulain.swift.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountContract2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountContract2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrgtGoLiveDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.017.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="TrgtClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.017.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="UrgcyFlg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.017.001.01}YesNoIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountContract2", propOrder = {
    "trgtGoLiveDt",
    "trgtClsgDt",
    "urgcyFlg"
})
public class AccountContract2 {

    @XmlElement(name = "TrgtGoLiveDt")
    protected XMLGregorianCalendar trgtGoLiveDt;
    @XmlElement(name = "TrgtClsgDt")
    protected XMLGregorianCalendar trgtClsgDt;
    @XmlElement(name = "UrgcyFlg")
    protected Boolean urgcyFlg;

    /**
     * Gets the value of the trgtGoLiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrgtGoLiveDt() {
        return trgtGoLiveDt;
    }

    /**
     * Sets the value of the trgtGoLiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrgtGoLiveDt(XMLGregorianCalendar value) {
        this.trgtGoLiveDt = value;
    }

    /**
     * Gets the value of the trgtClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrgtClsgDt() {
        return trgtClsgDt;
    }

    /**
     * Sets the value of the trgtClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrgtClsgDt(XMLGregorianCalendar value) {
        this.trgtClsgDt = value;
    }

    /**
     * Gets the value of the urgcyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgcyFlg() {
        return urgcyFlg;
    }

    /**
     * Sets the value of the urgcyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgcyFlg(Boolean value) {
        this.urgcyFlg = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.19 at 12:56:04 ���� CST 
//


package com.bulain.swift.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Organisation6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullLglNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}Max350Text"/>
 *         &lt;element name="TradgNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}Max350Text" minOccurs="0"/>
 *         &lt;element name="CtryOfOpr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}CountryCode"/>
 *         &lt;element name="RegnDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="OprlAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PostalAddress6" minOccurs="0"/>
 *         &lt;element name="BizAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PostalAddress6" minOccurs="0"/>
 *         &lt;element name="LglAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PostalAddress6"/>
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}OrganisationIdentification6"/>
 *         &lt;element name="RprtvOffcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PartyIdentification40" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrsrMgr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PartyIdentification40" minOccurs="0"/>
 *         &lt;element name="MainMndtHldr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PartyIdentification40" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.01}PartyIdentification40" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation6", propOrder = {
    "fullLglNm",
    "tradgNm",
    "ctryOfOpr",
    "regnDt",
    "oprlAdr",
    "bizAdr",
    "lglAdr",
    "orgId",
    "rprtvOffcr",
    "trsrMgr",
    "mainMndtHldr",
    "sndr"
})
public class Organisation6 {

    @XmlElement(name = "FullLglNm", required = true)
    protected String fullLglNm;
    @XmlElement(name = "TradgNm")
    protected String tradgNm;
    @XmlElement(name = "CtryOfOpr", required = true)
    protected String ctryOfOpr;
    @XmlElement(name = "RegnDt")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "OprlAdr")
    protected PostalAddress6 oprlAdr;
    @XmlElement(name = "BizAdr")
    protected PostalAddress6 bizAdr;
    @XmlElement(name = "LglAdr", required = true)
    protected PostalAddress6 lglAdr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification6 orgId;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyIdentification40> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyIdentification40 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyIdentification40> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyIdentification40> sndr;

    /**
     * Gets the value of the fullLglNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullLglNm() {
        return fullLglNm;
    }

    /**
     * Sets the value of the fullLglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullLglNm(String value) {
        this.fullLglNm = value;
    }

    /**
     * Gets the value of the tradgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgNm() {
        return tradgNm;
    }

    /**
     * Sets the value of the tradgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgNm(String value) {
        this.tradgNm = value;
    }

    /**
     * Gets the value of the ctryOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfOpr() {
        return ctryOfOpr;
    }

    /**
     * Sets the value of the ctryOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfOpr(String value) {
        this.ctryOfOpr = value;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegnDt(XMLGregorianCalendar value) {
        this.regnDt = value;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setOprlAdr(PostalAddress6 value) {
        this.oprlAdr = value;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setBizAdr(PostalAddress6 value) {
        this.bizAdr = value;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setLglAdr(PostalAddress6 value) {
        this.lglAdr = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification6 }
     *     
     */
    public OrganisationIdentification6 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification6 }
     *     
     */
    public void setOrgId(OrganisationIdentification6 value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the rprtvOffcr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rprtvOffcr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprtvOffcr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification40 }
     * 
     * 
     */
    public List<PartyIdentification40> getRprtvOffcr() {
        if (rprtvOffcr == null) {
            rprtvOffcr = new ArrayList<PartyIdentification40>();
        }
        return this.rprtvOffcr;
    }

    /**
     * Gets the value of the trsrMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification40 }
     *     
     */
    public PartyIdentification40 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification40 }
     *     
     */
    public void setTrsrMgr(PartyIdentification40 value) {
        this.trsrMgr = value;
    }

    /**
     * Gets the value of the mainMndtHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainMndtHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainMndtHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification40 }
     * 
     * 
     */
    public List<PartyIdentification40> getMainMndtHldr() {
        if (mainMndtHldr == null) {
            mainMndtHldr = new ArrayList<PartyIdentification40>();
        }
        return this.mainMndtHldr;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sndr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification40 }
     * 
     * 
     */
    public List<PartyIdentification40> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<PartyIdentification40>();
        }
        return this.sndr;
    }

}

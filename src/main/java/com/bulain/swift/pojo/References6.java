//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.19 at 12:55:51 ���� CST 
//


package com.bulain.swift.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for References6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="References6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RjctdReqTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.01}UseCases1Code"/>
 *         &lt;element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.01}Max350Text" maxOccurs="unbounded"/>
 *         &lt;element name="RjctdReqId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.01}MessageIdentification1"/>
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.01}MessageIdentification1"/>
 *         &lt;element name="PrcId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.01}MessageIdentification1"/>
 *         &lt;element name="AttchdDocNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References6", propOrder = {
    "rjctdReqTp",
    "rjctnRsn",
    "rjctdReqId",
    "msgId",
    "prcId",
    "attchdDocNm"
})
public class References6 {

    @XmlElement(name = "RjctdReqTp", required = true)
    protected UseCases1Code rjctdReqTp;
    @XmlElement(name = "RjctnRsn", required = true)
    protected List<String> rjctnRsn;
    @XmlElement(name = "RjctdReqId", required = true)
    protected MessageIdentification1 rjctdReqId;
    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrcId", required = true)
    protected MessageIdentification1 prcId;
    @XmlElement(name = "AttchdDocNm")
    protected List<String> attchdDocNm;

    /**
     * Gets the value of the rjctdReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link UseCases1Code }
     *     
     */
    public UseCases1Code getRjctdReqTp() {
        return rjctdReqTp;
    }

    /**
     * Sets the value of the rjctdReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCases1Code }
     *     
     */
    public void setRjctdReqTp(UseCases1Code value) {
        this.rjctdReqTp = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctnRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctnRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRjctnRsn() {
        if (rjctnRsn == null) {
            rjctnRsn = new ArrayList<String>();
        }
        return this.rjctnRsn;
    }

    /**
     * Gets the value of the rjctdReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctdReqId() {
        return rjctdReqId;
    }

    /**
     * Sets the value of the rjctdReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRjctdReqId(MessageIdentification1 value) {
        this.rjctdReqId = value;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the prcId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getPrcId() {
        return prcId;
    }

    /**
     * Sets the value of the prcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setPrcId(MessageIdentification1 value) {
        this.prcId = value;
    }

    /**
     * Gets the value of the attchdDocNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchdDocNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdDocNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttchdDocNm() {
        if (attchdDocNm == null) {
            attchdDocNm = new ArrayList<String>();
        }
        return this.attchdDocNm;
    }

}

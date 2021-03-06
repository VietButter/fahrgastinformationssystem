//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tOcpPropOperational complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOcpPropOperational">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="operationalType" type="{http://www.railml.org/schemas/2009}tOcpOperationalType" />
 *       &lt;attribute name="trafficType" type="{http://www.railml.org/schemas/2009}tOcpTrafficType" />
 *       &lt;attribute name="orderChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ensuresTrainSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOcpPropOperational")
@XmlSeeAlso({
    EOcpPropOperational.class
})
public class TOcpPropOperational {

    @XmlAttribute(name = "operationalType")
    protected TOcpOperationalType operationalType;
    @XmlAttribute(name = "trafficType")
    protected TOcpTrafficType trafficType;
    @XmlAttribute(name = "orderChangeable")
    protected Boolean orderChangeable;
    @XmlAttribute(name = "ensuresTrainSequence")
    protected Boolean ensuresTrainSequence;

    /**
     * Gets the value of the operationalType property.
     * 
     * @return
     *     possible object is
     *     {@link TOcpOperationalType }
     *     
     */
    public TOcpOperationalType getOperationalType() {
        return operationalType;
    }

    /**
     * Sets the value of the operationalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOcpOperationalType }
     *     
     */
    public void setOperationalType(TOcpOperationalType value) {
        this.operationalType = value;
    }

    /**
     * Gets the value of the trafficType property.
     * 
     * @return
     *     possible object is
     *     {@link TOcpTrafficType }
     *     
     */
    public TOcpTrafficType getTrafficType() {
        return trafficType;
    }

    /**
     * Sets the value of the trafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOcpTrafficType }
     *     
     */
    public void setTrafficType(TOcpTrafficType value) {
        this.trafficType = value;
    }

    /**
     * Gets the value of the orderChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrderChangeable() {
        if (orderChangeable == null) {
            return false;
        } else {
            return orderChangeable;
        }
    }

    /**
     * Sets the value of the orderChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderChangeable(Boolean value) {
        this.orderChangeable = value;
    }

    /**
     * Gets the value of the ensuresTrainSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnsuresTrainSequence() {
        if (ensuresTrainSequence == null) {
            return true;
        } else {
            return ensuresTrainSequence;
        }
    }

    /**
     * Sets the value of the ensuresTrainSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsuresTrainSequence(Boolean value) {
        this.ensuresTrainSequence = value;
    }

}

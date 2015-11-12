//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPlacedElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPlacedElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tElementWithIDAndName">
 *       &lt;sequence>
 *         &lt;element name="geoCoord" type="{http://www.railml.org/schemas/2009}tGeoCoord" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aAbsPosition"/>
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aRelPosition"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPlacedElement", propOrder = {
    "geoCoord"
})
@XmlSeeAlso({
    TCommonSwitchAndCrossingData.class,
    TOrientedElement.class
})
public class TPlacedElement
    extends TElementWithIDAndName
{

    protected TGeoCoord geoCoord;
    @XmlAttribute(name = "absPos")
    protected BigDecimal absPos;
    @XmlAttribute(name = "absPosOffset")
    protected BigDecimal absPosOffset;
    @XmlAttribute(name = "pos", required = true)
    protected BigDecimal pos;

    /**
     * Gets the value of the geoCoord property.
     * 
     * @return
     *     possible object is
     *     {@link TGeoCoord }
     *     
     */
    public TGeoCoord getGeoCoord() {
        return geoCoord;
    }

    /**
     * Sets the value of the geoCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGeoCoord }
     *     
     */
    public void setGeoCoord(TGeoCoord value) {
        this.geoCoord = value;
    }

    /**
     * Gets the value of the absPos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAbsPos() {
        return absPos;
    }

    /**
     * Sets the value of the absPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbsPos(BigDecimal value) {
        this.absPos = value;
    }

    /**
     * Gets the value of the absPosOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAbsPosOffset() {
        return absPosOffset;
    }

    /**
     * Sets the value of the absPosOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbsPosOffset(BigDecimal value) {
        this.absPosOffset = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPos(BigDecimal value) {
        this.pos = value;
    }

}
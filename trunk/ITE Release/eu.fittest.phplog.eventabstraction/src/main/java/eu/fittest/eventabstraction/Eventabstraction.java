//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.11 at 09:58:02 AM CET 
//


package eu.fittest.eventabstraction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventabstraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventabstraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rewrites" type="{http://fittest.eu/eventabstraction}rewrites"/>
 *         &lt;element name="abstractions" type="{http://fittest.eu/eventabstraction}abstractionspaths"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventabstraction", propOrder = {
    "rewrites",
    "abstractions"
})
public class Eventabstraction {

    @XmlElement(required = true)
    protected Rewrites rewrites;
    @XmlElement(required = true)
    protected Abstractionspaths abstractions;

    /**
     * Gets the value of the rewrites property.
     * 
     * @return
     *     possible object is
     *     {@link Rewrites }
     *     
     */
    public Rewrites getRewrites() {
        return rewrites;
    }

    /**
     * Sets the value of the rewrites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rewrites }
     *     
     */
    public void setRewrites(Rewrites value) {
        this.rewrites = value;
    }

    /**
     * Gets the value of the abstractions property.
     * 
     * @return
     *     possible object is
     *     {@link Abstractionspaths }
     *     
     */
    public Abstractionspaths getAbstractions() {
        return abstractions;
    }

    /**
     * Sets the value of the abstractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstractionspaths }
     *     
     */
    public void setAbstractions(Abstractionspaths value) {
        this.abstractions = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2011.03.27 um 12:23:14 MESZ 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for recurrence_startType complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/C:/Users/fox/Documents/My%20Dropbox/Sourcecode/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 1191)
 * <p>
 * <pre>
 * &lt;complexType name="recurrence_startType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RecurrenceStartType {


    /**
     * Gets the value of the gdate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getGdate();

    /**
     * Sets the value of the gdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setGdate(java.util.Calendar value);

}

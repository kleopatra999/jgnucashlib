//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2008.11.14 um 01:47:20 MEZ 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/D:/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 669)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="cd_type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="account"/>
 *             &lt;enumeration value="book"/>
 *             &lt;enumeration value="commodity"/>
 *             &lt;enumeration value="gnc:GncCustomer"/>
 *             &lt;enumeration value="gnc:GncEntry"/>
 *             &lt;enumeration value="gnc:GncInvoice"/>
 *             &lt;enumeration value="gnc:GncJob"/>
 *             &lt;enumeration value="gnc:GncTaxTable"/>
 *             &lt;enumeration value="schedxaction"/>
 *             &lt;enumeration value="transaction"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GncCountDataType {


    /**
     * Gets the value of the value property.
     * 
     */
    int getValue();

    /**
     * Sets the value of the value property.
     * 
     */
    void setValue(int value);

    /**
     * Gets the value of the cdType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCdType();

    /**
     * Sets the value of the cdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCdType(java.lang.String value);

}

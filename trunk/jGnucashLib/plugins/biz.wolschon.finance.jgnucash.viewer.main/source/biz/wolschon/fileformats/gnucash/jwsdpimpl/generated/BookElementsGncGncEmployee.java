//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.05.31 um 04:05:48 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for gnc_GncEmployee element declaration.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 488)
 * <p>
 * <pre>
 * &lt;element name="gnc_GncEmployee">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="employee_guid">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="employee_username">
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/element>
 *           &lt;element name="employee_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="employee_addr" type="{}address"/>
 *           &lt;element name="employee_language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="employee_active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="employee_workday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="employee_rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="employee_currency">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{}cmdty_space"/>
 *                     &lt;element ref="{}cmdty_id"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="employee_ccard" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="type" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="guid"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cust_slots" type="{}slots_type" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface BookElementsGncGncEmployee
    extends javax.xml.bind.Element, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncEmployeeType
{


}

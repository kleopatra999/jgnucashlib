//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2008.10.07 um 08:47:11 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 573)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="act_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="act_id">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="act_type">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ASSET"/>
 *             &lt;enumeration value="BANK"/>
 *             &lt;enumeration value="CASH"/>
 *             &lt;enumeration value="CREDIT"/>
 *             &lt;enumeration value="EQUITY"/>
 *             &lt;enumeration value="EXPENSE"/>
 *             &lt;enumeration value="INCOME"/>
 *             &lt;enumeration value="LIABILITY"/>
 *             &lt;enumeration value="MUTUAL"/>
 *             &lt;enumeration value="RECEIVABLE"/>
 *             &lt;enumeration value="STOCK"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="act_commodity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}cmdty_space"/>
 *                   &lt;element ref="{}cmdty_id"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="act_commodity-scu">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="100"/>
 *             &lt;enumeration value="1000"/>
 *             &lt;enumeration value="10000"/>
 *             &lt;enumeration value="100000"/>
 *             &lt;enumeration value="1000000"/>
 *             &lt;enumeration value="10000000"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="act_non-standard-scu" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="act_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="act_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="act_slots" type="{}slots_type" minOccurs="0"/>
 *         &lt;element name="act_parent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="act_lots" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gnc_lot" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lot_id">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="lot_slots" type="{}slots_type"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GncAccountType {


    /**
     * Gets the value of the actParent property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActParentType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActParentType getActParent();

    /**
     * Sets the value of the actParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActParentType}
     */
    void setActParent(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActParentType value);

    /**
     * Gets the value of the actDescription property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getActDescription();

    /**
     * Sets the value of the actDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setActDescription(java.lang.String value);

    /**
     * Gets the value of the actType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getActType();

    /**
     * Sets the value of the actType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setActType(java.lang.String value);

    /**
     * Gets the value of the actLots property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType getActLots();

    /**
     * Sets the value of the actLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType}
     */
    void setActLots(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType value);

    /**
     * Gets the value of the actName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getActName();

    /**
     * Sets the value of the actName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setActName(java.lang.String value);

    /**
     * Gets the value of the actCode property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getActCode();

    /**
     * Sets the value of the actCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setActCode(java.lang.String value);

    /**
     * Gets the value of the actNonStandardScu property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActNonStandardScuType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActNonStandardScuType getActNonStandardScu();

    /**
     * Sets the value of the actNonStandardScu property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActNonStandardScuType}
     */
    void setActNonStandardScu(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActNonStandardScuType value);

    /**
     * Gets the value of the actId property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActIdType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActIdType getActId();

    /**
     * Sets the value of the actId property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActIdType}
     */
    void setActId(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActIdType value);

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getVersion();

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setVersion(java.lang.String value);

    /**
     * Gets the value of the actSlots property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType getActSlots();

    /**
     * Sets the value of the actSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType}
     */
    void setActSlots(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType value);

    /**
     * Gets the value of the actCommodity property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActCommodityType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActCommodityType getActCommodity();

    /**
     * Sets the value of the actCommodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActCommodityType}
     */
    void setActCommodity(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActCommodityType value);

    /**
     * Gets the value of the actCommodityScu property.
     * 
     */
    int getActCommodityScu();

    /**
     * Sets the value of the actCommodityScu property.
     * 
     */
    void setActCommodityScu(int value);


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 603)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}cmdty_space"/>
     *         &lt;element ref="{}cmdty_id"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface ActCommodityType {


        /**
         * Gets the value of the cmdtyId property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getCmdtyId();

        /**
         * Sets the value of the cmdtyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setCmdtyId(java.lang.String value);

        /**
         * Gets the value of the cmdtySpace property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getCmdtySpace();

        /**
         * Sets the value of the cmdtySpace property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setCmdtySpace(java.lang.String value);

    }


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 577)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface ActIdType {


        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getType();

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setType(java.lang.String value);

    }


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 639)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="gnc_lot" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lot_id">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="lot_slots" type="{}slots_type"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface ActLotsType {


        /**
         * Gets the value of the GncLot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the GncLot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGncLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType.GncLotType}
         * 
         */
        java.util.List getGncLot();


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 642)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="lot_id">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="lot_slots" type="{}slots_type"/>
         *       &lt;/sequence>
         *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface GncLotType {


            /**
             * Gets the value of the lotId property.
             * 
             * @return
             *     possible object is
             *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType.GncLotType.LotIdType}
             */
            biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType.GncLotType.LotIdType getLotId();

            /**
             * Sets the value of the lotId property.
             * 
             * @param value
             *     allowed object is
             *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType.GncLotType.LotIdType}
             */
            void setLotId(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsType.GncLotType.LotIdType value);

            /**
             * Gets the value of the lotSlots property.
             * 
             * @return
             *     possible object is
             *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType}
             */
            biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType getLotSlots();

            /**
             * Sets the value of the lotSlots property.
             * 
             * @param value
             *     allowed object is
             *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType}
             */
            void setLotSlots(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotsType value);

            /**
             * Gets the value of the version property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getVersion();

            /**
             * Sets the value of the version property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setVersion(java.lang.String value);


            /**
             * Java content class for anonymous complex type.
             * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 645)
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             */
            public interface LotIdType {


                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String}
                 */
                java.lang.String getValue();

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String}
                 */
                void setValue(java.lang.String value);

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String}
                 */
                java.lang.String getType();

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String}
                 */
                void setType(java.lang.String value);

            }

        }

    }


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 624)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface ActNonStandardScuType {


    }


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 630)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface ActParentType {


        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getType();

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setType(java.lang.String value);

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.01.03 um 05:56:28 CET 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 425)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxtable_guid">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="taxtable_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxtable_refcount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxtable_invisible" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxtable_parent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="taxtable_child" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="taxtable_entries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gnc_GncTaxTableEntry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tte_acct">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="tte_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tte_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
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
public interface GncGncTaxTableType {


    /**
     * Gets the value of the taxtableChild property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableChildType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableChildType getTaxtableChild();

    /**
     * Sets the value of the taxtableChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableChildType}
     */
    void setTaxtableChild(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableChildType value);

    /**
     * Gets the value of the taxtableName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTaxtableName();

    /**
     * Sets the value of the taxtableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTaxtableName(java.lang.String value);

    /**
     * Gets the value of the taxtableEntries property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType getTaxtableEntries();

    /**
     * Sets the value of the taxtableEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType}
     */
    void setTaxtableEntries(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType value);

    /**
     * Gets the value of the taxtableParent property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableParentType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableParentType getTaxtableParent();

    /**
     * Sets the value of the taxtableParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableParentType}
     */
    void setTaxtableParent(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableParentType value);

    /**
     * Gets the value of the taxtableInvisible property.
     * 
     */
    int getTaxtableInvisible();

    /**
     * Sets the value of the taxtableInvisible property.
     * 
     */
    void setTaxtableInvisible(int value);

    /**
     * Gets the value of the taxtableRefcount property.
     * 
     */
    int getTaxtableRefcount();

    /**
     * Sets the value of the taxtableRefcount property.
     * 
     */
    void setTaxtableRefcount(int value);

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
     * Gets the value of the taxtableGuid property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableGuidType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableGuidType getTaxtableGuid();

    /**
     * Sets the value of the taxtableGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableGuidType}
     */
    void setTaxtableGuid(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableGuidType value);


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 449)
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
    public interface TaxtableChildType {


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
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 458)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="gnc_GncTaxTableEntry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tte_acct">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="tte_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tte_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
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
    public interface TaxtableEntriesType {


        /**
         * Gets the value of the GncGncTaxTableEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the GncGncTaxTableEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGncGncTaxTableEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType.GncGncTaxTableEntryType}
         * 
         */
        java.util.List getGncGncTaxTableEntry();


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 461)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tte_acct">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="tte_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tte_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface GncGncTaxTableEntryType {


            /**
             * Gets the value of the tteAmount property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getTteAmount();

            /**
             * Sets the value of the tteAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setTteAmount(java.lang.String value);

            /**
             * Gets the value of the tteAcct property.
             * 
             * @return
             *     possible object is
             *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType.GncGncTaxTableEntryType.TteAcctType}
             */
            biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType.GncGncTaxTableEntryType.TteAcctType getTteAcct();

            /**
             * Sets the value of the tteAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType.GncGncTaxTableEntryType.TteAcctType}
             */
            void setTteAcct(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncTaxTableType.TaxtableEntriesType.GncGncTaxTableEntryType.TteAcctType value);

            /**
             * Gets the value of the tteType property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getTteType();

            /**
             * Sets the value of the tteType property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setTteType(java.lang.String value);


            /**
             * Java content class for anonymous complex type.
             * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 464)
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
            public interface TteAcctType {


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
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 428)
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
    public interface TaxtableGuidType {


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
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 440)
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
    public interface TaxtableParentType {


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

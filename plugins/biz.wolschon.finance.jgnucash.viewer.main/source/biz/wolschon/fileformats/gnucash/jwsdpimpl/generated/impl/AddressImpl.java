//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2008.10.08 um 08:50:36 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl;

public class AddressImpl implements biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.Address, com.sun.xml.bind.JAXBObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallableObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializable, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.ValidatableObject
{

    protected java.lang.String _AddrAddr4;
    protected java.lang.String _AddrPhone;
    protected java.lang.String _AddrAddr3;
    protected java.lang.String _AddrAddr2;
    protected java.lang.String _AddrEmail;
    protected java.lang.String _AddrAddr1;
    protected java.lang.String _AddrName;
    protected java.lang.String _Version;
    protected java.lang.String _AddrFax;
    public final static java.lang.Class version = (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.Address.class);
    }

    public java.lang.String getAddrAddr4() {
        return _AddrAddr4;
    }

    public void setAddrAddr4(java.lang.String value) {
        _AddrAddr4 = value;
    }

    public java.lang.String getAddrPhone() {
        return _AddrPhone;
    }

    public void setAddrPhone(java.lang.String value) {
        _AddrPhone = value;
    }

    public java.lang.String getAddrAddr3() {
        return _AddrAddr3;
    }

    public void setAddrAddr3(java.lang.String value) {
        _AddrAddr3 = value;
    }

    public java.lang.String getAddrAddr2() {
        return _AddrAddr2;
    }

    public void setAddrAddr2(java.lang.String value) {
        _AddrAddr2 = value;
    }

    public java.lang.String getAddrEmail() {
        return _AddrEmail;
    }

    public void setAddrEmail(java.lang.String value) {
        _AddrEmail = value;
    }

    public java.lang.String getAddrAddr1() {
        return _AddrAddr1;
    }

    public void setAddrAddr1(java.lang.String value) {
        _AddrAddr1 = value;
    }

    public java.lang.String getAddrName() {
        return _AddrName;
    }

    public void setAddrName(java.lang.String value) {
        _AddrName = value;
    }

    public java.lang.String getVersion() {
        return _Version;
    }

    public void setVersion(java.lang.String value) {
        _Version = value;
    }

    public java.lang.String getAddrFax() {
        return _AddrFax;
    }

    public void setAddrFax(java.lang.String value) {
        _AddrFax = value;
    }

    public biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
        return new biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.AddressImpl.Unmarshaller(context);
    }

    public void serializeBody(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_AddrName!= null) {
            context.startElement("", "addr_name");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrName), "AddrName");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrAddr1 != null) {
            context.startElement("", "addr_addr1");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrAddr1), "AddrAddr1");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrAddr2 != null) {
            context.startElement("", "addr_addr2");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrAddr2), "AddrAddr2");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrAddr3 != null) {
            context.startElement("", "addr_addr3");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrAddr3), "AddrAddr3");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrAddr4 != null) {
            context.startElement("", "addr_addr4");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrAddr4), "AddrAddr4");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrPhone!= null) {
            context.startElement("", "addr_phone");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrPhone), "AddrPhone");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrFax!= null) {
            context.startElement("", "addr_fax");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrFax), "AddrFax");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_AddrEmail!= null) {
            context.startElement("", "addr_email");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _AddrEmail), "AddrEmail");
            } catch (java.lang.Exception e) {
                biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "version");
        try {
            context.text(((java.lang.String) _Version), "Version");
        } catch (java.lang.Exception e) {
            biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
    }

    public void serializeURIs(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.Address.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun."
+"msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttribut"
+"esL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001"
+"Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004n"
+"amet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000#com.sun.m"
+"sv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.da"
+"tatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/"
+"lang/String;L\u0000\btypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XM"
+"LSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProce"
+"ssor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression"
+"$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.St"
+"ringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001expq\u0000"
+"~\u0000\"q\u0000~\u0000!sq\u0000~\u0000\rppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0010xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psq\u0000~\u0000\u0016ppsr\u0000\"com.s"
+"un.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001bq\u0000~\u0000!t\u0000\u0005QNames"
+"r\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000$q\u0000~\u0000\'sq\u0000~\u0000(q\u0000~\u00000q\u0000~\u0000!sr\u0000#com.sun.msv.grammar.Si"
+"mpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000"
+"\u001exr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)htt"
+"p://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.gramma"
+"r.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0013\u0001psq\u0000~\u0000"
+"4t\u0000\taddr_namet\u0000\u0000q\u0000~\u0000:sq\u0000~\u0000\rppsq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u0019sq\u0000~\u0000"
+"\rppsq\u0000~\u0000+q\u0000~\u0000\u0014pq\u0000~\u0000-q\u0000~\u00006q\u0000~\u0000:sq\u0000~\u00004t\u0000\naddr_addr1q\u0000~\u0000>q\u0000~\u0000:s"
+"q\u0000~\u0000\rppsq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u0019sq\u0000~\u0000\rppsq\u0000~\u0000+q\u0000~\u0000\u0014pq\u0000~\u0000-q\u0000"
+"~\u00006q\u0000~\u0000:sq\u0000~\u00004t\u0000\naddr_addr2q\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000\rppsq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq"
+"\u0000~\u0000\u0000ppq\u0000~\u0000\u0019sq\u0000~\u0000\rppsq\u0000~\u0000+q\u0000~\u0000\u0014pq\u0000~\u0000-q\u0000~\u00006q\u0000~\u0000:sq\u0000~\u00004t\u0000\naddr_"
+"addr3q\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000\rppsq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u0019sq\u0000~\u0000\rppsq\u0000"
+"~\u0000+q\u0000~\u0000\u0014pq\u0000~\u0000-q\u0000~\u00006q\u0000~\u0000:sq\u0000~\u00004t\u0000\naddr_addr4q\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000\rp"
+"psq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u0019sq\u0000~\u0000\rppsq\u0000~\u0000+q\u0000~\u0000\u0014pq\u0000~\u0000-q\u0000~\u00006q\u0000~"
+"\u0000:sq\u0000~\u00004t\u0000\naddr_phoneq\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000\rppsq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000pp"
+"q\u0000~\u0000\u0019sq\u0000~\u0000\rppsq\u0000~\u0000+q\u0000~\u0000\u0014pq\u0000~\u0000-q\u0000~\u00006q\u0000~\u0000:sq\u0000~\u00004t\u0000\baddr_faxq\u0000~"
+"\u0000>q\u0000~\u0000:sq\u0000~\u0000\rppsq\u0000~\u0000\u000fq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u0019sq\u0000~\u0000\rppsq\u0000~\u0000+q\u0000~\u0000\u0014"
+"pq\u0000~\u0000-q\u0000~\u00006q\u0000~\u0000:sq\u0000~\u00004t\u0000\naddr_emailq\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000+ppq\u0000~\u0000\u0019sq"
+"\u0000~\u00004t\u0000\u0007versionq\u0000~\u0000>sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Cl"
+"osedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash"
+"\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/"
+"grammar/ExpressionPool;xp\u0000\u0000\u0000 \u0001pq\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000\fq\u0000~\u0000\u000eq\u0000~\u0000?q\u0000~\u0000"
+"Fq\u0000~\u0000Mq\u0000~\u0000Tq\u0000~\u0000[q\u0000~\u0000bq\u0000~\u0000iq\u0000~\u0000\u0007q\u0000~\u0000\nq\u0000~\u0000\tq\u0000~\u0000\u0015q\u0000~\u0000Aq\u0000~\u0000Hq\u0000~\u0000"
+"Oq\u0000~\u0000Vq\u0000~\u0000]q\u0000~\u0000dq\u0000~\u0000kq\u0000~\u0000*q\u0000~\u0000Bq\u0000~\u0000Iq\u0000~\u0000Pq\u0000~\u0000Wq\u0000~\u0000\u000bq\u0000~\u0000^q\u0000~\u0000"
+"eq\u0000~\u0000lq\u0000~\u0000\u0006x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
            super(context, "----------------------------");
        }

        protected Unmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.AddressImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  24 :
                        if (("addr_email" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 25;
                            return ;
                        }
                        state = 27;
                        continue outer;
                    case  9 :
                        if (("addr_addr2" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  21 :
                        if (("addr_fax" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 22;
                            return ;
                        }
                        state = 24;
                        continue outer;
                    case  15 :
                        if (("addr_addr4" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 16;
                            return ;
                        }
                        state = 18;
                        continue outer;
                    case  27 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  18 :
                        if (("addr_phone" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 19;
                            return ;
                        }
                        state = 21;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  12 :
                        if (("addr_addr3" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
                    case  6 :
                        if (("addr_addr1" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        if (("addr_name" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Version = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  8 :
                        if (("addr_addr1" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("addr_name" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  24 :
                        state = 27;
                        continue outer;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  11 :
                        if (("addr_addr2" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  26 :
                        if (("addr_email" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 27;
                            return ;
                        }
                        break;
                    case  21 :
                        state = 24;
                        continue outer;
                    case  23 :
                        if (("addr_fax" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 24;
                            return ;
                        }
                        break;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  27 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  17 :
                        if (("addr_addr4" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 18;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  20 :
                        if (("addr_phone" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 21;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  14 :
                        if (("addr_addr3" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 15;
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  24 :
                        state = 27;
                        continue outer;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  21 :
                        state = 24;
                        continue outer;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  27 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  0 :
                        if (("version" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  24 :
                        state = 27;
                        continue outer;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  21 :
                        state = 24;
                        continue outer;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  27 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  2 :
                        if (("version" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  25 :
                            eatText2(value);
                            state = 26;
                            return ;
                        case  10 :
                            eatText3(value);
                            state = 11;
                            return ;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  24 :
                            state = 27;
                            continue outer;
                        case  9 :
                            state = 12;
                            continue outer;
                        case  7 :
                            eatText4(value);
                            state = 8;
                            return ;
                        case  16 :
                            eatText5(value);
                            state = 17;
                            return ;
                        case  21 :
                            state = 24;
                            continue outer;
                        case  22 :
                            eatText6(value);
                            state = 23;
                            return ;
                        case  4 :
                            eatText7(value);
                            state = 5;
                            return ;
                        case  15 :
                            state = 18;
                            continue outer;
                        case  27 :
                            revertToParentFromText(value);
                            return ;
                        case  13 :
                            eatText8(value);
                            state = 14;
                            return ;
                        case  18 :
                            state = 21;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "version");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  19 :
                            eatText9(value);
                            state = 20;
                            return ;
                        case  12 :
                            state = 15;
                            continue outer;
                        case  6 :
                            state = 9;
                            continue outer;
                        case  3 :
                            state = 6;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrEmail = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrAddr2 = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrAddr1 = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrAddr4 = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrFax = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText7(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrName = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText8(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrAddr3 = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText9(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AddrPhone = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}

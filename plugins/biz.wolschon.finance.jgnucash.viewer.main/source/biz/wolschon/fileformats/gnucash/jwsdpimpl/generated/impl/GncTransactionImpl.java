//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2008.10.09 um 07:36:33 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl;

public class GncTransactionImpl
    extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncTransactionTypeImpl
    implements biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncTransaction, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallableObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializable, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncTransaction.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "gnc_transaction";
    }

    public biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
        return new biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncTransactionImpl.Unmarshaller(context);
    }

    public void serializeBody(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "gnc_transaction");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncTransaction.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom."
+"sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java"
+".lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar."
+"AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~"
+"\u0000\u001bpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u001a\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000c"
+"om.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq"
+"\u0000~\u0000\u0004q\u0000~\u0000 psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\'xq\u0000~\u0000\"t"
+"\u0000Qbiz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncTr"
+"ansactionType.TrnIdTypet\u0000+http://java.sun.com/jaxb/xjc/dummy"
+"-elementssq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpsr\u0000\u001bcom.sun.msv.grammar.DataExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq"
+"\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.s"
+"un.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.data"
+"type.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatyp"
+"e.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XS"
+"DatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\'L\u0000\btypeNameq\u0000~\u0000\'L"
+"\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor"
+";xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.ms"
+"v.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,co"
+"m.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000c"
+"om.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq"
+"\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000\'L\u0000\fnamespaceURIq\u0000~\u0000\'xpq\u0000~\u00008q\u0000~\u00007sq\u0000~\u0000&t\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0006trn_idt\u0000\u0000sq\u0000"
+"~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0017q\u0000~\u0000\u001bpsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u0000\u001f"
+"q\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000Wbiz.wolschon.fileformats.gnucash.jwsdpimp"
+"l.generated.GncTransactionType.TrnCurrencyTypeq\u0000~\u0000*sq\u0000~\u0000\u0015pps"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\ftrn_currencyq\u0000~\u0000Esq\u0000~\u0000\u0015pp"
+"sq\u0000~\u0000\u0000q\u0000~\u0000\u001bp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000-q\u0000~\u0000\u001bpsr\u0000#com.sun.msv.datatype.xs"
+"d.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00002q\u0000~\u00007t\u0000\u0006strings"
+"r\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000:\u0001q\u0000~\u0000=sq\u0000~\u0000>q\u0000~\u0000Xq\u0000~\u00007sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u00000"
+"q\u0000~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0007trn_numq\u0000~\u0000Eq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0017q\u0000~\u0000\u001bpsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000Ybi"
+"z.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncTransa"
+"ctionType.TrnDatePostedTypeq\u0000~\u0000*sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u00000q\u0000~"
+"\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\u000ftrn_date-postedq\u0000~\u0000Esq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0017q\u0000~\u0000\u001bpsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000Zbi"
+"z.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncTransa"
+"ctionType.TrnDateEnteredTypeq\u0000~\u0000*sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u00000q\u0000"
+"~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0010trn_date-enteredq\u0000~\u0000Esq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000U"
+"sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\u000ftrn_descriptionq"
+"\u0000~\u0000Esq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001bp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0017q\u0000~\u0000"
+"\u001bpsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000>biz.wolschon.fileforma"
+"ts.gnucash.jwsdpimpl.generated.SlotsTypeq\u0000~\u0000*sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq"
+"\u0000~\u0000\u001bpq\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\ttrn_slotsq\u0000~\u0000Eq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0017q\u0000~\u0000\u001bpsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000"
+"%sq\u0000~\u0000&t\u0000Ubiz.wolschon.fileformats.gnucash.jwsdpimpl.generat"
+"ed.GncTransactionType.TrnSplitsTypeq\u0000~\u0000*sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bp"
+"q\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\ntrn_splitsq\u0000~\u0000Esq\u0000~\u0000\u001cppq\u0000~\u0000Usq\u0000~\u0000&t\u0000"
+"\u0007versionq\u0000~\u0000Esq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u001bpq\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000%sq\u0000~\u0000&t\u0000\u000fgnc"
+"_transactionq\u0000~\u0000Esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clos"
+"edHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j"
+"\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gr"
+"ammar/ExpressionPool;xp\u0000\u0000\u0000(\u0001pq\u0000~\u0000\u000bq\u0000~\u0000\fq\u0000~\u0000\u0011q\u0000~\u0000\rq\u0000~\u0000+q\u0000~\u0000Nq"
+"\u0000~\u0000\\q\u0000~\u0000hq\u0000~\u0000tq\u0000~\u0000zq\u0000~\u0000\u0087q\u0000~\u0000\u0093q\u0000~\u0000\u009aq\u0000~\u0000\u0016q\u0000~\u0000Iq\u0000~\u0000cq\u0000~\u0000oq\u0000~\u0000\u0082q"
+"\u0000~\u0000\u008eq\u0000~\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000Jq\u0000~\u0000Tq\u0000~\u0000dq\u0000~\u0000pq\u0000~\u0000\u0013q\u0000~\u0000Gq\u0000~\u0000aq\u0000~\u0000mq\u0000~\u0000Rq"
+"\u0000~\u0000yq\u0000~\u0000\u0083q\u0000~\u0000\u0080q\u0000~\u0000\u008fq\u0000~\u0000\u008cq\u0000~\u0000~q\u0000~\u0000\u000fq\u0000~\u0000\nq\u0000~\u0000\u000eq\u0000~\u0000\u0010x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncTransactionImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("gnc_transaction" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("gnc_transaction" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        if (("version" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncTransactionTypeImpl)biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncTransactionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
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
                        case  1 :
                            attIdx = context.getAttribute("", "version");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}

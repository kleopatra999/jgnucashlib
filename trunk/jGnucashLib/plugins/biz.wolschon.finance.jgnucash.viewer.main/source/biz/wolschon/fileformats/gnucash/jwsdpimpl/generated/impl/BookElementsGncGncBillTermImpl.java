//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.05.31 um 04:05:48 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl;

public class BookElementsGncGncBillTermImpl
    extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncGncBillTermTypeImpl
    implements biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.BookElementsGncGncBillTerm, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallableObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializable, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.BookElementsGncGncBillTerm.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "gnc_GncBillTerm";
    }

    public biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
        return new biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.BookElementsGncGncBillTermImpl.Unmarshaller(context);
    }

    public void serializeBody(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "gnc_GncBillTerm");
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
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.BookElementsGncGncBillTerm.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004"
+"sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001x"
+"q\u0000~\u0000\u0004q\u0000~\u0000\u001cpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u001b\u0001psr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000!psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000"
+"(xq\u0000~\u0000#t\u0000Xbiz.wolschon.fileformats.gnucash.jwsdpimpl.generat"
+"ed.GncGncBillTermType.BilltermGuidTypet\u0000+http://java.sun.com"
+"/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpsr\u0000\u001bcom.sun.msv."
+"grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Data"
+"type;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq"
+"\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*c"
+"om.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com."
+"sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv."
+"datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000(L\u0000"
+"\btypeNameq\u0000~\u0000(L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Whit"
+"eSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNam"
+"esr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000(L\u0000\fnamespaceURIq\u0000~\u0000(xpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\'t\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000&sq\u0000~\u0000\'"
+"t\u0000\rbillterm_guidt\u0000\u0000sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000.ppsr\u0000\'com.sun.msv."
+"datatype.xsd.MinLengthFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\tminLengthxr\u00009com.su"
+"n.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002"
+"\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z"
+"\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/ms"
+"v/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv"
+"/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000(xq\u0000~\u00005q\u0000~\u0000Fpsr\u00005"
+"com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000;\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00003q\u0000~\u00008t\u0000\u0006stringq\u0000~\u0000Q\u0001q\u0000~\u0000St\u0000\tminLengt"
+"h\u0000\u0000\u0000\u0001q\u0000~\u0000>sq\u0000~\u0000?t\u0000\u000estring-derivedq\u0000~\u0000Fsq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000"
+"~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rbillterm_nameq\u0000~\u0000Fsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000"
+"~\u0000.q\u0000~\u0000\u001cpq\u0000~\u0000Sq\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000Tq\u0000~\u00008sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001"
+"q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rbillterm_descq\u0000~\u0000Fsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000."
+"ppsr\u0000 com.sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun"
+".msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacets"
+"q\u0000~\u0000Mxq\u0000~\u00003q\u0000~\u00008t\u0000\u0003intq\u0000~\u0000<sr\u0000*com.sun.msv.datatype.xsd.MaxI"
+"nclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFa"
+"cet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xq\u0000~\u0000Kppq\u0000~\u0000"
+"<\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000lppq\u0000~\u0000<\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000hq\u0000~\u00008t\u0000\u0004longq\u0000~\u0000<sq\u0000~\u0000kppq\u0000~\u0000<\u0000\u0001sq\u0000~\u0000oppq\u0000~\u0000<\u0000\u0000sr\u0000$"
+"com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000hq\u0000~\u00008t\u0000"
+"\u0007integerq\u0000~\u0000<sr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFace"
+"t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWit"
+"hLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000Lppq\u0000~\u0000<\u0001\u0000sr\u0000#com.sun"
+".msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t\u0000\u0007decimal"
+"q\u0000~\u0000<q\u0000~\u0000}t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000wt\u0000\fminInclusivesr\u0000\u000ejava."
+"lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000x"
+"p\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000wt\u0000\fmaxInclusivesq\u0000~\u0000\u0081\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000rq\u0000~\u0000\u0080sr\u0000\u0011jav"
+"a.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000\u0082\u0080\u0000\u0000\u0000q\u0000~\u0000rq\u0000~\u0000\u0084sq\u0000~\u0000\u0086\u007f"
+"\u00ff\u00ff\u00ffq\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000jq\u0000~\u00008sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&s"
+"q\u0000~\u0000\'t\u0000\u0011billterm_refcountq\u0000~\u0000Fsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000fsq\u0000~\u0000\u0016pp"
+"sq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u0012billterm_invisibleq\u0000~\u0000Fs"
+"q\u0000~\u0000\u0016ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0018q\u0000~\u0000\u001cpsq\u0000"
+"~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000Zbiz.wolschon.fileformats.gn"
+"ucash.jwsdpimpl.generated.GncGncBillTermType.BilltermParentT"
+"ypeq\u0000~\u0000+sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u000fbillterm"
+"_parentq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0018q\u0000~\u0000\u001cpsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0018q\u0000~\u0000\u001cpsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'"
+"t\u0000Ybiz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncG"
+"ncBillTermType.BilltermChildTypeq\u0000~\u0000+sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~"
+"\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u000ebillterm_childq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0000q"
+"\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0018q\u0000~\u0000\u001cpsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 "
+"q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000Xbiz.wolschon.fileformats.gnucash.jwsdpimp"
+"l.generated.GncGncBillTermType.BilltermDaysTypeq\u0000~\u0000+sq\u0000~\u0000\u0016pp"
+"sq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rbillterm_daysq\u0000~\u0000Fq\u0000~\u0000&s"
+"q\u0000~\u0000\u0016ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0018q\u0000~\u0000\u001cpsq\u0000"
+"~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000[biz.wolschon.fileformats.gn"
+"ucash.jwsdpimpl.generated.GncGncBillTermType.BilltermProximo"
+"Typeq\u0000~\u0000+sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u0010billter"
+"m_proximoq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u001dppq\u0000~\u0000^sq\u0000~\u0000\'t\u0000\u0007versionq\u0000~\u0000Fsq\u0000~\u0000\u0016p"
+"psq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u000fgnc_GncBillTermq\u0000~\u0000Fsr\u0000"
+"\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/"
+"Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun"
+".msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\r"
+"streamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool"
+";xp\u0000\u0000\u0000,\u0001pq\u0000~\u0000\u00a1q\u0000~\u0000]q\u0000~\u0000\u001aq\u0000~\u0000\u0099q\u0000~\u0000\u00a7q\u0000~\u0000\u00b4q\u0000~\u0000\u00c1q\u0000~\u0000,q\u0000~\u0000Xq\u0000~\u0000`q"
+"\u0000~\u0000\u008aq\u0000~\u0000\u0090q\u0000~\u0000\u009dq\u0000~\u0000\u00abq\u0000~\u0000\u00b8q\u0000~\u0000\u00c5q\u0000~\u0000\u00ccq\u0000~\u0000\u000eq\u0000~\u0000\u0094q\u0000~\u0000\u00afq\u0000~\u0000\u00bcq\u0000~\u0000\u00a2q"
+"\u0000~\u0000\u000bq\u0000~\u0000\u0014q\u0000~\u0000\u0096q\u0000~\u0000\u00a4q\u0000~\u0000\u00b1q\u0000~\u0000\u00beq\u0000~\u0000\rq\u0000~\u0000\u000fq\u0000~\u0000eq\u0000~\u0000\u008fq\u0000~\u0000\nq\u0000~\u0000\fq"
+"\u0000~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000\u0012q\u0000~\u0000Hq\u0000~\u0000\u0017q\u0000~\u0000\u0011q\u0000~\u0000\u0098q\u0000~\u0000\u00a6q\u0000~\u0000\u00b3q\u0000~\u0000\u00c0x"));
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
            return biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.BookElementsGncGncBillTermImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("gnc_GncBillTerm" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("gnc_GncBillTerm" == ___local)&&("" == ___uri)) {
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("version" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncGncBillTermTypeImpl)biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.BookElementsGncGncBillTermImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "version");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}

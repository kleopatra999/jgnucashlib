//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.01.03 um 05:56:28 CET 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl;

public class GncAccountImpl
    extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncAccountTypeImpl
    implements biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccount, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallableObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializable, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccount.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "gnc_account";
    }

    public biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
        return new biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncAccountImpl.Unmarshaller(context);
    }

    public void serializeBody(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "gnc_account");
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
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncAccount.class);
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
+"\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000"
+"~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004sr\u0000\u0011java.lan"
+"g.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000#com.sun.msv.datatype.xsd"
+".StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.dataty"
+"pe.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype."
+"xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDa"
+"tatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\b"
+"typeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/White"
+"SpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006strin"
+"gsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpress"
+"ion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d"
+"\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u0000%q\u0000~\u0000$sr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv"
+".grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001"
+"xq\u0000~\u0000\u0004q\u0000~\u0000\u001cpsq\u0000~\u0000\u0017ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\'q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u00004q\u0000"
+"~\u0000$sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xr\u0000\u001dcom.sun.msv.grammar.NameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-i"
+"nstancesr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u001b\u0001psq\u0000~\u00008t\u0000\bact_namet\u0000\u0000sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000-ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003x"
+"q\u0000~\u0000\u0004q\u0000~\u0000\u001cpsq\u0000~\u0000/q\u0000~\u0000\u001cpsr\u00002com.sun.msv.grammar.Expression$An"
+"yStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000?psr\u0000 com.sun.msv.gram"
+"mar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00009q\u0000~\u0000>sq\u0000~\u00008t\u0000Mbiz.wolschon."
+"fileformats.gnucash.jwsdpimpl.generated.GncAccountType.ActId"
+"Typet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000-ppsq"
+"\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\u0006act_idq\u0000~\u0000Bsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007"
+"ppsq\u0000~\u0000\u0017ppsr\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xs"
+"d.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv"
+".datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012"
+"needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XS"
+"DatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Con"
+"creteType;L\u0000\tfacetNameq\u0000~\u0000!xq\u0000~\u0000 q\u0000~\u0000Bpq\u0000~\u0000(\u0000\u0000q\u0000~\u0000#q\u0000~\u0000#t\u0000\u000be"
+"numerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u000bt\u0000"
+"\u0004BANKt\u0000\u0006CREDITt\u0000\u0005ASSETt\u0000\tLIABILITYt\u0000\u0007EXPENSEt\u0000\u0006EQUITYt\u0000\nRECE"
+"IVABLEt\u0000\u0005STOCKt\u0000\u0006MUTUALt\u0000\u0004CASHt\u0000\u0006INCOMExq\u0000~\u0000*sq\u0000~\u0000+t\u0000\u000estring"
+"-derivedq\u0000~\u0000Bsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\bact"
+"_typeq\u0000~\u0000Bsq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000-ppsq\u0000~"
+"\u0000Gq\u0000~\u0000\u001cpsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u0000Lq\u0000~\u0000Nq\u0000~\u0000>sq\u0000~\u00008t\u0000Tbiz.wolschon.fil"
+"eformats.gnucash.jwsdpimpl.generated.GncAccountType.ActCommo"
+"dityTypeq\u0000~\u0000Qsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\ract"
+"_commodityq\u0000~\u0000Bq\u0000~\u0000>sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0017ppsq\u0000"
+"~\u0000Yq\u0000~\u0000Bpq\u0000~\u00006\u0000\u0000sr\u0000 com.sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000"
+"\u0001L\u0000\nbaseFacetsq\u0000~\u0000]xq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\u0003intq\u0000~\u00006sr\u0000*com.sun.msv.dat"
+"atype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.dataty"
+"pe.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Objec"
+"t;xq\u0000~\u0000[ppq\u0000~\u00006\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFa"
+"cet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u008bppq\u0000~\u00006\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.Lo"
+"ngType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0087q\u0000~\u0000$t\u0000\u0004longq\u0000~\u00006sq\u0000~\u0000\u008appq\u0000~\u00006\u0000\u0001sq\u0000~\u0000"
+"\u008eppq\u0000~\u00006\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0087q\u0000~\u0000$t\u0000\u0007integerq\u0000~\u00006sr\u0000,com.sun.msv.datatype.xsd.Frac"
+"tionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.x"
+"sd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000\\ppq\u0000~\u0000"
+"6\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq"
+"\u0000~\u0000$t\u0000\u0007decimalq\u0000~\u00006q\u0000~\u0000\u009ct\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000\u0096t\u0000\fminIncl"
+"usivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Numb"
+"er\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0096t\u0000\fmaxInclusivesq\u0000~\u0000\u00a0\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~"
+"\u0000\u0091q\u0000~\u0000\u009fsr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000\u00a1\u0080\u0000\u0000\u0000q\u0000~"
+"\u0000\u0091q\u0000~\u0000\u00a3sq\u0000~\u0000\u00a5\u007f\u00ff\u00ff\u00ffq\u0000~\u0000\u0088q\u0000~\u0000`sq\u0000~\u0000aw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0007sq\u0000~\u0000\u00a5\u0000\u0000\u0003\u00e8sq\u0000"
+"~\u0000\u00a5\u0000\u0000\u0000\u0001sq\u0000~\u0000\u00a5\u0000\u0000\u0000dsq\u0000~\u0000\u00a5\u0000\u000fB@sq\u0000~\u0000\u00a5\u0000\u0000\'\u0010sq\u0000~\u0000\u00a5\u0000\u0098\u0096\u0080sq\u0000~\u0000\u00a5\u0000\u0001\u0086\u00a0xq\u0000"
+"~\u0000*sq\u0000~\u0000+t\u0000\u000bint-derivedq\u0000~\u0000Bsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000"
+"~\u0000>sq\u0000~\u00008t\u0000\u0011act_commodity-scuq\u0000~\u0000Bq\u0000~\u0000>sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000"
+"sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000-ppsq\u0000~\u0000Gq\u0000~\u0000\u001cpsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u0000Lq\u0000~\u0000Nq"
+"\u0000~\u0000>sq\u0000~\u00008t\u0000Ybiz.wolschon.fileformats.gnucash.jwsdpimpl.gene"
+"rated.GncAccountType.ActNonStandardScuTypeq\u0000~\u0000Qsq\u0000~\u0000-ppsq\u0000~\u0000"
+"/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\u0014act_non-standard-scuq\u0000~\u0000Bq\u0000~\u0000"
+">sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000\u001asq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001"
+"q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\bact_codeq\u0000~\u0000Bq\u0000~\u0000>sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq"
+"\u0000~\u0000\u0007ppq\u0000~\u0000\u001asq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\u000fact_d"
+"escriptionq\u0000~\u0000Bq\u0000~\u0000>sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq"
+"\u0000~\u0000-ppsq\u0000~\u0000Gq\u0000~\u0000\u001cpsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u0000Lq\u0000~\u0000Nq\u0000~\u0000>sq\u0000~\u00008t\u0000>biz.wo"
+"lschon.fileformats.gnucash.jwsdpimpl.generated.SlotsTypeq\u0000~\u0000"
+"Qsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\tact_slotsq\u0000~\u0000Bq"
+"\u0000~\u0000>sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000-ppsq\u0000~\u0000Gq\u0000~\u0000"
+"\u001cpsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u0000Lq\u0000~\u0000Nq\u0000~\u0000>sq\u0000~\u00008t\u0000Qbiz.wolschon.fileforma"
+"ts.gnucash.jwsdpimpl.generated.GncAccountType.ActParentTypeq"
+"\u0000~\u0000Qsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\nact_parentq\u0000"
+"~\u0000Bq\u0000~\u0000>sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001cp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000-ppsq\u0000~\u0000G"
+"q\u0000~\u0000\u001cpsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u0000Lq\u0000~\u0000Nq\u0000~\u0000>sq\u0000~\u00008t\u0000Obiz.wolschon.filef"
+"ormats.gnucash.jwsdpimpl.generated.GncAccountType.ActLotsTyp"
+"eq\u0000~\u0000Qsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\bact_lotsq\u0000"
+"~\u0000Bq\u0000~\u0000>sq\u0000~\u0000/ppq\u0000~\u0000\u001asq\u0000~\u00008t\u0000\u0007versionq\u0000~\u0000Bsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u0000"
+"\u001cpq\u0000~\u00001q\u0000~\u0000:q\u0000~\u0000>sq\u0000~\u00008t\u0000\u000bgnc_accountq\u0000~\u0000Bsr\u0000\"com.sun.msv.gr"
+"ammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gr"
+"ammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Ex"
+"pressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000"
+"\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u00007\u0001pq\u0000~\u0000\u000eq"
+"\u0000~\u0000\u0012q\u0000~\u0000\u000fq\u0000~\u0000Wq\u0000~\u0000\u0010q\u0000~\u0000\u0083q\u0000~\u0000\u0013q\u0000~\u0000\u0011q\u0000~\u0000\fq\u0000~\u0000.q\u0000~\u0000Rq\u0000~\u0000pq\u0000~\u0000}q"
+"\u0000~\u0000\u00b2q\u0000~\u0000\u00bfq\u0000~\u0000\u0081q\u0000~\u0000\u00c6q\u0000~\u0000\u00cdq\u0000~\u0000\u00daq\u0000~\u0000\u00e7q\u0000~\u0000\u00f4q\u0000~\u0000\u0014q\u0000~\u0000\u00fbq\u0000~\u0000\u0016q\u0000~\u0000\u00c5q"
+"\u0000~\u0000\u00ccq\u0000~\u0000Dq\u0000~\u0000vq\u0000~\u0000\u00b8q\u0000~\u0000\u00d3q\u0000~\u0000\u00e0q\u0000~\u0000\u00edq\u0000~\u0000\nq\u0000~\u0000Fq\u0000~\u0000xq\u0000~\u0000\u00baq\u0000~\u0000\u00d5q"
+"\u0000~\u0000\u00e2q\u0000~\u0000\u00efq\u0000~\u0000\u000bq\u0000~\u0000tq\u0000~\u0000\u00b6q\u0000~\u0000\u00d1q\u0000~\u0000\rq\u0000~\u0000\u00deq\u0000~\u0000\u00ebq\u0000~\u0000Iq\u0000~\u0000yq\u0000~\u0000\u00bbq"
+"\u0000~\u0000\u00d6q\u0000~\u0000\u00e3q\u0000~\u0000\u00f0q\u0000~\u0000\tq\u0000~\u0000\u00c3q\u0000~\u0000\u00cax"));
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
            return biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncAccountImpl.this;
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
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("gnc_account" == ___local)&&("" == ___uri)) {
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
                        if (("gnc_account" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                            spawnHandlerFromEnterAttribute((((biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncAccountTypeImpl)biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncAccountImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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

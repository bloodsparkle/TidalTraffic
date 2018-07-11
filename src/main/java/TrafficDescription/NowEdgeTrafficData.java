package TrafficDescription;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-06-11")
public class NowEdgeTrafficData implements org.apache.thrift.TBase<NowEdgeTrafficData, NowEdgeTrafficData._Fields>, java.io.Serializable, Cloneable, Comparable<NowEdgeTrafficData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TrafficDescription.NowEdgeTrafficData");

  private static final org.apache.thrift.protocol.TField NODE_SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeSequence", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TIME_OF_HOUR_FIELD_DESC = new org.apache.thrift.protocol.TField("timeOfHour", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField NOW_EDGE_TRAFFIC_FIELD_DESC = new org.apache.thrift.protocol.TField("nowEdgeTraffic", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NowEdgeTrafficDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NowEdgeTrafficDataTupleSchemeFactory();

  public java.util.List<java.lang.Double> nodeSequence; // required
  public double timeOfHour; // required
  public java.util.List<java.lang.Double> nowEdgeTraffic; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_SEQUENCE((short)1, "nodeSequence"),
    TIME_OF_HOUR((short)2, "timeOfHour"),
    NOW_EDGE_TRAFFIC((short)3, "nowEdgeTraffic");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NODE_SEQUENCE
          return NODE_SEQUENCE;
        case 2: // TIME_OF_HOUR
          return TIME_OF_HOUR;
        case 3: // NOW_EDGE_TRAFFIC
          return NOW_EDGE_TRAFFIC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMEOFHOUR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("nodeSequence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.TIME_OF_HOUR, new org.apache.thrift.meta_data.FieldMetaData("timeOfHour", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.NOW_EDGE_TRAFFIC, new org.apache.thrift.meta_data.FieldMetaData("nowEdgeTraffic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NowEdgeTrafficData.class, metaDataMap);
  }

  public NowEdgeTrafficData() {
  }

  public NowEdgeTrafficData(
    java.util.List<java.lang.Double> nodeSequence,
    double timeOfHour,
    java.util.List<java.lang.Double> nowEdgeTraffic)
  {
    this();
    this.nodeSequence = nodeSequence;
    this.timeOfHour = timeOfHour;
    setTimeOfHourIsSet(true);
    this.nowEdgeTraffic = nowEdgeTraffic;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NowEdgeTrafficData(NowEdgeTrafficData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNodeSequence()) {
      java.util.List<java.lang.Double> __this__nodeSequence = new java.util.ArrayList<java.lang.Double>(other.nodeSequence);
      this.nodeSequence = __this__nodeSequence;
    }
    this.timeOfHour = other.timeOfHour;
    if (other.isSetNowEdgeTraffic()) {
      java.util.List<java.lang.Double> __this__nowEdgeTraffic = new java.util.ArrayList<java.lang.Double>(other.nowEdgeTraffic);
      this.nowEdgeTraffic = __this__nowEdgeTraffic;
    }
  }

  public NowEdgeTrafficData deepCopy() {
    return new NowEdgeTrafficData(this);
  }

  @Override
  public void clear() {
    this.nodeSequence = null;
    setTimeOfHourIsSet(false);
    this.timeOfHour = 0.0;
    this.nowEdgeTraffic = null;
  }

  public int getNodeSequenceSize() {
    return (this.nodeSequence == null) ? 0 : this.nodeSequence.size();
  }

  public java.util.Iterator<java.lang.Double> getNodeSequenceIterator() {
    return (this.nodeSequence == null) ? null : this.nodeSequence.iterator();
  }

  public void addToNodeSequence(double elem) {
    if (this.nodeSequence == null) {
      this.nodeSequence = new java.util.ArrayList<java.lang.Double>();
    }
    this.nodeSequence.add(elem);
  }

  public java.util.List<java.lang.Double> getNodeSequence() {
    return this.nodeSequence;
  }

  public NowEdgeTrafficData setNodeSequence(java.util.List<java.lang.Double> nodeSequence) {
    this.nodeSequence = nodeSequence;
    return this;
  }

  public void unsetNodeSequence() {
    this.nodeSequence = null;
  }

  /** Returns true if field nodeSequence is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeSequence() {
    return this.nodeSequence != null;
  }

  public void setNodeSequenceIsSet(boolean value) {
    if (!value) {
      this.nodeSequence = null;
    }
  }

  public double getTimeOfHour() {
    return this.timeOfHour;
  }

  public NowEdgeTrafficData setTimeOfHour(double timeOfHour) {
    this.timeOfHour = timeOfHour;
    setTimeOfHourIsSet(true);
    return this;
  }

  public void unsetTimeOfHour() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMEOFHOUR_ISSET_ID);
  }

  /** Returns true if field timeOfHour is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeOfHour() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMEOFHOUR_ISSET_ID);
  }

  public void setTimeOfHourIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMEOFHOUR_ISSET_ID, value);
  }

  public int getNowEdgeTrafficSize() {
    return (this.nowEdgeTraffic == null) ? 0 : this.nowEdgeTraffic.size();
  }

  public java.util.Iterator<java.lang.Double> getNowEdgeTrafficIterator() {
    return (this.nowEdgeTraffic == null) ? null : this.nowEdgeTraffic.iterator();
  }

  public void addToNowEdgeTraffic(double elem) {
    if (this.nowEdgeTraffic == null) {
      this.nowEdgeTraffic = new java.util.ArrayList<java.lang.Double>();
    }
    this.nowEdgeTraffic.add(elem);
  }

  public java.util.List<java.lang.Double> getNowEdgeTraffic() {
    return this.nowEdgeTraffic;
  }

  public NowEdgeTrafficData setNowEdgeTraffic(java.util.List<java.lang.Double> nowEdgeTraffic) {
    this.nowEdgeTraffic = nowEdgeTraffic;
    return this;
  }

  public void unsetNowEdgeTraffic() {
    this.nowEdgeTraffic = null;
  }

  /** Returns true if field nowEdgeTraffic is set (has been assigned a value) and false otherwise */
  public boolean isSetNowEdgeTraffic() {
    return this.nowEdgeTraffic != null;
  }

  public void setNowEdgeTrafficIsSet(boolean value) {
    if (!value) {
      this.nowEdgeTraffic = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NODE_SEQUENCE:
      if (value == null) {
        unsetNodeSequence();
      } else {
        setNodeSequence((java.util.List<java.lang.Double>)value);
      }
      break;

    case TIME_OF_HOUR:
      if (value == null) {
        unsetTimeOfHour();
      } else {
        setTimeOfHour((java.lang.Double)value);
      }
      break;

    case NOW_EDGE_TRAFFIC:
      if (value == null) {
        unsetNowEdgeTraffic();
      } else {
        setNowEdgeTraffic((java.util.List<java.lang.Double>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_SEQUENCE:
      return getNodeSequence();

    case TIME_OF_HOUR:
      return getTimeOfHour();

    case NOW_EDGE_TRAFFIC:
      return getNowEdgeTraffic();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NODE_SEQUENCE:
      return isSetNodeSequence();
    case TIME_OF_HOUR:
      return isSetTimeOfHour();
    case NOW_EDGE_TRAFFIC:
      return isSetNowEdgeTraffic();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof NowEdgeTrafficData)
      return this.equals((NowEdgeTrafficData)that);
    return false;
  }

  public boolean equals(NowEdgeTrafficData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nodeSequence = true && this.isSetNodeSequence();
    boolean that_present_nodeSequence = true && that.isSetNodeSequence();
    if (this_present_nodeSequence || that_present_nodeSequence) {
      if (!(this_present_nodeSequence && that_present_nodeSequence))
        return false;
      if (!this.nodeSequence.equals(that.nodeSequence))
        return false;
    }

    boolean this_present_timeOfHour = true;
    boolean that_present_timeOfHour = true;
    if (this_present_timeOfHour || that_present_timeOfHour) {
      if (!(this_present_timeOfHour && that_present_timeOfHour))
        return false;
      if (this.timeOfHour != that.timeOfHour)
        return false;
    }

    boolean this_present_nowEdgeTraffic = true && this.isSetNowEdgeTraffic();
    boolean that_present_nowEdgeTraffic = true && that.isSetNowEdgeTraffic();
    if (this_present_nowEdgeTraffic || that_present_nowEdgeTraffic) {
      if (!(this_present_nowEdgeTraffic && that_present_nowEdgeTraffic))
        return false;
      if (!this.nowEdgeTraffic.equals(that.nowEdgeTraffic))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNodeSequence()) ? 131071 : 524287);
    if (isSetNodeSequence())
      hashCode = hashCode * 8191 + nodeSequence.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timeOfHour);

    hashCode = hashCode * 8191 + ((isSetNowEdgeTraffic()) ? 131071 : 524287);
    if (isSetNowEdgeTraffic())
      hashCode = hashCode * 8191 + nowEdgeTraffic.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NowEdgeTrafficData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNodeSequence()).compareTo(other.isSetNodeSequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeSequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeSequence, other.nodeSequence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimeOfHour()).compareTo(other.isSetTimeOfHour());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeOfHour()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeOfHour, other.timeOfHour);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNowEdgeTraffic()).compareTo(other.isSetNowEdgeTraffic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNowEdgeTraffic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nowEdgeTraffic, other.nowEdgeTraffic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TrafficDescription.NowEdgeTrafficData(");
    boolean first = true;

    sb.append("nodeSequence:");
    if (this.nodeSequence == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeSequence);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeOfHour:");
    sb.append(this.timeOfHour);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nowEdgeTraffic:");
    if (this.nowEdgeTraffic == null) {
      sb.append("null");
    } else {
      sb.append(this.nowEdgeTraffic);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NowEdgeTrafficDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NowEdgeTrafficDataStandardScheme getScheme() {
      return new NowEdgeTrafficDataStandardScheme();
    }
  }

  private static class NowEdgeTrafficDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<NowEdgeTrafficData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NowEdgeTrafficData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.nodeSequence = new java.util.ArrayList<java.lang.Double>(_list16.size);
                double _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readDouble();
                  struct.nodeSequence.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setNodeSequenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIME_OF_HOUR
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.timeOfHour = iprot.readDouble();
              struct.setTimeOfHourIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOW_EDGE_TRAFFIC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.nowEdgeTraffic = new java.util.ArrayList<java.lang.Double>(_list19.size);
                double _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = iprot.readDouble();
                  struct.nowEdgeTraffic.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setNowEdgeTrafficIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NowEdgeTrafficData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeSequence != null) {
        oprot.writeFieldBegin(NODE_SEQUENCE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.nodeSequence.size()));
          for (double _iter22 : struct.nodeSequence)
          {
            oprot.writeDouble(_iter22);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_OF_HOUR_FIELD_DESC);
      oprot.writeDouble(struct.timeOfHour);
      oprot.writeFieldEnd();
      if (struct.nowEdgeTraffic != null) {
        oprot.writeFieldBegin(NOW_EDGE_TRAFFIC_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.nowEdgeTraffic.size()));
          for (double _iter23 : struct.nowEdgeTraffic)
          {
            oprot.writeDouble(_iter23);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NowEdgeTrafficDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NowEdgeTrafficDataTupleScheme getScheme() {
      return new NowEdgeTrafficDataTupleScheme();
    }
  }

  private static class NowEdgeTrafficDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<NowEdgeTrafficData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NowEdgeTrafficData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNodeSequence()) {
        optionals.set(0);
      }
      if (struct.isSetTimeOfHour()) {
        optionals.set(1);
      }
      if (struct.isSetNowEdgeTraffic()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNodeSequence()) {
        {
          oprot.writeI32(struct.nodeSequence.size());
          for (double _iter24 : struct.nodeSequence)
          {
            oprot.writeDouble(_iter24);
          }
        }
      }
      if (struct.isSetTimeOfHour()) {
        oprot.writeDouble(struct.timeOfHour);
      }
      if (struct.isSetNowEdgeTraffic()) {
        {
          oprot.writeI32(struct.nowEdgeTraffic.size());
          for (double _iter25 : struct.nowEdgeTraffic)
          {
            oprot.writeDouble(_iter25);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NowEdgeTrafficData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.nodeSequence = new java.util.ArrayList<java.lang.Double>(_list26.size);
          double _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            _elem27 = iprot.readDouble();
            struct.nodeSequence.add(_elem27);
          }
        }
        struct.setNodeSequenceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timeOfHour = iprot.readDouble();
        struct.setTimeOfHourIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.nowEdgeTraffic = new java.util.ArrayList<java.lang.Double>(_list29.size);
          double _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readDouble();
            struct.nowEdgeTraffic.add(_elem30);
          }
        }
        struct.setNowEdgeTrafficIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


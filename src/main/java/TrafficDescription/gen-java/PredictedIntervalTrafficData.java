/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-05-02")
public class PredictedIntervalTrafficData implements org.apache.thrift.TBase<PredictedIntervalTrafficData, PredictedIntervalTrafficData._Fields>, java.io.Serializable, Cloneable, Comparable<PredictedIntervalTrafficData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PredictedIntervalTrafficData");

  private static final org.apache.thrift.protocol.TField MIGRATION_FIELD_DESC = new org.apache.thrift.protocol.TField("migration", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField PREDICTED_INTERVAL_TRAFFIC_FIELD_DESC = new org.apache.thrift.protocol.TField("predictedIntervalTraffic", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PredictedIntervalTrafficDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PredictedIntervalTrafficDataTupleSchemeFactory();

  public double migration; // required
  public java.util.List<java.lang.Double> predictedIntervalTraffic; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MIGRATION((short)1, "migration"),
    PREDICTED_INTERVAL_TRAFFIC((short)2, "predictedIntervalTraffic");

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
        case 1: // MIGRATION
          return MIGRATION;
        case 2: // PREDICTED_INTERVAL_TRAFFIC
          return PREDICTED_INTERVAL_TRAFFIC;
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
  private static final int __MIGRATION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MIGRATION, new org.apache.thrift.meta_data.FieldMetaData("migration", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PREDICTED_INTERVAL_TRAFFIC, new org.apache.thrift.meta_data.FieldMetaData("predictedIntervalTraffic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PredictedIntervalTrafficData.class, metaDataMap);
  }

  public PredictedIntervalTrafficData() {
  }

  public PredictedIntervalTrafficData(
    double migration,
    java.util.List<java.lang.Double> predictedIntervalTraffic)
  {
    this();
    this.migration = migration;
    setMigrationIsSet(true);
    this.predictedIntervalTraffic = predictedIntervalTraffic;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PredictedIntervalTrafficData(PredictedIntervalTrafficData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.migration = other.migration;
    if (other.isSetPredictedIntervalTraffic()) {
      java.util.List<java.lang.Double> __this__predictedIntervalTraffic = new java.util.ArrayList<java.lang.Double>(other.predictedIntervalTraffic);
      this.predictedIntervalTraffic = __this__predictedIntervalTraffic;
    }
  }

  public PredictedIntervalTrafficData deepCopy() {
    return new PredictedIntervalTrafficData(this);
  }

  @Override
  public void clear() {
    setMigrationIsSet(false);
    this.migration = 0.0;
    this.predictedIntervalTraffic = null;
  }

  public double getMigration() {
    return this.migration;
  }

  public PredictedIntervalTrafficData setMigration(double migration) {
    this.migration = migration;
    setMigrationIsSet(true);
    return this;
  }

  public void unsetMigration() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIGRATION_ISSET_ID);
  }

  /** Returns true if field migration is set (has been assigned a value) and false otherwise */
  public boolean isSetMigration() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIGRATION_ISSET_ID);
  }

  public void setMigrationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIGRATION_ISSET_ID, value);
  }

  public int getPredictedIntervalTrafficSize() {
    return (this.predictedIntervalTraffic == null) ? 0 : this.predictedIntervalTraffic.size();
  }

  public java.util.Iterator<java.lang.Double> getPredictedIntervalTrafficIterator() {
    return (this.predictedIntervalTraffic == null) ? null : this.predictedIntervalTraffic.iterator();
  }

  public void addToPredictedIntervalTraffic(double elem) {
    if (this.predictedIntervalTraffic == null) {
      this.predictedIntervalTraffic = new java.util.ArrayList<java.lang.Double>();
    }
    this.predictedIntervalTraffic.add(elem);
  }

  public java.util.List<java.lang.Double> getPredictedIntervalTraffic() {
    return this.predictedIntervalTraffic;
  }

  public PredictedIntervalTrafficData setPredictedIntervalTraffic(java.util.List<java.lang.Double> predictedIntervalTraffic) {
    this.predictedIntervalTraffic = predictedIntervalTraffic;
    return this;
  }

  public void unsetPredictedIntervalTraffic() {
    this.predictedIntervalTraffic = null;
  }

  /** Returns true if field predictedIntervalTraffic is set (has been assigned a value) and false otherwise */
  public boolean isSetPredictedIntervalTraffic() {
    return this.predictedIntervalTraffic != null;
  }

  public void setPredictedIntervalTrafficIsSet(boolean value) {
    if (!value) {
      this.predictedIntervalTraffic = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MIGRATION:
      if (value == null) {
        unsetMigration();
      } else {
        setMigration((java.lang.Double)value);
      }
      break;

    case PREDICTED_INTERVAL_TRAFFIC:
      if (value == null) {
        unsetPredictedIntervalTraffic();
      } else {
        setPredictedIntervalTraffic((java.util.List<java.lang.Double>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MIGRATION:
      return getMigration();

    case PREDICTED_INTERVAL_TRAFFIC:
      return getPredictedIntervalTraffic();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MIGRATION:
      return isSetMigration();
    case PREDICTED_INTERVAL_TRAFFIC:
      return isSetPredictedIntervalTraffic();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PredictedIntervalTrafficData)
      return this.equals((PredictedIntervalTrafficData)that);
    return false;
  }

  public boolean equals(PredictedIntervalTrafficData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_migration = true;
    boolean that_present_migration = true;
    if (this_present_migration || that_present_migration) {
      if (!(this_present_migration && that_present_migration))
        return false;
      if (this.migration != that.migration)
        return false;
    }

    boolean this_present_predictedIntervalTraffic = true && this.isSetPredictedIntervalTraffic();
    boolean that_present_predictedIntervalTraffic = true && that.isSetPredictedIntervalTraffic();
    if (this_present_predictedIntervalTraffic || that_present_predictedIntervalTraffic) {
      if (!(this_present_predictedIntervalTraffic && that_present_predictedIntervalTraffic))
        return false;
      if (!this.predictedIntervalTraffic.equals(that.predictedIntervalTraffic))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(migration);

    hashCode = hashCode * 8191 + ((isSetPredictedIntervalTraffic()) ? 131071 : 524287);
    if (isSetPredictedIntervalTraffic())
      hashCode = hashCode * 8191 + predictedIntervalTraffic.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PredictedIntervalTrafficData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMigration()).compareTo(other.isSetMigration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMigration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.migration, other.migration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPredictedIntervalTraffic()).compareTo(other.isSetPredictedIntervalTraffic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPredictedIntervalTraffic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.predictedIntervalTraffic, other.predictedIntervalTraffic);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PredictedIntervalTrafficData(");
    boolean first = true;

    sb.append("migration:");
    sb.append(this.migration);
    first = false;
    if (!first) sb.append(", ");
    sb.append("predictedIntervalTraffic:");
    if (this.predictedIntervalTraffic == null) {
      sb.append("null");
    } else {
      sb.append(this.predictedIntervalTraffic);
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

  private static class PredictedIntervalTrafficDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PredictedIntervalTrafficDataStandardScheme getScheme() {
      return new PredictedIntervalTrafficDataStandardScheme();
    }
  }

  private static class PredictedIntervalTrafficDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<PredictedIntervalTrafficData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PredictedIntervalTrafficData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MIGRATION
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.migration = iprot.readDouble();
              struct.setMigrationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PREDICTED_INTERVAL_TRAFFIC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.predictedIntervalTraffic = new java.util.ArrayList<java.lang.Double>(_list8.size);
                double _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readDouble();
                  struct.predictedIntervalTraffic.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setPredictedIntervalTrafficIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PredictedIntervalTrafficData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MIGRATION_FIELD_DESC);
      oprot.writeDouble(struct.migration);
      oprot.writeFieldEnd();
      if (struct.predictedIntervalTraffic != null) {
        oprot.writeFieldBegin(PREDICTED_INTERVAL_TRAFFIC_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.predictedIntervalTraffic.size()));
          for (double _iter11 : struct.predictedIntervalTraffic)
          {
            oprot.writeDouble(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PredictedIntervalTrafficDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PredictedIntervalTrafficDataTupleScheme getScheme() {
      return new PredictedIntervalTrafficDataTupleScheme();
    }
  }

  private static class PredictedIntervalTrafficDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<PredictedIntervalTrafficData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PredictedIntervalTrafficData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMigration()) {
        optionals.set(0);
      }
      if (struct.isSetPredictedIntervalTraffic()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMigration()) {
        oprot.writeDouble(struct.migration);
      }
      if (struct.isSetPredictedIntervalTraffic()) {
        {
          oprot.writeI32(struct.predictedIntervalTraffic.size());
          for (double _iter12 : struct.predictedIntervalTraffic)
          {
            oprot.writeDouble(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PredictedIntervalTrafficData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.migration = iprot.readDouble();
        struct.setMigrationIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.predictedIntervalTraffic = new java.util.ArrayList<java.lang.Double>(_list13.size);
          double _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readDouble();
            struct.predictedIntervalTraffic.add(_elem14);
          }
        }
        struct.setPredictedIntervalTrafficIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

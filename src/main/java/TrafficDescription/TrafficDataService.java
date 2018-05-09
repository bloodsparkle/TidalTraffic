package TrafficDescription;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-05-09")
public class TrafficDataService {

  public interface Iface {

    public PredictedIntervalTrafficData getPredictedData(NowIntervalTrafficData nowIntervalTrafficData) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void getPredictedData(NowIntervalTrafficData nowIntervalTrafficData, org.apache.thrift.async.AsyncMethodCallback<PredictedIntervalTrafficData> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public PredictedIntervalTrafficData getPredictedData(NowIntervalTrafficData nowIntervalTrafficData) throws org.apache.thrift.TException
    {
      send_getPredictedData(nowIntervalTrafficData);
      return recv_getPredictedData();
    }

    public void send_getPredictedData(NowIntervalTrafficData nowIntervalTrafficData) throws org.apache.thrift.TException
    {
      getPredictedData_args args = new getPredictedData_args();
      args.setNowIntervalTrafficData(nowIntervalTrafficData);
      sendBase("getPredictedData", args);
    }

    public PredictedIntervalTrafficData recv_getPredictedData() throws org.apache.thrift.TException
    {
      getPredictedData_result result = new getPredictedData_result();
      receiveBase(result, "getPredictedData");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "getPredictedData failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void getPredictedData(NowIntervalTrafficData nowIntervalTrafficData, org.apache.thrift.async.AsyncMethodCallback<PredictedIntervalTrafficData> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      getPredictedData_call method_call = new getPredictedData_call(nowIntervalTrafficData, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class getPredictedData_call extends org.apache.thrift.async.TAsyncMethodCall<PredictedIntervalTrafficData> {
      private NowIntervalTrafficData nowIntervalTrafficData;
      public getPredictedData_call(NowIntervalTrafficData nowIntervalTrafficData, org.apache.thrift.async.AsyncMethodCallback<PredictedIntervalTrafficData> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.nowIntervalTrafficData = nowIntervalTrafficData;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("getPredictedData", org.apache.thrift.protocol.TMessageType.CALL, 0));
        getPredictedData_args args = new getPredictedData_args();
        args.setNowIntervalTrafficData(nowIntervalTrafficData);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public PredictedIntervalTrafficData getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new java.lang.IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_getPredictedData();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("getPredictedData", new getPredictedData());
      return processMap;
    }

    public static class getPredictedData<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getPredictedData_args> {
      public getPredictedData() {
        super("getPredictedData");
      }

      public getPredictedData_args getEmptyArgsInstance() {
        return new getPredictedData_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public getPredictedData_result getResult(I iface, getPredictedData_args args) throws org.apache.thrift.TException {
        getPredictedData_result result = new getPredictedData_result();
        result.success = iface.getPredictedData(args.nowIntervalTrafficData);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("getPredictedData", new getPredictedData());
      return processMap;
    }

    public static class getPredictedData<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, getPredictedData_args, PredictedIntervalTrafficData> {
      public getPredictedData() {
        super("getPredictedData");
      }

      public getPredictedData_args getEmptyArgsInstance() {
        return new getPredictedData_args();
      }

      public org.apache.thrift.async.AsyncMethodCallback<PredictedIntervalTrafficData> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<PredictedIntervalTrafficData>() { 
          public void onComplete(PredictedIntervalTrafficData o) {
            getPredictedData_result result = new getPredictedData_result();
            result.success = o;
            try {
              fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
            } catch (org.apache.thrift.transport.TTransportException e) {
              _LOGGER.error("TTransportException writing to internal frame buffer", e);
              fb.close();
            } catch (java.lang.Exception e) {
              _LOGGER.error("Exception writing to internal frame buffer", e);
              onError(e);
            }
          }
          public void onError(java.lang.Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TSerializable msg;
            getPredictedData_result result = new getPredictedData_result();
            if (e instanceof org.apache.thrift.transport.TTransportException) {
              _LOGGER.error("TTransportException inside handler", e);
              fb.close();
              return;
            } else if (e instanceof org.apache.thrift.TApplicationException) {
              _LOGGER.error("TApplicationException inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TApplicationException)e;
            } else {
              _LOGGER.error("Exception inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
            } catch (java.lang.Exception ex) {
              _LOGGER.error("Exception writing to internal frame buffer", ex);
              fb.close();
            }
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, getPredictedData_args args, org.apache.thrift.async.AsyncMethodCallback<PredictedIntervalTrafficData> resultHandler) throws org.apache.thrift.TException {
        iface.getPredictedData(args.nowIntervalTrafficData,resultHandler);
      }
    }

  }

  public static class getPredictedData_args implements org.apache.thrift.TBase<getPredictedData_args, getPredictedData_args._Fields>, java.io.Serializable, Cloneable, Comparable<getPredictedData_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getPredictedData_args");

    private static final org.apache.thrift.protocol.TField NOW_INTERVAL_TRAFFIC_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("nowIntervalTrafficData", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new getPredictedData_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new getPredictedData_argsTupleSchemeFactory();

    public NowIntervalTrafficData nowIntervalTrafficData; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      NOW_INTERVAL_TRAFFIC_DATA((short)1, "nowIntervalTrafficData");

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
          case 1: // NOW_INTERVAL_TRAFFIC_DATA
            return NOW_INTERVAL_TRAFFIC_DATA;
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
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.NOW_INTERVAL_TRAFFIC_DATA, new org.apache.thrift.meta_data.FieldMetaData("nowIntervalTrafficData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NowIntervalTrafficData.class)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getPredictedData_args.class, metaDataMap);
    }

    public getPredictedData_args() {
    }

    public getPredictedData_args(
      NowIntervalTrafficData nowIntervalTrafficData)
    {
      this();
      this.nowIntervalTrafficData = nowIntervalTrafficData;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getPredictedData_args(getPredictedData_args other) {
      if (other.isSetNowIntervalTrafficData()) {
        this.nowIntervalTrafficData = new NowIntervalTrafficData(other.nowIntervalTrafficData);
      }
    }

    public getPredictedData_args deepCopy() {
      return new getPredictedData_args(this);
    }

    @Override
    public void clear() {
      this.nowIntervalTrafficData = null;
    }

    public NowIntervalTrafficData getNowIntervalTrafficData() {
      return this.nowIntervalTrafficData;
    }

    public getPredictedData_args setNowIntervalTrafficData(NowIntervalTrafficData nowIntervalTrafficData) {
      this.nowIntervalTrafficData = nowIntervalTrafficData;
      return this;
    }

    public void unsetNowIntervalTrafficData() {
      this.nowIntervalTrafficData = null;
    }

    /** Returns true if field nowIntervalTrafficData is set (has been assigned a value) and false otherwise */
    public boolean isSetNowIntervalTrafficData() {
      return this.nowIntervalTrafficData != null;
    }

    public void setNowIntervalTrafficDataIsSet(boolean value) {
      if (!value) {
        this.nowIntervalTrafficData = null;
      }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case NOW_INTERVAL_TRAFFIC_DATA:
        if (value == null) {
          unsetNowIntervalTrafficData();
        } else {
          setNowIntervalTrafficData((NowIntervalTrafficData)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case NOW_INTERVAL_TRAFFIC_DATA:
        return getNowIntervalTrafficData();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case NOW_INTERVAL_TRAFFIC_DATA:
        return isSetNowIntervalTrafficData();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof getPredictedData_args)
        return this.equals((getPredictedData_args)that);
      return false;
    }

    public boolean equals(getPredictedData_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_nowIntervalTrafficData = true && this.isSetNowIntervalTrafficData();
      boolean that_present_nowIntervalTrafficData = true && that.isSetNowIntervalTrafficData();
      if (this_present_nowIntervalTrafficData || that_present_nowIntervalTrafficData) {
        if (!(this_present_nowIntervalTrafficData && that_present_nowIntervalTrafficData))
          return false;
        if (!this.nowIntervalTrafficData.equals(that.nowIntervalTrafficData))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetNowIntervalTrafficData()) ? 131071 : 524287);
      if (isSetNowIntervalTrafficData())
        hashCode = hashCode * 8191 + nowIntervalTrafficData.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(getPredictedData_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetNowIntervalTrafficData()).compareTo(other.isSetNowIntervalTrafficData());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetNowIntervalTrafficData()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nowIntervalTrafficData, other.nowIntervalTrafficData);
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("getPredictedData_args(");
      boolean first = true;

      sb.append("nowIntervalTrafficData:");
      if (this.nowIntervalTrafficData == null) {
        sb.append("null");
      } else {
        sb.append(this.nowIntervalTrafficData);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (nowIntervalTrafficData != null) {
        nowIntervalTrafficData.validate();
      }
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class getPredictedData_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public getPredictedData_argsStandardScheme getScheme() {
        return new getPredictedData_argsStandardScheme();
      }
    }

    private static class getPredictedData_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<getPredictedData_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getPredictedData_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // NOW_INTERVAL_TRAFFIC_DATA
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.nowIntervalTrafficData = new NowIntervalTrafficData();
                struct.nowIntervalTrafficData.read(iprot);
                struct.setNowIntervalTrafficDataIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getPredictedData_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.nowIntervalTrafficData != null) {
          oprot.writeFieldBegin(NOW_INTERVAL_TRAFFIC_DATA_FIELD_DESC);
          struct.nowIntervalTrafficData.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class getPredictedData_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public getPredictedData_argsTupleScheme getScheme() {
        return new getPredictedData_argsTupleScheme();
      }
    }

    private static class getPredictedData_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<getPredictedData_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, getPredictedData_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetNowIntervalTrafficData()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetNowIntervalTrafficData()) {
          struct.nowIntervalTrafficData.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, getPredictedData_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.nowIntervalTrafficData = new NowIntervalTrafficData();
          struct.nowIntervalTrafficData.read(iprot);
          struct.setNowIntervalTrafficDataIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static class getPredictedData_result implements org.apache.thrift.TBase<getPredictedData_result, getPredictedData_result._Fields>, java.io.Serializable, Cloneable, Comparable<getPredictedData_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getPredictedData_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new getPredictedData_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new getPredictedData_resultTupleSchemeFactory();

    public PredictedIntervalTrafficData success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

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
          case 0: // SUCCESS
            return SUCCESS;
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
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PredictedIntervalTrafficData.class)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getPredictedData_result.class, metaDataMap);
    }

    public getPredictedData_result() {
    }

    public getPredictedData_result(
      PredictedIntervalTrafficData success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getPredictedData_result(getPredictedData_result other) {
      if (other.isSetSuccess()) {
        this.success = new PredictedIntervalTrafficData(other.success);
      }
    }

    public getPredictedData_result deepCopy() {
      return new getPredictedData_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public PredictedIntervalTrafficData getSuccess() {
      return this.success;
    }

    public getPredictedData_result setSuccess(PredictedIntervalTrafficData success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((PredictedIntervalTrafficData)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof getPredictedData_result)
        return this.equals((getPredictedData_result)that);
      return false;
    }

    public boolean equals(getPredictedData_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetSuccess()) ? 131071 : 524287);
      if (isSetSuccess())
        hashCode = hashCode * 8191 + success.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(getPredictedData_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("getPredictedData_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class getPredictedData_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public getPredictedData_resultStandardScheme getScheme() {
        return new getPredictedData_resultStandardScheme();
      }
    }

    private static class getPredictedData_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<getPredictedData_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getPredictedData_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new PredictedIntervalTrafficData();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getPredictedData_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class getPredictedData_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public getPredictedData_resultTupleScheme getScheme() {
        return new getPredictedData_resultTupleScheme();
      }
    }

    private static class getPredictedData_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<getPredictedData_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, getPredictedData_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, getPredictedData_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new PredictedIntervalTrafficData();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}

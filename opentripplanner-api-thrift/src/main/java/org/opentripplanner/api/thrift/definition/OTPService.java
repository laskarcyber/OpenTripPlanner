/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.opentripplanner.api.thrift.definition;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OTPService {

  /**
   * Thrift service definition exposed to clients.
   */
  public interface Iface {

    /**
     * Calculate the duration of a trip.
     * 
     * @param req
     */
    public TripDurationResponse GetTripDuration(TripDurationRequest req) throws NoPathFoundError, org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void GetTripDuration(TripDurationRequest req, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.GetTripDuration_call> resultHandler) throws org.apache.thrift.TException;

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

    public TripDurationResponse GetTripDuration(TripDurationRequest req) throws NoPathFoundError, org.apache.thrift.TException
    {
      send_GetTripDuration(req);
      return recv_GetTripDuration();
    }

    public void send_GetTripDuration(TripDurationRequest req) throws org.apache.thrift.TException
    {
      GetTripDuration_args args = new GetTripDuration_args();
      args.setReq(req);
      sendBase("GetTripDuration", args);
    }

    public TripDurationResponse recv_GetTripDuration() throws NoPathFoundError, org.apache.thrift.TException
    {
      GetTripDuration_result result = new GetTripDuration_result();
      receiveBase(result, "GetTripDuration");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.path_err != null) {
        throw result.path_err;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "GetTripDuration failed: unknown result");
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

    public void GetTripDuration(TripDurationRequest req, org.apache.thrift.async.AsyncMethodCallback<GetTripDuration_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      GetTripDuration_call method_call = new GetTripDuration_call(req, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class GetTripDuration_call extends org.apache.thrift.async.TAsyncMethodCall {
      private TripDurationRequest req;
      public GetTripDuration_call(TripDurationRequest req, org.apache.thrift.async.AsyncMethodCallback<GetTripDuration_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.req = req;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("GetTripDuration", org.apache.thrift.protocol.TMessageType.CALL, 0));
        GetTripDuration_args args = new GetTripDuration_args();
        args.setReq(req);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public TripDurationResponse getResult() throws NoPathFoundError, org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_GetTripDuration();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("GetTripDuration", new GetTripDuration());
      return processMap;
    }

    private static class GetTripDuration<I extends Iface> extends org.apache.thrift.ProcessFunction<I, GetTripDuration_args> {
      public GetTripDuration() {
        super("GetTripDuration");
      }

      protected GetTripDuration_args getEmptyArgsInstance() {
        return new GetTripDuration_args();
      }

      protected GetTripDuration_result getResult(I iface, GetTripDuration_args args) throws org.apache.thrift.TException {
        GetTripDuration_result result = new GetTripDuration_result();
        try {
          result.success = iface.GetTripDuration(args.req);
        } catch (NoPathFoundError path_err) {
          result.path_err = path_err;
        }
        return result;
      }
    }

  }

  public static class GetTripDuration_args implements org.apache.thrift.TBase<GetTripDuration_args, GetTripDuration_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTripDuration_args");

    private static final org.apache.thrift.protocol.TField REQ_FIELD_DESC = new org.apache.thrift.protocol.TField("req", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new GetTripDuration_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new GetTripDuration_argsTupleSchemeFactory());
    }

    private TripDurationRequest req; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      REQ((short)1, "req");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // REQ
            return REQ;
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
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.REQ, new org.apache.thrift.meta_data.FieldMetaData("req", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TripDurationRequest.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTripDuration_args.class, metaDataMap);
    }

    public GetTripDuration_args() {
    }

    public GetTripDuration_args(
      TripDurationRequest req)
    {
      this();
      this.req = req;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public GetTripDuration_args(GetTripDuration_args other) {
      if (other.isSetReq()) {
        this.req = new TripDurationRequest(other.req);
      }
    }

    public GetTripDuration_args deepCopy() {
      return new GetTripDuration_args(this);
    }

    @Override
    public void clear() {
      this.req = null;
    }

    public TripDurationRequest getReq() {
      return this.req;
    }

    public void setReq(TripDurationRequest req) {
      this.req = req;
    }

    public void unsetReq() {
      this.req = null;
    }

    /** Returns true if field req is set (has been assigned a value) and false otherwise */
    public boolean isSetReq() {
      return this.req != null;
    }

    public void setReqIsSet(boolean value) {
      if (!value) {
        this.req = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case REQ:
        if (value == null) {
          unsetReq();
        } else {
          setReq((TripDurationRequest)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case REQ:
        return getReq();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case REQ:
        return isSetReq();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof GetTripDuration_args)
        return this.equals((GetTripDuration_args)that);
      return false;
    }

    public boolean equals(GetTripDuration_args that) {
      if (that == null)
        return false;

      boolean this_present_req = true && this.isSetReq();
      boolean that_present_req = true && that.isSetReq();
      if (this_present_req || that_present_req) {
        if (!(this_present_req && that_present_req))
          return false;
        if (!this.req.equals(that.req))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(GetTripDuration_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      GetTripDuration_args typedOther = (GetTripDuration_args)other;

      lastComparison = Boolean.valueOf(isSetReq()).compareTo(typedOther.isSetReq());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetReq()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req, typedOther.req);
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
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("GetTripDuration_args(");
      boolean first = true;

      sb.append("req:");
      if (this.req == null) {
        sb.append("null");
      } else {
        sb.append(this.req);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class GetTripDuration_argsStandardSchemeFactory implements SchemeFactory {
      public GetTripDuration_argsStandardScheme getScheme() {
        return new GetTripDuration_argsStandardScheme();
      }
    }

    private static class GetTripDuration_argsStandardScheme extends StandardScheme<GetTripDuration_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, GetTripDuration_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // REQ
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.req = new TripDurationRequest();
                struct.req.read(iprot);
                struct.setReqIsSet(true);
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
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, GetTripDuration_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.req != null) {
          oprot.writeFieldBegin(REQ_FIELD_DESC);
          struct.req.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class GetTripDuration_argsTupleSchemeFactory implements SchemeFactory {
      public GetTripDuration_argsTupleScheme getScheme() {
        return new GetTripDuration_argsTupleScheme();
      }
    }

    private static class GetTripDuration_argsTupleScheme extends TupleScheme<GetTripDuration_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, GetTripDuration_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetReq()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetReq()) {
          struct.req.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, GetTripDuration_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.req = new TripDurationRequest();
          struct.req.read(iprot);
          struct.setReqIsSet(true);
        }
      }
    }

  }

  public static class GetTripDuration_result implements org.apache.thrift.TBase<GetTripDuration_result, GetTripDuration_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTripDuration_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);
    private static final org.apache.thrift.protocol.TField PATH_ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("path_err", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new GetTripDuration_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new GetTripDuration_resultTupleSchemeFactory());
    }

    private TripDurationResponse success; // required
    private NoPathFoundError path_err; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      PATH_ERR((short)1, "path_err");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
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
          case 1: // PATH_ERR
            return PATH_ERR;
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
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TripDurationResponse.class)));
      tmpMap.put(_Fields.PATH_ERR, new org.apache.thrift.meta_data.FieldMetaData("path_err", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTripDuration_result.class, metaDataMap);
    }

    public GetTripDuration_result() {
    }

    public GetTripDuration_result(
      TripDurationResponse success,
      NoPathFoundError path_err)
    {
      this();
      this.success = success;
      this.path_err = path_err;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public GetTripDuration_result(GetTripDuration_result other) {
      if (other.isSetSuccess()) {
        this.success = new TripDurationResponse(other.success);
      }
      if (other.isSetPath_err()) {
        this.path_err = new NoPathFoundError(other.path_err);
      }
    }

    public GetTripDuration_result deepCopy() {
      return new GetTripDuration_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.path_err = null;
    }

    public TripDurationResponse getSuccess() {
      return this.success;
    }

    public void setSuccess(TripDurationResponse success) {
      this.success = success;
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

    public NoPathFoundError getPath_err() {
      return this.path_err;
    }

    public void setPath_err(NoPathFoundError path_err) {
      this.path_err = path_err;
    }

    public void unsetPath_err() {
      this.path_err = null;
    }

    /** Returns true if field path_err is set (has been assigned a value) and false otherwise */
    public boolean isSetPath_err() {
      return this.path_err != null;
    }

    public void setPath_errIsSet(boolean value) {
      if (!value) {
        this.path_err = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((TripDurationResponse)value);
        }
        break;

      case PATH_ERR:
        if (value == null) {
          unsetPath_err();
        } else {
          setPath_err((NoPathFoundError)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      case PATH_ERR:
        return getPath_err();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case PATH_ERR:
        return isSetPath_err();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof GetTripDuration_result)
        return this.equals((GetTripDuration_result)that);
      return false;
    }

    public boolean equals(GetTripDuration_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_path_err = true && this.isSetPath_err();
      boolean that_present_path_err = true && that.isSetPath_err();
      if (this_present_path_err || that_present_path_err) {
        if (!(this_present_path_err && that_present_path_err))
          return false;
        if (!this.path_err.equals(that.path_err))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(GetTripDuration_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      GetTripDuration_result typedOther = (GetTripDuration_result)other;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetPath_err()).compareTo(typedOther.isSetPath_err());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetPath_err()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path_err, typedOther.path_err);
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
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("GetTripDuration_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("path_err:");
      if (this.path_err == null) {
        sb.append("null");
      } else {
        sb.append(this.path_err);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class GetTripDuration_resultStandardSchemeFactory implements SchemeFactory {
      public GetTripDuration_resultStandardScheme getScheme() {
        return new GetTripDuration_resultStandardScheme();
      }
    }

    private static class GetTripDuration_resultStandardScheme extends StandardScheme<GetTripDuration_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, GetTripDuration_result struct) throws org.apache.thrift.TException {
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
                struct.success = new TripDurationResponse();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // PATH_ERR
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.path_err = new NoPathFoundError();
                struct.path_err.read(iprot);
                struct.setPath_errIsSet(true);
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
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, GetTripDuration_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        if (struct.path_err != null) {
          oprot.writeFieldBegin(PATH_ERR_FIELD_DESC);
          struct.path_err.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class GetTripDuration_resultTupleSchemeFactory implements SchemeFactory {
      public GetTripDuration_resultTupleScheme getScheme() {
        return new GetTripDuration_resultTupleScheme();
      }
    }

    private static class GetTripDuration_resultTupleScheme extends TupleScheme<GetTripDuration_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, GetTripDuration_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetPath_err()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
        if (struct.isSetPath_err()) {
          struct.path_err.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, GetTripDuration_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.success = new TripDurationResponse();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
        if (incoming.get(1)) {
          struct.path_err = new NoPathFoundError();
          struct.path_err.read(iprot);
          struct.setPath_errIsSet(true);
        }
      }
    }

  }

}

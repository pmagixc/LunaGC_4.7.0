// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NBIKKDBMJOP.proto

package emu.grasscutter.net.proto;

public final class NBIKKDBMJOPOuterClass {
  private NBIKKDBMJOPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NBIKKDBMJOPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NBIKKDBMJOP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM> 
        getPHHIEKGDLCBList();
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM getPHHIEKGDLCB(int index);
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    int getPHHIEKGDLCBCount();
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder> 
        getPHHIEKGDLCBOrBuilderList();
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder getPHHIEKGDLCBOrBuilder(
        int index);

    /**
     * <code>repeated uint64 LPAEABNNFBD = 11;</code>
     * @return A list containing the lPAEABNNFBD.
     */
    java.util.List<java.lang.Long> getLPAEABNNFBDList();
    /**
     * <code>repeated uint64 LPAEABNNFBD = 11;</code>
     * @return The count of lPAEABNNFBD.
     */
    int getLPAEABNNFBDCount();
    /**
     * <code>repeated uint64 LPAEABNNFBD = 11;</code>
     * @param index The index of the element to return.
     * @return The lPAEABNNFBD at the given index.
     */
    long getLPAEABNNFBD(int index);
  }
  /**
   * <pre>
   * CmdId: 5560
   * </pre>
   *
   * Protobuf type {@code NBIKKDBMJOP}
   */
  public static final class NBIKKDBMJOP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NBIKKDBMJOP)
      NBIKKDBMJOPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NBIKKDBMJOP.newBuilder() to construct.
    private NBIKKDBMJOP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NBIKKDBMJOP() {
      pHHIEKGDLCB_ = java.util.Collections.emptyList();
      lPAEABNNFBD_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NBIKKDBMJOP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NBIKKDBMJOP(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pHHIEKGDLCB_ = new java.util.ArrayList<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM>();
                mutable_bitField0_ |= 0x00000001;
              }
              pHHIEKGDLCB_.add(
                  input.readMessage(emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.parser(), extensionRegistry));
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                lPAEABNNFBD_ = newLongList();
                mutable_bitField0_ |= 0x00000002;
              }
              lPAEABNNFBD_.addLong(input.readUInt64());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                lPAEABNNFBD_ = newLongList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                lPAEABNNFBD_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          pHHIEKGDLCB_ = java.util.Collections.unmodifiableList(pHHIEKGDLCB_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          lPAEABNNFBD_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.internal_static_NBIKKDBMJOP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.internal_static_NBIKKDBMJOP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.class, emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.Builder.class);
    }

    public static final int PHHIEKGDLCB_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM> pHHIEKGDLCB_;
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM> getPHHIEKGDLCBList() {
      return pHHIEKGDLCB_;
    }
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder> 
        getPHHIEKGDLCBOrBuilderList() {
      return pHHIEKGDLCB_;
    }
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    @java.lang.Override
    public int getPHHIEKGDLCBCount() {
      return pHHIEKGDLCB_.size();
    }
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM getPHHIEKGDLCB(int index) {
      return pHHIEKGDLCB_.get(index);
    }
    /**
     * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder getPHHIEKGDLCBOrBuilder(
        int index) {
      return pHHIEKGDLCB_.get(index);
    }

    public static final int LPAEABNNFBD_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.LongList lPAEABNNFBD_;
    /**
     * <code>repeated uint64 LPAEABNNFBD = 11;</code>
     * @return A list containing the lPAEABNNFBD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getLPAEABNNFBDList() {
      return lPAEABNNFBD_;
    }
    /**
     * <code>repeated uint64 LPAEABNNFBD = 11;</code>
     * @return The count of lPAEABNNFBD.
     */
    public int getLPAEABNNFBDCount() {
      return lPAEABNNFBD_.size();
    }
    /**
     * <code>repeated uint64 LPAEABNNFBD = 11;</code>
     * @param index The index of the element to return.
     * @return The lPAEABNNFBD at the given index.
     */
    public long getLPAEABNNFBD(int index) {
      return lPAEABNNFBD_.getLong(index);
    }
    private int lPAEABNNFBDMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < pHHIEKGDLCB_.size(); i++) {
        output.writeMessage(10, pHHIEKGDLCB_.get(i));
      }
      if (getLPAEABNNFBDList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(lPAEABNNFBDMemoizedSerializedSize);
      }
      for (int i = 0; i < lPAEABNNFBD_.size(); i++) {
        output.writeUInt64NoTag(lPAEABNNFBD_.getLong(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pHHIEKGDLCB_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, pHHIEKGDLCB_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < lPAEABNNFBD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(lPAEABNNFBD_.getLong(i));
        }
        size += dataSize;
        if (!getLPAEABNNFBDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lPAEABNNFBDMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP other = (emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP) obj;

      if (!getPHHIEKGDLCBList()
          .equals(other.getPHHIEKGDLCBList())) return false;
      if (!getLPAEABNNFBDList()
          .equals(other.getLPAEABNNFBDList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPHHIEKGDLCBCount() > 0) {
        hash = (37 * hash) + PHHIEKGDLCB_FIELD_NUMBER;
        hash = (53 * hash) + getPHHIEKGDLCBList().hashCode();
      }
      if (getLPAEABNNFBDCount() > 0) {
        hash = (37 * hash) + LPAEABNNFBD_FIELD_NUMBER;
        hash = (53 * hash) + getLPAEABNNFBDList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 5560
     * </pre>
     *
     * Protobuf type {@code NBIKKDBMJOP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NBIKKDBMJOP)
        emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.internal_static_NBIKKDBMJOP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.internal_static_NBIKKDBMJOP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.class, emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPHHIEKGDLCBFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (pHHIEKGDLCBBuilder_ == null) {
          pHHIEKGDLCB_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pHHIEKGDLCBBuilder_.clear();
        }
        lPAEABNNFBD_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.internal_static_NBIKKDBMJOP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP build() {
        emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP buildPartial() {
        emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP result = new emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP(this);
        int from_bitField0_ = bitField0_;
        if (pHHIEKGDLCBBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pHHIEKGDLCB_ = java.util.Collections.unmodifiableList(pHHIEKGDLCB_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pHHIEKGDLCB_ = pHHIEKGDLCB_;
        } else {
          result.pHHIEKGDLCB_ = pHHIEKGDLCBBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          lPAEABNNFBD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.lPAEABNNFBD_ = lPAEABNNFBD_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP) {
          return mergeFrom((emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP other) {
        if (other == emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP.getDefaultInstance()) return this;
        if (pHHIEKGDLCBBuilder_ == null) {
          if (!other.pHHIEKGDLCB_.isEmpty()) {
            if (pHHIEKGDLCB_.isEmpty()) {
              pHHIEKGDLCB_ = other.pHHIEKGDLCB_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePHHIEKGDLCBIsMutable();
              pHHIEKGDLCB_.addAll(other.pHHIEKGDLCB_);
            }
            onChanged();
          }
        } else {
          if (!other.pHHIEKGDLCB_.isEmpty()) {
            if (pHHIEKGDLCBBuilder_.isEmpty()) {
              pHHIEKGDLCBBuilder_.dispose();
              pHHIEKGDLCBBuilder_ = null;
              pHHIEKGDLCB_ = other.pHHIEKGDLCB_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pHHIEKGDLCBBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPHHIEKGDLCBFieldBuilder() : null;
            } else {
              pHHIEKGDLCBBuilder_.addAllMessages(other.pHHIEKGDLCB_);
            }
          }
        }
        if (!other.lPAEABNNFBD_.isEmpty()) {
          if (lPAEABNNFBD_.isEmpty()) {
            lPAEABNNFBD_ = other.lPAEABNNFBD_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLPAEABNNFBDIsMutable();
            lPAEABNNFBD_.addAll(other.lPAEABNNFBD_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM> pHHIEKGDLCB_ =
        java.util.Collections.emptyList();
      private void ensurePHHIEKGDLCBIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pHHIEKGDLCB_ = new java.util.ArrayList<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM>(pHHIEKGDLCB_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder> pHHIEKGDLCBBuilder_;

      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM> getPHHIEKGDLCBList() {
        if (pHHIEKGDLCBBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pHHIEKGDLCB_);
        } else {
          return pHHIEKGDLCBBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public int getPHHIEKGDLCBCount() {
        if (pHHIEKGDLCBBuilder_ == null) {
          return pHHIEKGDLCB_.size();
        } else {
          return pHHIEKGDLCBBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM getPHHIEKGDLCB(int index) {
        if (pHHIEKGDLCBBuilder_ == null) {
          return pHHIEKGDLCB_.get(index);
        } else {
          return pHHIEKGDLCBBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder setPHHIEKGDLCB(
          int index, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM value) {
        if (pHHIEKGDLCBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.set(index, value);
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder setPHHIEKGDLCB(
          int index, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder builderForValue) {
        if (pHHIEKGDLCBBuilder_ == null) {
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.set(index, builderForValue.build());
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder addPHHIEKGDLCB(emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM value) {
        if (pHHIEKGDLCBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.add(value);
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder addPHHIEKGDLCB(
          int index, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM value) {
        if (pHHIEKGDLCBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.add(index, value);
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder addPHHIEKGDLCB(
          emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder builderForValue) {
        if (pHHIEKGDLCBBuilder_ == null) {
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.add(builderForValue.build());
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder addPHHIEKGDLCB(
          int index, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder builderForValue) {
        if (pHHIEKGDLCBBuilder_ == null) {
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.add(index, builderForValue.build());
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder addAllPHHIEKGDLCB(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM> values) {
        if (pHHIEKGDLCBBuilder_ == null) {
          ensurePHHIEKGDLCBIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pHHIEKGDLCB_);
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder clearPHHIEKGDLCB() {
        if (pHHIEKGDLCBBuilder_ == null) {
          pHHIEKGDLCB_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public Builder removePHHIEKGDLCB(int index) {
        if (pHHIEKGDLCBBuilder_ == null) {
          ensurePHHIEKGDLCBIsMutable();
          pHHIEKGDLCB_.remove(index);
          onChanged();
        } else {
          pHHIEKGDLCBBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder getPHHIEKGDLCBBuilder(
          int index) {
        return getPHHIEKGDLCBFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder getPHHIEKGDLCBOrBuilder(
          int index) {
        if (pHHIEKGDLCBBuilder_ == null) {
          return pHHIEKGDLCB_.get(index);  } else {
          return pHHIEKGDLCBBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder> 
           getPHHIEKGDLCBOrBuilderList() {
        if (pHHIEKGDLCBBuilder_ != null) {
          return pHHIEKGDLCBBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pHHIEKGDLCB_);
        }
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder addPHHIEKGDLCBBuilder() {
        return getPHHIEKGDLCBFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.getDefaultInstance());
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder addPHHIEKGDLCBBuilder(
          int index) {
        return getPHHIEKGDLCBFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.getDefaultInstance());
      }
      /**
       * <code>repeated .ANDPNJDKHNM PHHIEKGDLCB = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder> 
           getPHHIEKGDLCBBuilderList() {
        return getPHHIEKGDLCBFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder> 
          getPHHIEKGDLCBFieldBuilder() {
        if (pHHIEKGDLCBBuilder_ == null) {
          pHHIEKGDLCBBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNM.Builder, emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.ANDPNJDKHNMOrBuilder>(
                  pHHIEKGDLCB_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pHHIEKGDLCB_ = null;
        }
        return pHHIEKGDLCBBuilder_;
      }

      private com.google.protobuf.Internal.LongList lPAEABNNFBD_ = emptyLongList();
      private void ensureLPAEABNNFBDIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          lPAEABNNFBD_ = mutableCopy(lPAEABNNFBD_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @return A list containing the lPAEABNNFBD.
       */
      public java.util.List<java.lang.Long>
          getLPAEABNNFBDList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(lPAEABNNFBD_) : lPAEABNNFBD_;
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @return The count of lPAEABNNFBD.
       */
      public int getLPAEABNNFBDCount() {
        return lPAEABNNFBD_.size();
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @param index The index of the element to return.
       * @return The lPAEABNNFBD at the given index.
       */
      public long getLPAEABNNFBD(int index) {
        return lPAEABNNFBD_.getLong(index);
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @param index The index to set the value at.
       * @param value The lPAEABNNFBD to set.
       * @return This builder for chaining.
       */
      public Builder setLPAEABNNFBD(
          int index, long value) {
        ensureLPAEABNNFBDIsMutable();
        lPAEABNNFBD_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @param value The lPAEABNNFBD to add.
       * @return This builder for chaining.
       */
      public Builder addLPAEABNNFBD(long value) {
        ensureLPAEABNNFBDIsMutable();
        lPAEABNNFBD_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @param values The lPAEABNNFBD to add.
       * @return This builder for chaining.
       */
      public Builder addAllLPAEABNNFBD(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureLPAEABNNFBDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lPAEABNNFBD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 LPAEABNNFBD = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLPAEABNNFBD() {
        lPAEABNNFBD_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NBIKKDBMJOP)
    }

    // @@protoc_insertion_point(class_scope:NBIKKDBMJOP)
    private static final emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP();
    }

    public static emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NBIKKDBMJOP>
        PARSER = new com.google.protobuf.AbstractParser<NBIKKDBMJOP>() {
      @java.lang.Override
      public NBIKKDBMJOP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NBIKKDBMJOP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NBIKKDBMJOP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NBIKKDBMJOP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NBIKKDBMJOPOuterClass.NBIKKDBMJOP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NBIKKDBMJOP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NBIKKDBMJOP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NBIKKDBMJOP.proto\032\021ANDPNJDKHNM.proto\"E" +
      "\n\013NBIKKDBMJOP\022!\n\013PHHIEKGDLCB\030\n \003(\0132\014.AND" +
      "PNJDKHNM\022\023\n\013LPAEABNNFBD\030\013 \003(\004B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.getDescriptor(),
        });
    internal_static_NBIKKDBMJOP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NBIKKDBMJOP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NBIKKDBMJOP_descriptor,
        new java.lang.String[] { "PHHIEKGDLCB", "LPAEABNNFBD", });
    emu.grasscutter.net.proto.ANDPNJDKHNMOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

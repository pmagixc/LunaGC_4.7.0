// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CPBCJBADPPD.proto

package emu.grasscutter.net.proto;

public final class CPBCJBADPPDOuterClass {
  private CPBCJBADPPDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CPBCJBADPPDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CPBCJBADPPD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 DNHAMFJMLJB = 9;</code>
     * @return A list containing the dNHAMFJMLJB.
     */
    java.util.List<java.lang.Integer> getDNHAMFJMLJBList();
    /**
     * <code>repeated int32 DNHAMFJMLJB = 9;</code>
     * @return The count of dNHAMFJMLJB.
     */
    int getDNHAMFJMLJBCount();
    /**
     * <code>repeated int32 DNHAMFJMLJB = 9;</code>
     * @param index The index of the element to return.
     * @return The dNHAMFJMLJB at the given index.
     */
    int getDNHAMFJMLJB(int index);

    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP> 
        getNodesList();
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP getNodes(int index);
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    int getNodesCount();
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder> 
        getNodesOrBuilderList();
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder getNodesOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 6196
   * </pre>
   *
   * Protobuf type {@code CPBCJBADPPD}
   */
  public static final class CPBCJBADPPD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CPBCJBADPPD)
      CPBCJBADPPDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CPBCJBADPPD.newBuilder() to construct.
    private CPBCJBADPPD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CPBCJBADPPD() {
      dNHAMFJMLJB_ = emptyIntList();
      nodes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CPBCJBADPPD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CPBCJBADPPD(
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
            case 58: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                nodes_ = new java.util.ArrayList<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP>();
                mutable_bitField0_ |= 0x00000002;
              }
              nodes_.add(
                  input.readMessage(emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.parser(), extensionRegistry));
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dNHAMFJMLJB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              dNHAMFJMLJB_.addInt(input.readInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                dNHAMFJMLJB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dNHAMFJMLJB_.addInt(input.readInt32());
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          dNHAMFJMLJB_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.internal_static_CPBCJBADPPD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.internal_static_CPBCJBADPPD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.class, emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.Builder.class);
    }

    public static final int DNHAMFJMLJB_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList dNHAMFJMLJB_;
    /**
     * <code>repeated int32 DNHAMFJMLJB = 9;</code>
     * @return A list containing the dNHAMFJMLJB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDNHAMFJMLJBList() {
      return dNHAMFJMLJB_;
    }
    /**
     * <code>repeated int32 DNHAMFJMLJB = 9;</code>
     * @return The count of dNHAMFJMLJB.
     */
    public int getDNHAMFJMLJBCount() {
      return dNHAMFJMLJB_.size();
    }
    /**
     * <code>repeated int32 DNHAMFJMLJB = 9;</code>
     * @param index The index of the element to return.
     * @return The dNHAMFJMLJB at the given index.
     */
    public int getDNHAMFJMLJB(int index) {
      return dNHAMFJMLJB_.getInt(index);
    }
    private int dNHAMFJMLJBMemoizedSerializedSize = -1;

    public static final int NODES_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP> nodes_;
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP> getNodesList() {
      return nodes_;
    }
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder> 
        getNodesOrBuilderList() {
      return nodes_;
    }
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    @java.lang.Override
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP getNodes(int index) {
      return nodes_.get(index);
    }
    /**
     * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder getNodesOrBuilder(
        int index) {
      return nodes_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

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
      for (int i = 0; i < nodes_.size(); i++) {
        output.writeMessage(7, nodes_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (getDNHAMFJMLJBList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(dNHAMFJMLJBMemoizedSerializedSize);
      }
      for (int i = 0; i < dNHAMFJMLJB_.size(); i++) {
        output.writeInt32NoTag(dNHAMFJMLJB_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nodes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, nodes_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < dNHAMFJMLJB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dNHAMFJMLJB_.getInt(i));
        }
        size += dataSize;
        if (!getDNHAMFJMLJBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dNHAMFJMLJBMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD other = (emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD) obj;

      if (!getDNHAMFJMLJBList()
          .equals(other.getDNHAMFJMLJBList())) return false;
      if (!getNodesList()
          .equals(other.getNodesList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getDNHAMFJMLJBCount() > 0) {
        hash = (37 * hash) + DNHAMFJMLJB_FIELD_NUMBER;
        hash = (53 * hash) + getDNHAMFJMLJBList().hashCode();
      }
      if (getNodesCount() > 0) {
        hash = (37 * hash) + NODES_FIELD_NUMBER;
        hash = (53 * hash) + getNodesList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD prototype) {
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
     * CmdId: 6196
     * </pre>
     *
     * Protobuf type {@code CPBCJBADPPD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CPBCJBADPPD)
        emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.internal_static_CPBCJBADPPD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.internal_static_CPBCJBADPPD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.class, emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.newBuilder()
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
          getNodesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dNHAMFJMLJB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          nodesBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.internal_static_CPBCJBADPPD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD build() {
        emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD buildPartial() {
        emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD result = new emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dNHAMFJMLJB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dNHAMFJMLJB_ = dNHAMFJMLJB_;
        if (nodesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            nodes_ = java.util.Collections.unmodifiableList(nodes_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.nodes_ = nodes_;
        } else {
          result.nodes_ = nodesBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD) {
          return mergeFrom((emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD other) {
        if (other == emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD.getDefaultInstance()) return this;
        if (!other.dNHAMFJMLJB_.isEmpty()) {
          if (dNHAMFJMLJB_.isEmpty()) {
            dNHAMFJMLJB_ = other.dNHAMFJMLJB_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDNHAMFJMLJBIsMutable();
            dNHAMFJMLJB_.addAll(other.dNHAMFJMLJB_);
          }
          onChanged();
        }
        if (nodesBuilder_ == null) {
          if (!other.nodes_.isEmpty()) {
            if (nodes_.isEmpty()) {
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureNodesIsMutable();
              nodes_.addAll(other.nodes_);
            }
            onChanged();
          }
        } else {
          if (!other.nodes_.isEmpty()) {
            if (nodesBuilder_.isEmpty()) {
              nodesBuilder_.dispose();
              nodesBuilder_ = null;
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000002);
              nodesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNodesFieldBuilder() : null;
            } else {
              nodesBuilder_.addAllMessages(other.nodes_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList dNHAMFJMLJB_ = emptyIntList();
      private void ensureDNHAMFJMLJBIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dNHAMFJMLJB_ = mutableCopy(dNHAMFJMLJB_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @return A list containing the dNHAMFJMLJB.
       */
      public java.util.List<java.lang.Integer>
          getDNHAMFJMLJBList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dNHAMFJMLJB_) : dNHAMFJMLJB_;
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @return The count of dNHAMFJMLJB.
       */
      public int getDNHAMFJMLJBCount() {
        return dNHAMFJMLJB_.size();
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @param index The index of the element to return.
       * @return The dNHAMFJMLJB at the given index.
       */
      public int getDNHAMFJMLJB(int index) {
        return dNHAMFJMLJB_.getInt(index);
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @param index The index to set the value at.
       * @param value The dNHAMFJMLJB to set.
       * @return This builder for chaining.
       */
      public Builder setDNHAMFJMLJB(
          int index, int value) {
        ensureDNHAMFJMLJBIsMutable();
        dNHAMFJMLJB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @param value The dNHAMFJMLJB to add.
       * @return This builder for chaining.
       */
      public Builder addDNHAMFJMLJB(int value) {
        ensureDNHAMFJMLJBIsMutable();
        dNHAMFJMLJB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @param values The dNHAMFJMLJB to add.
       * @return This builder for chaining.
       */
      public Builder addAllDNHAMFJMLJB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDNHAMFJMLJBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dNHAMFJMLJB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 DNHAMFJMLJB = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNHAMFJMLJB() {
        dNHAMFJMLJB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP> nodes_ =
        java.util.Collections.emptyList();
      private void ensureNodesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          nodes_ = new java.util.ArrayList<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP>(nodes_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder> nodesBuilder_;

      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP> getNodesList() {
        if (nodesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodes_);
        } else {
          return nodesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public int getNodesCount() {
        if (nodesBuilder_ == null) {
          return nodes_.size();
        } else {
          return nodesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP getNodes(int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);
        } else {
          return nodesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.set(index, value);
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder addNodes(emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(index, value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder addNodes(
          emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder addAllNodes(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP> values) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nodes_);
          onChanged();
        } else {
          nodesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder clearNodes() {
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          nodesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public Builder removeNodes(int index) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.remove(index);
          onChanged();
        } else {
          nodesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder getNodesBuilder(
          int index) {
        return getNodesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder getNodesOrBuilder(
          int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);  } else {
          return nodesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder> 
           getNodesOrBuilderList() {
        if (nodesBuilder_ != null) {
          return nodesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodes_);
        }
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder addNodesBuilder() {
        return getNodesFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.getDefaultInstance());
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder addNodesBuilder(
          int index) {
        return getNodesFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.getDefaultInstance());
      }
      /**
       * <code>repeated .JNNOKDHCAMP nodes = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder> 
           getNodesBuilderList() {
        return getNodesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder> 
          getNodesFieldBuilder() {
        if (nodesBuilder_ == null) {
          nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMP.Builder, emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.JNNOKDHCAMPOrBuilder>(
                  nodes_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          nodes_ = null;
        }
        return nodesBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CPBCJBADPPD)
    }

    // @@protoc_insertion_point(class_scope:CPBCJBADPPD)
    private static final emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD();
    }

    public static emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CPBCJBADPPD>
        PARSER = new com.google.protobuf.AbstractParser<CPBCJBADPPD>() {
      @java.lang.Override
      public CPBCJBADPPD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CPBCJBADPPD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CPBCJBADPPD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CPBCJBADPPD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CPBCJBADPPDOuterClass.CPBCJBADPPD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CPBCJBADPPD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CPBCJBADPPD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CPBCJBADPPD.proto\032\021JNNOKDHCAMP.proto\"P" +
      "\n\013CPBCJBADPPD\022\023\n\013DNHAMFJMLJB\030\t \003(\005\022\033\n\005no" +
      "des\030\007 \003(\0132\014.JNNOKDHCAMP\022\017\n\007retcode\030\010 \001(\005" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.getDescriptor(),
        });
    internal_static_CPBCJBADPPD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CPBCJBADPPD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CPBCJBADPPD_descriptor,
        new java.lang.String[] { "DNHAMFJMLJB", "Nodes", "Retcode", });
    emu.grasscutter.net.proto.JNNOKDHCAMPOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
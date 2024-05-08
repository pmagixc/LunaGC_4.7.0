// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgPass.proto

package emu.grasscutter.net.proto;

public final class GCGMsgPassOuterClass {
  private GCGMsgPassOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgPassOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgPass)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * <pre>
   * Obf: IAMEPPEDAJF
   * </pre>
   *
   * Protobuf type {@code GCGMsgPass}
   */
  public static final class GCGMsgPass extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgPass)
      GCGMsgPassOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgPass.newBuilder() to construct.
    private GCGMsgPass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgPass() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgPass();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgPass(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 112: {

              controllerId_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMsgPassOuterClass.internal_static_GCGMsgPass_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgPassOuterClass.internal_static_GCGMsgPass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.class, emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.Builder.class);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 14;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
      if (controllerId_ != 0) {
        output.writeUInt32(14, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass other = (emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
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
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass prototype) {
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
     * Obf: IAMEPPEDAJF
     * </pre>
     *
     * Protobuf type {@code GCGMsgPass}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgPass)
        emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPassOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgPassOuterClass.internal_static_GCGMsgPass_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgPassOuterClass.internal_static_GCGMsgPass_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.class, emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        controllerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgPassOuterClass.internal_static_GCGMsgPass_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass build() {
        emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass buildPartial() {
        emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass result = new emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass(this);
        result.controllerId_ = controllerId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass other) {
        if (other == emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
        emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgPass)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgPass)
    private static final emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass();
    }

    public static emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgPass>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgPass>() {
      @java.lang.Override
      public GCGMsgPass parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgPass(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgPass> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgPass> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgPass_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgPass_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020GCGMsgPass.proto\"#\n\nGCGMsgPass\022\025\n\rcont" +
      "roller_id\030\016 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgPass_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgPass_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgPass_descriptor,
        new java.lang.String[] { "ControllerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

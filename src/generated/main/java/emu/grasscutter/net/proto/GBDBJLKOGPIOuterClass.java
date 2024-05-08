// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GBDBJLKOGPI.proto

package emu.grasscutter.net.proto;

public final class GBDBJLKOGPIOuterClass {
  private GBDBJLKOGPIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GBDBJLKOGPIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GBDBJLKOGPI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 8;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 IFFAGNNKDOB = 13;</code>
     * @return The iFFAGNNKDOB.
     */
    int getIFFAGNNKDOB();
  }
  /**
   * <pre>
   * CmdId: 7902
   * </pre>
   *
   * Protobuf type {@code GBDBJLKOGPI}
   */
  public static final class GBDBJLKOGPI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GBDBJLKOGPI)
      GBDBJLKOGPIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GBDBJLKOGPI.newBuilder() to construct.
    private GBDBJLKOGPI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GBDBJLKOGPI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GBDBJLKOGPI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GBDBJLKOGPI(
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
            case 32: {

              entityId_ = input.readUInt32();
              break;
            }
            case 64: {

              pointId_ = input.readUInt32();
              break;
            }
            case 104: {

              iFFAGNNKDOB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.internal_static_GBDBJLKOGPI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.internal_static_GBDBJLKOGPI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.class, emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 8;
    private int pointId_;
    /**
     * <code>uint32 point_id = 8;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 4;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int IFFAGNNKDOB_FIELD_NUMBER = 13;
    private int iFFAGNNKDOB_;
    /**
     * <code>uint32 IFFAGNNKDOB = 13;</code>
     * @return The iFFAGNNKDOB.
     */
    @java.lang.Override
    public int getIFFAGNNKDOB() {
      return iFFAGNNKDOB_;
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
      if (entityId_ != 0) {
        output.writeUInt32(4, entityId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(8, pointId_);
      }
      if (iFFAGNNKDOB_ != 0) {
        output.writeUInt32(13, iFFAGNNKDOB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, entityId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, pointId_);
      }
      if (iFFAGNNKDOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, iFFAGNNKDOB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI other = (emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getIFFAGNNKDOB()
          != other.getIFFAGNNKDOB()) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + IFFAGNNKDOB_FIELD_NUMBER;
      hash = (53 * hash) + getIFFAGNNKDOB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI prototype) {
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
     * CmdId: 7902
     * </pre>
     *
     * Protobuf type {@code GBDBJLKOGPI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GBDBJLKOGPI)
        emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.internal_static_GBDBJLKOGPI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.internal_static_GBDBJLKOGPI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.class, emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.newBuilder()
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
        pointId_ = 0;

        entityId_ = 0;

        iFFAGNNKDOB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.internal_static_GBDBJLKOGPI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI build() {
        emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI buildPartial() {
        emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI result = new emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI(this);
        result.pointId_ = pointId_;
        result.entityId_ = entityId_;
        result.iFFAGNNKDOB_ = iFFAGNNKDOB_;
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
        if (other instanceof emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI) {
          return mergeFrom((emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI other) {
        if (other == emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getIFFAGNNKDOB() != 0) {
          setIFFAGNNKDOB(other.getIFFAGNNKDOB());
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
        emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 8;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 8;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 4;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 4;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int iFFAGNNKDOB_ ;
      /**
       * <code>uint32 IFFAGNNKDOB = 13;</code>
       * @return The iFFAGNNKDOB.
       */
      @java.lang.Override
      public int getIFFAGNNKDOB() {
        return iFFAGNNKDOB_;
      }
      /**
       * <code>uint32 IFFAGNNKDOB = 13;</code>
       * @param value The iFFAGNNKDOB to set.
       * @return This builder for chaining.
       */
      public Builder setIFFAGNNKDOB(int value) {
        
        iFFAGNNKDOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IFFAGNNKDOB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIFFAGNNKDOB() {
        
        iFFAGNNKDOB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GBDBJLKOGPI)
    }

    // @@protoc_insertion_point(class_scope:GBDBJLKOGPI)
    private static final emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI();
    }

    public static emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GBDBJLKOGPI>
        PARSER = new com.google.protobuf.AbstractParser<GBDBJLKOGPI>() {
      @java.lang.Override
      public GBDBJLKOGPI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GBDBJLKOGPI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GBDBJLKOGPI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GBDBJLKOGPI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GBDBJLKOGPIOuterClass.GBDBJLKOGPI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GBDBJLKOGPI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GBDBJLKOGPI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GBDBJLKOGPI.proto\"G\n\013GBDBJLKOGPI\022\020\n\010po" +
      "int_id\030\010 \001(\r\022\021\n\tentity_id\030\004 \001(\r\022\023\n\013IFFAG" +
      "NNKDOB\030\r \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GBDBJLKOGPI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GBDBJLKOGPI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GBDBJLKOGPI_descriptor,
        new java.lang.String[] { "PointId", "EntityId", "IFFAGNNKDOB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

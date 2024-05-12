// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainSnapshot.proto

package emu.grasscutter.net.proto;

public final class BargainSnapshotOuterClass {
  private BargainSnapshotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainSnapshotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainSnapshot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IOCNPJJNHLD = 12;</code>
     * @return The iOCNPJJNHLD.
     */
    int getIOCNPJJNHLD();

    /**
     * <code>uint32 BALOPACHCDB = 2;</code>
     * @return The bALOPACHCDB.
     */
    int getBALOPACHCDB();

    /**
     * <code>int32 cur_mood = 9;</code>
     * @return The curMood.
     */
    int getCurMood();

    /**
     * <code>uint32 bargain_id = 15;</code>
     * @return The bargainId.
     */
    int getBargainId();
  }
  /**
   * <pre>
   * Obf: KIOJOGPNAKF
   * </pre>
   *
   * Protobuf type {@code BargainSnapshot}
   */
  public static final class BargainSnapshot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainSnapshot)
      BargainSnapshotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainSnapshot.newBuilder() to construct.
    private BargainSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainSnapshot() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainSnapshot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BargainSnapshot(
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
            case 16: {

              bALOPACHCDB_ = input.readUInt32();
              break;
            }
            case 72: {

              curMood_ = input.readInt32();
              break;
            }
            case 96: {

              iOCNPJJNHLD_ = input.readUInt32();
              break;
            }
            case 120: {

              bargainId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.class, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder.class);
    }

    public static final int IOCNPJJNHLD_FIELD_NUMBER = 12;
    private int iOCNPJJNHLD_;
    /**
     * <code>uint32 IOCNPJJNHLD = 12;</code>
     * @return The iOCNPJJNHLD.
     */
    @java.lang.Override
    public int getIOCNPJJNHLD() {
      return iOCNPJJNHLD_;
    }

    public static final int BALOPACHCDB_FIELD_NUMBER = 2;
    private int bALOPACHCDB_;
    /**
     * <code>uint32 BALOPACHCDB = 2;</code>
     * @return The bALOPACHCDB.
     */
    @java.lang.Override
    public int getBALOPACHCDB() {
      return bALOPACHCDB_;
    }

    public static final int CUR_MOOD_FIELD_NUMBER = 9;
    private int curMood_;
    /**
     * <code>int32 cur_mood = 9;</code>
     * @return The curMood.
     */
    @java.lang.Override
    public int getCurMood() {
      return curMood_;
    }

    public static final int BARGAIN_ID_FIELD_NUMBER = 15;
    private int bargainId_;
    /**
     * <code>uint32 bargain_id = 15;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
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
      if (bALOPACHCDB_ != 0) {
        output.writeUInt32(2, bALOPACHCDB_);
      }
      if (curMood_ != 0) {
        output.writeInt32(9, curMood_);
      }
      if (iOCNPJJNHLD_ != 0) {
        output.writeUInt32(12, iOCNPJJNHLD_);
      }
      if (bargainId_ != 0) {
        output.writeUInt32(15, bargainId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bALOPACHCDB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bALOPACHCDB_);
      }
      if (curMood_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, curMood_);
      }
      if (iOCNPJJNHLD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, iOCNPJJNHLD_);
      }
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, bargainId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot other = (emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot) obj;

      if (getIOCNPJJNHLD()
          != other.getIOCNPJJNHLD()) return false;
      if (getBALOPACHCDB()
          != other.getBALOPACHCDB()) return false;
      if (getCurMood()
          != other.getCurMood()) return false;
      if (getBargainId()
          != other.getBargainId()) return false;
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
      hash = (37 * hash) + IOCNPJJNHLD_FIELD_NUMBER;
      hash = (53 * hash) + getIOCNPJJNHLD();
      hash = (37 * hash) + BALOPACHCDB_FIELD_NUMBER;
      hash = (53 * hash) + getBALOPACHCDB();
      hash = (37 * hash) + CUR_MOOD_FIELD_NUMBER;
      hash = (53 * hash) + getCurMood();
      hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot prototype) {
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
     * Obf: KIOJOGPNAKF
     * </pre>
     *
     * Protobuf type {@code BargainSnapshot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainSnapshot)
        emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.class, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.newBuilder()
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
        iOCNPJJNHLD_ = 0;

        bALOPACHCDB_ = 0;

        curMood_ = 0;

        bargainId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot build() {
        emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot buildPartial() {
        emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot result = new emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot(this);
        result.iOCNPJJNHLD_ = iOCNPJJNHLD_;
        result.bALOPACHCDB_ = bALOPACHCDB_;
        result.curMood_ = curMood_;
        result.bargainId_ = bargainId_;
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
        if (other instanceof emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot) {
          return mergeFrom((emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot other) {
        if (other == emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance()) return this;
        if (other.getIOCNPJJNHLD() != 0) {
          setIOCNPJJNHLD(other.getIOCNPJJNHLD());
        }
        if (other.getBALOPACHCDB() != 0) {
          setBALOPACHCDB(other.getBALOPACHCDB());
        }
        if (other.getCurMood() != 0) {
          setCurMood(other.getCurMood());
        }
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
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
        emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iOCNPJJNHLD_ ;
      /**
       * <code>uint32 IOCNPJJNHLD = 12;</code>
       * @return The iOCNPJJNHLD.
       */
      @java.lang.Override
      public int getIOCNPJJNHLD() {
        return iOCNPJJNHLD_;
      }
      /**
       * <code>uint32 IOCNPJJNHLD = 12;</code>
       * @param value The iOCNPJJNHLD to set.
       * @return This builder for chaining.
       */
      public Builder setIOCNPJJNHLD(int value) {
        
        iOCNPJJNHLD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IOCNPJJNHLD = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIOCNPJJNHLD() {
        
        iOCNPJJNHLD_ = 0;
        onChanged();
        return this;
      }

      private int bALOPACHCDB_ ;
      /**
       * <code>uint32 BALOPACHCDB = 2;</code>
       * @return The bALOPACHCDB.
       */
      @java.lang.Override
      public int getBALOPACHCDB() {
        return bALOPACHCDB_;
      }
      /**
       * <code>uint32 BALOPACHCDB = 2;</code>
       * @param value The bALOPACHCDB to set.
       * @return This builder for chaining.
       */
      public Builder setBALOPACHCDB(int value) {
        
        bALOPACHCDB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BALOPACHCDB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBALOPACHCDB() {
        
        bALOPACHCDB_ = 0;
        onChanged();
        return this;
      }

      private int curMood_ ;
      /**
       * <code>int32 cur_mood = 9;</code>
       * @return The curMood.
       */
      @java.lang.Override
      public int getCurMood() {
        return curMood_;
      }
      /**
       * <code>int32 cur_mood = 9;</code>
       * @param value The curMood to set.
       * @return This builder for chaining.
       */
      public Builder setCurMood(int value) {
        
        curMood_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cur_mood = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurMood() {
        
        curMood_ = 0;
        onChanged();
        return this;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargain_id = 15;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargain_id = 15;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargain_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        
        bargainId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BargainSnapshot)
    }

    // @@protoc_insertion_point(class_scope:BargainSnapshot)
    private static final emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot();
    }

    public static emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainSnapshot>
        PARSER = new com.google.protobuf.AbstractParser<BargainSnapshot>() {
      @java.lang.Override
      public BargainSnapshot parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BargainSnapshot(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BargainSnapshot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainSnapshot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainSnapshot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainSnapshot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BargainSnapshot.proto\"a\n\017BargainSnapsh" +
      "ot\022\023\n\013IOCNPJJNHLD\030\014 \001(\r\022\023\n\013BALOPACHCDB\030\002" +
      " \001(\r\022\020\n\010cur_mood\030\t \001(\005\022\022\n\nbargain_id\030\017 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BargainSnapshot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainSnapshot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainSnapshot_descriptor,
        new java.lang.String[] { "IOCNPJJNHLD", "BALOPACHCDB", "CurMood", "BargainId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
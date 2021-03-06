// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conf.proto

package io.opentelemetry.proto.controller.resource.config;

/**
 * Protobuf type {@code opentelemetry.proto.controller.resource.config.SpanProcessorConfig}
 */
public final class SpanProcessorConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.controller.resource.config.SpanProcessorConfig)
    SpanProcessorConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpanProcessorConfig.newBuilder() to construct.
  private SpanProcessorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpanProcessorConfig() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpanProcessorConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpanProcessorConfig(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            scheduleDelay_ = input.readInt32();
            break;
          }
          case 24: {

            maxQueueSize_ = input.readInt32();
            break;
          }
          case 32: {

            exportBatchSize_ = input.readInt32();
            break;
          }
          case 40: {

            exportTimeout_ = input.readInt32();
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
    return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.class, io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEDULEDELAY_FIELD_NUMBER = 2;
  private int scheduleDelay_;
  /**
   * <code>int32 scheduleDelay = 2;</code>
   * @return The scheduleDelay.
   */
  @java.lang.Override
  public int getScheduleDelay() {
    return scheduleDelay_;
  }

  public static final int MAXQUEUESIZE_FIELD_NUMBER = 3;
  private int maxQueueSize_;
  /**
   * <code>int32 maxQueueSize = 3;</code>
   * @return The maxQueueSize.
   */
  @java.lang.Override
  public int getMaxQueueSize() {
    return maxQueueSize_;
  }

  public static final int EXPORTBATCHSIZE_FIELD_NUMBER = 4;
  private int exportBatchSize_;
  /**
   * <code>int32 exportBatchSize = 4;</code>
   * @return The exportBatchSize.
   */
  @java.lang.Override
  public int getExportBatchSize() {
    return exportBatchSize_;
  }

  public static final int EXPORTTIMEOUT_FIELD_NUMBER = 5;
  private int exportTimeout_;
  /**
   * <code>int32 exportTimeout = 5;</code>
   * @return The exportTimeout.
   */
  @java.lang.Override
  public int getExportTimeout() {
    return exportTimeout_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (scheduleDelay_ != 0) {
      output.writeInt32(2, scheduleDelay_);
    }
    if (maxQueueSize_ != 0) {
      output.writeInt32(3, maxQueueSize_);
    }
    if (exportBatchSize_ != 0) {
      output.writeInt32(4, exportBatchSize_);
    }
    if (exportTimeout_ != 0) {
      output.writeInt32(5, exportTimeout_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (scheduleDelay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, scheduleDelay_);
    }
    if (maxQueueSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxQueueSize_);
    }
    if (exportBatchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, exportBatchSize_);
    }
    if (exportTimeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, exportTimeout_);
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
    if (!(obj instanceof io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig other = (io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getScheduleDelay()
        != other.getScheduleDelay()) return false;
    if (getMaxQueueSize()
        != other.getMaxQueueSize()) return false;
    if (getExportBatchSize()
        != other.getExportBatchSize()) return false;
    if (getExportTimeout()
        != other.getExportTimeout()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SCHEDULEDELAY_FIELD_NUMBER;
    hash = (53 * hash) + getScheduleDelay();
    hash = (37 * hash) + MAXQUEUESIZE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxQueueSize();
    hash = (37 * hash) + EXPORTBATCHSIZE_FIELD_NUMBER;
    hash = (53 * hash) + getExportBatchSize();
    hash = (37 * hash) + EXPORTTIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getExportTimeout();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parseFrom(
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
  public static Builder newBuilder(io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig prototype) {
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
   * Protobuf type {@code opentelemetry.proto.controller.resource.config.SpanProcessorConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.controller.resource.config.SpanProcessorConfig)
      io.opentelemetry.proto.controller.resource.config.SpanProcessorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.class, io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.Builder.class);
    }

    // Construct using io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.newBuilder()
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
      name_ = "";

      scheduleDelay_ = 0;

      maxQueueSize_ = 0;

      exportBatchSize_ = 0;

      exportTimeout_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig getDefaultInstanceForType() {
      return io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig build() {
      io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig buildPartial() {
      io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig result = new io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig(this);
      result.name_ = name_;
      result.scheduleDelay_ = scheduleDelay_;
      result.maxQueueSize_ = maxQueueSize_;
      result.exportBatchSize_ = exportBatchSize_;
      result.exportTimeout_ = exportTimeout_;
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
      if (other instanceof io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig) {
        return mergeFrom((io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig other) {
      if (other == io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getScheduleDelay() != 0) {
        setScheduleDelay(other.getScheduleDelay());
      }
      if (other.getMaxQueueSize() != 0) {
        setMaxQueueSize(other.getMaxQueueSize());
      }
      if (other.getExportBatchSize() != 0) {
        setExportBatchSize(other.getExportBatchSize());
      }
      if (other.getExportTimeout() != 0) {
        setExportTimeout(other.getExportTimeout());
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
      io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int scheduleDelay_ ;
    /**
     * <code>int32 scheduleDelay = 2;</code>
     * @return The scheduleDelay.
     */
    @java.lang.Override
    public int getScheduleDelay() {
      return scheduleDelay_;
    }
    /**
     * <code>int32 scheduleDelay = 2;</code>
     * @param value The scheduleDelay to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleDelay(int value) {
      
      scheduleDelay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 scheduleDelay = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduleDelay() {
      
      scheduleDelay_ = 0;
      onChanged();
      return this;
    }

    private int maxQueueSize_ ;
    /**
     * <code>int32 maxQueueSize = 3;</code>
     * @return The maxQueueSize.
     */
    @java.lang.Override
    public int getMaxQueueSize() {
      return maxQueueSize_;
    }
    /**
     * <code>int32 maxQueueSize = 3;</code>
     * @param value The maxQueueSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxQueueSize(int value) {
      
      maxQueueSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 maxQueueSize = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxQueueSize() {
      
      maxQueueSize_ = 0;
      onChanged();
      return this;
    }

    private int exportBatchSize_ ;
    /**
     * <code>int32 exportBatchSize = 4;</code>
     * @return The exportBatchSize.
     */
    @java.lang.Override
    public int getExportBatchSize() {
      return exportBatchSize_;
    }
    /**
     * <code>int32 exportBatchSize = 4;</code>
     * @param value The exportBatchSize to set.
     * @return This builder for chaining.
     */
    public Builder setExportBatchSize(int value) {
      
      exportBatchSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 exportBatchSize = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExportBatchSize() {
      
      exportBatchSize_ = 0;
      onChanged();
      return this;
    }

    private int exportTimeout_ ;
    /**
     * <code>int32 exportTimeout = 5;</code>
     * @return The exportTimeout.
     */
    @java.lang.Override
    public int getExportTimeout() {
      return exportTimeout_;
    }
    /**
     * <code>int32 exportTimeout = 5;</code>
     * @param value The exportTimeout to set.
     * @return This builder for chaining.
     */
    public Builder setExportTimeout(int value) {
      
      exportTimeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 exportTimeout = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearExportTimeout() {
      
      exportTimeout_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.controller.resource.config.SpanProcessorConfig)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.controller.resource.config.SpanProcessorConfig)
  private static final io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig();
  }

  public static io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpanProcessorConfig>
      PARSER = new com.google.protobuf.AbstractParser<SpanProcessorConfig>() {
    @java.lang.Override
    public SpanProcessorConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpanProcessorConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpanProcessorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpanProcessorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


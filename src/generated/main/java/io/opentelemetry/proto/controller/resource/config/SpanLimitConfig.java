// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conf.proto

package io.opentelemetry.proto.controller.resource.config;

/**
 * Protobuf type {@code opentelemetry.proto.controller.resource.config.SpanLimitConfig}
 */
public final class SpanLimitConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.controller.resource.config.SpanLimitConfig)
    SpanLimitConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpanLimitConfig.newBuilder() to construct.
  private SpanLimitConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpanLimitConfig() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpanLimitConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpanLimitConfig(
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

            attributeCountLimit_ = input.readInt32();
            break;
          }
          case 24: {

            attributeCountPerEventLimit_ = input.readInt32();
            break;
          }
          case 32: {

            attributeCountPerLinkLimit_ = input.readInt32();
            break;
          }
          case 40: {

            eventCountLimit_ = input.readInt32();
            break;
          }
          case 48: {

            linkCountLimit_ = input.readInt32();
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
    return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.class, io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.Builder.class);
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

  public static final int ATTRIBUTECOUNTLIMIT_FIELD_NUMBER = 2;
  private int attributeCountLimit_;
  /**
   * <code>int32 attributeCountLimit = 2;</code>
   * @return The attributeCountLimit.
   */
  @java.lang.Override
  public int getAttributeCountLimit() {
    return attributeCountLimit_;
  }

  public static final int ATTRIBUTECOUNTPEREVENTLIMIT_FIELD_NUMBER = 3;
  private int attributeCountPerEventLimit_;
  /**
   * <code>int32 attributeCountPerEventLimit = 3;</code>
   * @return The attributeCountPerEventLimit.
   */
  @java.lang.Override
  public int getAttributeCountPerEventLimit() {
    return attributeCountPerEventLimit_;
  }

  public static final int ATTRIBUTECOUNTPERLINKLIMIT_FIELD_NUMBER = 4;
  private int attributeCountPerLinkLimit_;
  /**
   * <code>int32 attributeCountPerLinkLimit = 4;</code>
   * @return The attributeCountPerLinkLimit.
   */
  @java.lang.Override
  public int getAttributeCountPerLinkLimit() {
    return attributeCountPerLinkLimit_;
  }

  public static final int EVENTCOUNTLIMIT_FIELD_NUMBER = 5;
  private int eventCountLimit_;
  /**
   * <code>int32 eventCountLimit = 5;</code>
   * @return The eventCountLimit.
   */
  @java.lang.Override
  public int getEventCountLimit() {
    return eventCountLimit_;
  }

  public static final int LINKCOUNTLIMIT_FIELD_NUMBER = 6;
  private int linkCountLimit_;
  /**
   * <code>int32 linkCountLimit = 6;</code>
   * @return The linkCountLimit.
   */
  @java.lang.Override
  public int getLinkCountLimit() {
    return linkCountLimit_;
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
    if (attributeCountLimit_ != 0) {
      output.writeInt32(2, attributeCountLimit_);
    }
    if (attributeCountPerEventLimit_ != 0) {
      output.writeInt32(3, attributeCountPerEventLimit_);
    }
    if (attributeCountPerLinkLimit_ != 0) {
      output.writeInt32(4, attributeCountPerLinkLimit_);
    }
    if (eventCountLimit_ != 0) {
      output.writeInt32(5, eventCountLimit_);
    }
    if (linkCountLimit_ != 0) {
      output.writeInt32(6, linkCountLimit_);
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
    if (attributeCountLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, attributeCountLimit_);
    }
    if (attributeCountPerEventLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, attributeCountPerEventLimit_);
    }
    if (attributeCountPerLinkLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, attributeCountPerLinkLimit_);
    }
    if (eventCountLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, eventCountLimit_);
    }
    if (linkCountLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, linkCountLimit_);
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
    if (!(obj instanceof io.opentelemetry.proto.controller.resource.config.SpanLimitConfig)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.controller.resource.config.SpanLimitConfig other = (io.opentelemetry.proto.controller.resource.config.SpanLimitConfig) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getAttributeCountLimit()
        != other.getAttributeCountLimit()) return false;
    if (getAttributeCountPerEventLimit()
        != other.getAttributeCountPerEventLimit()) return false;
    if (getAttributeCountPerLinkLimit()
        != other.getAttributeCountPerLinkLimit()) return false;
    if (getEventCountLimit()
        != other.getEventCountLimit()) return false;
    if (getLinkCountLimit()
        != other.getLinkCountLimit()) return false;
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
    hash = (37 * hash) + ATTRIBUTECOUNTLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeCountLimit();
    hash = (37 * hash) + ATTRIBUTECOUNTPEREVENTLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeCountPerEventLimit();
    hash = (37 * hash) + ATTRIBUTECOUNTPERLINKLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeCountPerLinkLimit();
    hash = (37 * hash) + EVENTCOUNTLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getEventCountLimit();
    hash = (37 * hash) + LINKCOUNTLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLinkCountLimit();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parseFrom(
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
  public static Builder newBuilder(io.opentelemetry.proto.controller.resource.config.SpanLimitConfig prototype) {
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
   * Protobuf type {@code opentelemetry.proto.controller.resource.config.SpanLimitConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.controller.resource.config.SpanLimitConfig)
      io.opentelemetry.proto.controller.resource.config.SpanLimitConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.class, io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.Builder.class);
    }

    // Construct using io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.newBuilder()
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

      attributeCountLimit_ = 0;

      attributeCountPerEventLimit_ = 0;

      attributeCountPerLinkLimit_ = 0;

      eventCountLimit_ = 0;

      linkCountLimit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentelemetry.proto.controller.resource.config.Conf.internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.controller.resource.config.SpanLimitConfig getDefaultInstanceForType() {
      return io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.controller.resource.config.SpanLimitConfig build() {
      io.opentelemetry.proto.controller.resource.config.SpanLimitConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.controller.resource.config.SpanLimitConfig buildPartial() {
      io.opentelemetry.proto.controller.resource.config.SpanLimitConfig result = new io.opentelemetry.proto.controller.resource.config.SpanLimitConfig(this);
      result.name_ = name_;
      result.attributeCountLimit_ = attributeCountLimit_;
      result.attributeCountPerEventLimit_ = attributeCountPerEventLimit_;
      result.attributeCountPerLinkLimit_ = attributeCountPerLinkLimit_;
      result.eventCountLimit_ = eventCountLimit_;
      result.linkCountLimit_ = linkCountLimit_;
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
      if (other instanceof io.opentelemetry.proto.controller.resource.config.SpanLimitConfig) {
        return mergeFrom((io.opentelemetry.proto.controller.resource.config.SpanLimitConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.controller.resource.config.SpanLimitConfig other) {
      if (other == io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAttributeCountLimit() != 0) {
        setAttributeCountLimit(other.getAttributeCountLimit());
      }
      if (other.getAttributeCountPerEventLimit() != 0) {
        setAttributeCountPerEventLimit(other.getAttributeCountPerEventLimit());
      }
      if (other.getAttributeCountPerLinkLimit() != 0) {
        setAttributeCountPerLinkLimit(other.getAttributeCountPerLinkLimit());
      }
      if (other.getEventCountLimit() != 0) {
        setEventCountLimit(other.getEventCountLimit());
      }
      if (other.getLinkCountLimit() != 0) {
        setLinkCountLimit(other.getLinkCountLimit());
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
      io.opentelemetry.proto.controller.resource.config.SpanLimitConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.controller.resource.config.SpanLimitConfig) e.getUnfinishedMessage();
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

    private int attributeCountLimit_ ;
    /**
     * <code>int32 attributeCountLimit = 2;</code>
     * @return The attributeCountLimit.
     */
    @java.lang.Override
    public int getAttributeCountLimit() {
      return attributeCountLimit_;
    }
    /**
     * <code>int32 attributeCountLimit = 2;</code>
     * @param value The attributeCountLimit to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeCountLimit(int value) {
      
      attributeCountLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 attributeCountLimit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeCountLimit() {
      
      attributeCountLimit_ = 0;
      onChanged();
      return this;
    }

    private int attributeCountPerEventLimit_ ;
    /**
     * <code>int32 attributeCountPerEventLimit = 3;</code>
     * @return The attributeCountPerEventLimit.
     */
    @java.lang.Override
    public int getAttributeCountPerEventLimit() {
      return attributeCountPerEventLimit_;
    }
    /**
     * <code>int32 attributeCountPerEventLimit = 3;</code>
     * @param value The attributeCountPerEventLimit to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeCountPerEventLimit(int value) {
      
      attributeCountPerEventLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 attributeCountPerEventLimit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeCountPerEventLimit() {
      
      attributeCountPerEventLimit_ = 0;
      onChanged();
      return this;
    }

    private int attributeCountPerLinkLimit_ ;
    /**
     * <code>int32 attributeCountPerLinkLimit = 4;</code>
     * @return The attributeCountPerLinkLimit.
     */
    @java.lang.Override
    public int getAttributeCountPerLinkLimit() {
      return attributeCountPerLinkLimit_;
    }
    /**
     * <code>int32 attributeCountPerLinkLimit = 4;</code>
     * @param value The attributeCountPerLinkLimit to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeCountPerLinkLimit(int value) {
      
      attributeCountPerLinkLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 attributeCountPerLinkLimit = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeCountPerLinkLimit() {
      
      attributeCountPerLinkLimit_ = 0;
      onChanged();
      return this;
    }

    private int eventCountLimit_ ;
    /**
     * <code>int32 eventCountLimit = 5;</code>
     * @return The eventCountLimit.
     */
    @java.lang.Override
    public int getEventCountLimit() {
      return eventCountLimit_;
    }
    /**
     * <code>int32 eventCountLimit = 5;</code>
     * @param value The eventCountLimit to set.
     * @return This builder for chaining.
     */
    public Builder setEventCountLimit(int value) {
      
      eventCountLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 eventCountLimit = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventCountLimit() {
      
      eventCountLimit_ = 0;
      onChanged();
      return this;
    }

    private int linkCountLimit_ ;
    /**
     * <code>int32 linkCountLimit = 6;</code>
     * @return The linkCountLimit.
     */
    @java.lang.Override
    public int getLinkCountLimit() {
      return linkCountLimit_;
    }
    /**
     * <code>int32 linkCountLimit = 6;</code>
     * @param value The linkCountLimit to set.
     * @return This builder for chaining.
     */
    public Builder setLinkCountLimit(int value) {
      
      linkCountLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 linkCountLimit = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLinkCountLimit() {
      
      linkCountLimit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.controller.resource.config.SpanLimitConfig)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.controller.resource.config.SpanLimitConfig)
  private static final io.opentelemetry.proto.controller.resource.config.SpanLimitConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.controller.resource.config.SpanLimitConfig();
  }

  public static io.opentelemetry.proto.controller.resource.config.SpanLimitConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpanLimitConfig>
      PARSER = new com.google.protobuf.AbstractParser<SpanLimitConfig>() {
    @java.lang.Override
    public SpanLimitConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpanLimitConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpanLimitConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpanLimitConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.controller.resource.config.SpanLimitConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


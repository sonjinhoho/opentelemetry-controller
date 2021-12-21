// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conf.proto

package io.opentelemetry.proto.controller.resource.config;

public interface SpanLimitConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.controller.resource.config.SpanLimitConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 attributeCountLimit = 2;</code>
   * @return The attributeCountLimit.
   */
  int getAttributeCountLimit();

  /**
   * <code>int32 attributeCountPerEventLimit = 3;</code>
   * @return The attributeCountPerEventLimit.
   */
  int getAttributeCountPerEventLimit();

  /**
   * <code>int32 attributeCountPerLinkLimit = 4;</code>
   * @return The attributeCountPerLinkLimit.
   */
  int getAttributeCountPerLinkLimit();

  /**
   * <code>int32 eventCountLimit = 5;</code>
   * @return The eventCountLimit.
   */
  int getEventCountLimit();

  /**
   * <code>int32 linkCountLimit = 6;</code>
   * @return The linkCountLimit.
   */
  int getLinkCountLimit();
}

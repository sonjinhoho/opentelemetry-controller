// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conf.proto

package io.opentelemetry.proto.controller.resource.config;

public interface SpanProcessorConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.controller.resource.config.SpanProcessorConfig)
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
   * <code>int32 scheduleDelay = 2;</code>
   * @return The scheduleDelay.
   */
  int getScheduleDelay();

  /**
   * <code>int32 maxQueueSize = 3;</code>
   * @return The maxQueueSize.
   */
  int getMaxQueueSize();

  /**
   * <code>int32 exportBatchSize = 4;</code>
   * @return The exportBatchSize.
   */
  int getExportBatchSize();

  /**
   * <code>int32 exportTimeout = 5;</code>
   * @return The exportTimeout.
   */
  int getExportTimeout();
}

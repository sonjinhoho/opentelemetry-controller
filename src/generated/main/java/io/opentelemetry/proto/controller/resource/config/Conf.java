// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conf.proto

package io.opentelemetry.proto.controller.resource.config;

public final class Conf {
  private Conf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_ConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_ConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_TraceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_TraceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_MetricConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_MetricConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nconf.proto\022.opentelemetry.proto.contro" +
      "ller.resource.config\"+\n\rConfigRequest\022\014\n" +
      "\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\"\343\002\n\037TelemetryR" +
      "esourceConfigResponse\022s\n\nattributes\030\001 \003(" +
      "\0132_.opentelemetry.proto.controller.resou" +
      "rce.config.TelemetryResourceConfigRespon" +
      "se.AttributesEntry\022J\n\005trace\030\002 \001(\0132;.open" +
      "telemetry.proto.controller.resource.conf" +
      "ig.TraceConfig\022L\n\006metric\030\003 \001(\0132<.opentel" +
      "emetry.proto.controller.resource.config." +
      "MetricConfig\0321\n\017AttributesEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\247\001\n\016ResourceConf" +
      "ig\022b\n\nattributes\030\001 \003(\0132N.opentelemetry.p" +
      "roto.controller.resource.config.Resource" +
      "Config.AttributesEntry\0321\n\017AttributesEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\244\001\n\013Tr" +
      "aceConfig\022\020\n\010exporter\030\001 \001(\t\022\020\n\010endPoint\030" +
      "\002 \001(\t\022\023\n\013certificate\030\003 \001(\t\022\017\n\007headers\030\004 " +
      "\001(\t\022\023\n\013compression\030\005 \001(\t\022\017\n\007timeout\030\006 \001(" +
      "\t\022\020\n\010protocol\030\007 \001(\t\022\023\n\013propagation\030\010 \001(\t" +
      "\"\245\001\n\014MetricConfig\022\020\n\010exporter\030\001 \001(\t\022\020\n\010e" +
      "ndPoint\030\002 \001(\t\022\023\n\013certificate\030\003 \001(\t\022\017\n\007he" +
      "aders\030\004 \001(\t\022\023\n\013compression\030\005 \001(\t\022\017\n\007time" +
      "out\030\006 \001(\t\022\020\n\010protocol\030\007 \001(\t\022\023\n\013propagati" +
      "on\030\010 \001(\t\"\266\001\n\017SpanLimitConfig\022\014\n\004name\030\001 \001" +
      "(\t\022\033\n\023attributeCountLimit\030\002 \001(\005\022#\n\033attri" +
      "buteCountPerEventLimit\030\003 \001(\005\022\"\n\032attribut" +
      "eCountPerLinkLimit\030\004 \001(\005\022\027\n\017eventCountLi" +
      "mit\030\005 \001(\005\022\026\n\016linkCountLimit\030\006 \001(\005\"\200\001\n\023Sp" +
      "anProcessorConfig\022\014\n\004name\030\001 \001(\t\022\025\n\rsched" +
      "uleDelay\030\002 \001(\005\022\024\n\014maxQueueSize\030\003 \001(\005\022\027\n\017" +
      "exportBatchSize\030\004 \001(\005\022\025\n\rexportTimeout\030\005" +
      " \001(\0052\256\001\n\025ResourceConfigService\022\224\001\n\021Resou" +
      "rceConfigRPC\022=.opentelemetry.proto.contr" +
      "oller.resource.config.ConfigRequest\032>.op" +
      "entelemetry.proto.controller.resource.co" +
      "nfig.ResourceConfig\"\0002\245\001\n\022TraceConfigSer" +
      "vice\022\216\001\n\016TraceConfigRPC\022=.opentelemetry." +
      "proto.controller.resource.config.ConfigR" +
      "equest\032;.opentelemetry.proto.controller." +
      "resource.config.TraceConfig\"\0002\250\001\n\023Metric" +
      "ConfigService\022\220\001\n\017MetricConfigRPC\022=.open" +
      "telemetry.proto.controller.resource.conf" +
      "ig.ConfigRequest\032<.opentelemetry.proto.c" +
      "ontroller.resource.config.MetricConfig\"\000" +
      "2\261\001\n\026SpanLimitConfigService\022\226\001\n\022SpanLimi" +
      "tConfigRPC\022=.opentelemetry.proto.control" +
      "ler.resource.config.ConfigRequest\032?.open" +
      "telemetry.proto.controller.resource.conf" +
      "ig.SpanLimitConfig\"\0002\275\001\n\032SpanProcessorCo" +
      "nfigService\022\236\001\n\026SpanProcessorConfigRPC\022=" +
      ".opentelemetry.proto.controller.resource" +
      ".config.ConfigRequest\032C.opentelemetry.pr" +
      "oto.controller.resource.config.SpanProce" +
      "ssorConfig\"\000B5\n1io.opentelemetry.proto.c" +
      "ontroller.resource.configP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opentelemetry_proto_controller_resource_config_ConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_controller_resource_config_ConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_ConfigRequest_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_descriptor,
        new java.lang.String[] { "Attributes", "Trace", "Metric", });
    internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_AttributesEntry_descriptor =
      internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_descriptor.getNestedTypes().get(0);
    internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_TelemetryResourceConfigResponse_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_descriptor,
        new java.lang.String[] { "Attributes", });
    internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_AttributesEntry_descriptor =
      internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_descriptor.getNestedTypes().get(0);
    internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_ResourceConfig_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_opentelemetry_proto_controller_resource_config_TraceConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opentelemetry_proto_controller_resource_config_TraceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_TraceConfig_descriptor,
        new java.lang.String[] { "Exporter", "EndPoint", "Certificate", "Headers", "Compression", "Timeout", "Protocol", "Propagation", });
    internal_static_opentelemetry_proto_controller_resource_config_MetricConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opentelemetry_proto_controller_resource_config_MetricConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_MetricConfig_descriptor,
        new java.lang.String[] { "Exporter", "EndPoint", "Certificate", "Headers", "Compression", "Timeout", "Protocol", "Propagation", });
    internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_SpanLimitConfig_descriptor,
        new java.lang.String[] { "Name", "AttributeCountLimit", "AttributeCountPerEventLimit", "AttributeCountPerLinkLimit", "EventCountLimit", "LinkCountLimit", });
    internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_controller_resource_config_SpanProcessorConfig_descriptor,
        new java.lang.String[] { "Name", "ScheduleDelay", "MaxQueueSize", "ExportBatchSize", "ExportTimeout", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

package io.opentelemetry.controller.entity;

import io.opentelemetry.controller.entity.exporter.MetricConfiguration;
import io.opentelemetry.controller.entity.exporter.TraceConfiguration;
import io.opentelemetry.controller.entity.resource.ResourceConfiguration;
import io.opentelemetry.controller.entity.span.SpanLimitConfiguration;
import io.opentelemetry.controller.entity.span.SpanProcessorConfiguration;
import java.util.HashMap;

public enum DEFAULT {

  INSTANCE;

  public SpanLimitConfiguration DEFAULT_SPANLIMIT = SpanLimitConfiguration.builder()
      .name("default")
      .type("default")
      .attributeCountLimit(128)
      .attributeCountPerLinkLimit(32)
      .attributeCountPerEventLimit(32)
      .eventCountLimit(128)
      .linkCountLimit(128)
      .build();

  public SpanProcessorConfiguration DEFAULT_SPANPRCESSOR = SpanProcessorConfiguration.builder()
      .name("default")
      .type("default")
      .scheduleDelay(5000)
      .maxQueueSize(2048)
      .exportBatchSize(512)
      .exportTimeout(30000)
      .build();

  public TraceConfiguration DEFAULT_TRACE = TraceConfiguration.builder()
      .traceExporter("otlp")
      .traceEndPoint("http://localhost:4318/v1/traces")
      .traceCertificate("")
      .traceHeaders("")
      .traceCompression("")
      .traceTimeout("10000")
      .traceProtocol("grpc")
      .propagation("tracecontext")
      .build();

  public ResourceConfiguration DEFAULT_RESOURCE = ResourceConfiguration.builder()
      .name("default")
      .type("default")
      .attributes(new HashMap<>())
      .build();

  public MetricConfiguration DEFAULT_METRIC = MetricConfiguration.builder()
      .metricExporter("otlp")
      .metricEndPoint("http://localhost:4318/v1/metrics")
      .metricCertificate("")
      .metricHeaders("")
      .metricCompression("")
      .metricTimeout("10000")
      .metricProtocol("grpc")
      .build();
}

package io.opentelemetry.controller.configuration.exporter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExporterConfiguration {

  //system porperty

  public static final String OTEL_TRACES_EXPORTER = "otel.traces.exporter";

  public static final String OTEL_METRICS_EXPORTER = "otel.metrics.exporter";

  public static final String EXPORTER_PREFIX = "otel.exporter.";

  public static final String OTEL_EXPORTER_PREFIX = EXPORTER_PREFIX + "otlp.";

  public static final String OTEL_EXPORTER_OTLP_ENDPOINT = OTEL_EXPORTER_PREFIX + "endpoint";

  public static final String OTEL_EXPORTER_OTLP_TRACES_ENDPOINT =
      OTEL_EXPORTER_PREFIX + "traces.endpoint";

  public static final String OTEL_EXPORTER_OTLP_METRICS_ENDPOINT =
      OTEL_EXPORTER_PREFIX + "metrics.endpoint";

  public static final String OTEL_EXPORTER_OTLP_CERTIFICATE = OTEL_EXPORTER_PREFIX + "certificate";

  public static final String OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE =
      OTEL_EXPORTER_PREFIX + "traces.certificate";

  public static final String OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE =
      OTEL_EXPORTER_PREFIX + "metrics.certificate";

  public static final String OTEL_EXPORTER_OTLP_HEADERS = OTEL_EXPORTER_PREFIX + "headers";

  public static final String OTEL_EXPORTER_OTLP_TRACES_HEADERS =
      OTEL_EXPORTER_PREFIX + "traces.headers";

  public static final String OTEL_EXPORTER_OTLP_METRICS_HEADERS =
      OTEL_EXPORTER_PREFIX + "metrics.headers";

  public static final String OTEL_EXPORTER_OTLP_COMPRESSION = OTEL_EXPORTER_PREFIX + "compression";

  public static final String OTEL_EXPORTER_OTLP_TRACES_COMPRESSION =
      OTEL_EXPORTER_PREFIX + "traces.compression";

  public static final String OTEL_EXPORTER_OTLP_METRICS_COMPRESSION =
      OTEL_EXPORTER_PREFIX + "metrics.compression";

  public static final String OTEL_EXPORTER_OTLP_TIMEOUT = OTEL_EXPORTER_PREFIX + "timeout";

  public static final String OTEL_EXPORTER_OTLP_TRACES_TIMEOUT =
      OTEL_EXPORTER_PREFIX + "traces.timeout";

  public static final String OTEL_EXPORTER_OTLP_METRICS_TIMEOUT =
      OTEL_EXPORTER_PREFIX + "metrics.timeout";

  public static final String OTEL_EXPORTER_OTLP_PROTOCOL = OTEL_EXPORTER_PREFIX + "protocol";

  public static final String OTEL_EXPORTER_OTLP_TRACES_PROTOCOL =
      OTEL_EXPORTER_PREFIX + "traces.protocol";

  public static final String OTEL_EXPORTER_OTLP_METRICS_PROTOCOL =
      OTEL_EXPORTER_PREFIX + "metrics.protocol";

  public static final String OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY =
      OTEL_EXPORTER_PREFIX + "metrics.temporality";

  public static final String OTEL_EXPERIMENTAL_EXPORTER_OTLP_RETRY_ENABLED =
      "otel.experimental.exporter.otlp.retry.enabled";

  public static final String JAEGER_EXPORTER_PREFIX = EXPORTER_PREFIX + "jaeger.";

  public static final String OTEL_EXPORTER_JAEGER_ENDPOINT = JAEGER_EXPORTER_PREFIX + "endpoint";

  public static final String OTEL_EXPORTER_JAEGER_TIMEOUT = JAEGER_EXPORTER_PREFIX + "timeout";

  public static final String ZIPKIN_EXPORTER_PREFIX = EXPORTER_PREFIX + "zipkin.";

  public static final String OTEL_EXPORTER_ZIPKIN_ENDPOINT = ZIPKIN_EXPORTER_PREFIX + "endpoint";

  public static final String PROMETHEUS_EXPORTER_PREFIX = EXPORTER_PREFIX + "prometheus.";

  public static final String OTEL_EXPORTER_PROMETHEUS_PORT = PROMETHEUS_EXPORTER_PREFIX + "port";

  public static final String OTEL_EXPORTER_PROMETHEUS_HOST = PROMETHEUS_EXPORTER_PREFIX + "host";

  public static final String OTEL_EXPORTER_LOGGING_PREFIX = EXPORTER_PREFIX + "logging.prefix";

  public enum Propagation {

    W3C_TRACE_CONTEXT,

    W3C_BAGGAGE,

    B3_SINGLE,

    B3_MULTIPLE,

    JAEGER,

    AWS_X_RAY,

    OTTRACE
  }
}

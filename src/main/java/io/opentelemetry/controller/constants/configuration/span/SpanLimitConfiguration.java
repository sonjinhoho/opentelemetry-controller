package io.opentelemetry.controller.constants.configuration.span;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpanLimitConfiguration {

  public static final String OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT = "otel.span.attribute.value.length.limit";

  public static final String OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT = "otel.span.attribute.count.limit";

  public static final String OTEL_SPAN_EVENT_COUNT_LIMIT = "otel.span.event.count.limit";

  public static final String OTEL_SPAN_LINK_COUNT_LIMIT = "otel.span.link.count.limit";
}

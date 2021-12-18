package io.opentelemetry.controller.configuration.sampler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SamplerConfiguration {

  public static final String OTEL_TRACES_SAMPLER = "otel.traces.sampler";

  public static final String OTEL_TRACES_SAMPLER_ARG = "otel.traces.sampler.arg";

  public enum Sampler {
    always_on,
    always_off,
    traceidratio,
    parentbased_always_on,
    parentbased_always_off,
    parentbased_traceidratio
  }
}

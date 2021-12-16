package io.opentelemetry.controller.dto.configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationDTO {
  private String endPoint;
  private String certificate;
  private String headers;
  private String compression;
  private String timeout;
  private String protocol;

  private TraceConfigurationDTO trace;
  private MetricConfigurationDTO metric;
}


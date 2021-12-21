package io.opentelemetry.controller.dto.exporter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MetricConfigurationDTO{
  private String name;
  private String type;
  private String metricExporter;
  private String metricEndPoint;
  private String metricCertificate;
  private String metricHeaders;
  private String metricCompression;
  private String metricTimeout;
  private String metricProtocol;
}

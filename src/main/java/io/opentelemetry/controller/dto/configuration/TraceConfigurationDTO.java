package io.opentelemetry.controller.dto.configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TraceConfigurationDTO{
  private String traceExporter;
  private String traceEndPoint;
  private String traceCertificate;
  private String traceHeaders;
  private String traceCompression;
  private String traceTimeout;
  private String traceProtocol;
  private String propagation;
}

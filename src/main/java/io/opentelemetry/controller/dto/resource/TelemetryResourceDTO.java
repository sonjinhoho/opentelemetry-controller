package io.opentelemetry.controller.dto.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetryResourceDTO {
  private String serviceName;
  private String serviceNamespace;
  private String serviceInstanceId;
  private String serviceVersion;
}

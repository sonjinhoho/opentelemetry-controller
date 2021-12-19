package io.opentelemetry.controller.dto.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetryDeviceDTO {
  private String id;
  private String modelIdentifier;
  private String modelName;
  private String manufacturer;
}

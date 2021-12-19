package io.opentelemetry.controller.dto.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetryOsDTO {
  private String type;
  private String description;
  private String name;
  private String version;
}

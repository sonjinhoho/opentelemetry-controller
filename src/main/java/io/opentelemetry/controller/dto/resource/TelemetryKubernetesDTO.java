package io.opentelemetry.controller.dto.resource;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetryKubernetesDTO {
  private String type;
  private Map<String, String> attribute;
}

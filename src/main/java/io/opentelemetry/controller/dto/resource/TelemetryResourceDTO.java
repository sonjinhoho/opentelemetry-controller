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
public class TelemetryResourceDTO {
  private String name;
  private String type;
  private Map<String, String> attributes;
}

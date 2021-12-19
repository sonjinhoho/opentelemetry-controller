package io.opentelemetry.controller.dto.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetryHostDTO {
  private String id;
  private String name;
  private String type;
  private String arch;
  private String imageName;
  private String imageId;
  private String imageVersion;
}

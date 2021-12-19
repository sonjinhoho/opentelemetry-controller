package io.opentelemetry.controller.dto.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetryCloudDTO {
  private String provider;
  private String accountId;
  private String region;
  private String availabilityZone;
  private String platform;
}

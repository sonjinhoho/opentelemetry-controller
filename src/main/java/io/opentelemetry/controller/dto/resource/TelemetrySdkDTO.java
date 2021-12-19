package io.opentelemetry.controller.dto.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelemetrySdkDTO {
  private String sdkName;
  private String sdkLang;
  private String sdkVersion;
  private String autoVersion;
}

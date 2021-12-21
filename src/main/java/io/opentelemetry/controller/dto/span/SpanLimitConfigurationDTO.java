package io.opentelemetry.controller.dto.span;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpanLimitConfigurationDTO {
  private String name;
  private String type;
  @Default
  private Integer attributeCountLimit = 128;
  @Default
  private Integer attributeCountPerEventLimit = 128;
  @Default
  private Integer attributeCountPerLinkLimit = 128;
  @Default
  private Integer eventCountLimit = 128;
  @Default
  private Integer linkCountLimit = 128;
}

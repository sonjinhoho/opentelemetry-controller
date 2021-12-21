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
public class SpanProcessorConfigurationDTO {
  private String name;
  private String type;
  @Default
  private Integer scheduleDelay = 5000;
  @Default
  private Integer maxQueueSize = 2048;
  @Default
  private Integer exportBatchSize = 512;
  @Default
  private Integer exportTimeout = 30000;
}

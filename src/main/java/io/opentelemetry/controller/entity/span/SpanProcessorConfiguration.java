package io.opentelemetry.controller.entity.span;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpanProcessorConfiguration {

  @Id
  @Column(name = "name", nullable = false)
  private String name;
  private LocalDateTime time;
  private Integer scheduleDelay;
  private Integer maxQueueSize;
  private Integer exportBatchSize;
  private Integer exportTimeout;

}

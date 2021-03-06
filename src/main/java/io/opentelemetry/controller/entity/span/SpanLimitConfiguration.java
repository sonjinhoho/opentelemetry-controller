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
public class SpanLimitConfiguration {

  @Id
  @Column(name = "name", nullable = false)
  private String name;
  private String type;
  private LocalDateTime time;
  private Integer attributeCountLimit;
  private Integer attributeCountPerEventLimit;
  private Integer attributeCountPerLinkLimit;
  private Integer eventCountLimit;
  private Integer linkCountLimit;

}

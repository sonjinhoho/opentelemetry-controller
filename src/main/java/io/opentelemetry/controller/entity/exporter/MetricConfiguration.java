package io.opentelemetry.controller.entity.exporter;

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
public class MetricConfiguration {

  @Id
  @Column(name = "id", nullable = false)
  private String name;
  private String type;
  private LocalDateTime time;
  private String metricExporter;
  private String metricEndPoint;
  private String metricCertificate;
  private String metricHeaders;
  private String metricCompression;
  private String metricTimeout;
  private String metricProtocol;

}

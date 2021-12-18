package io.opentelemetry.controller.entity.configuration;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MetricConfiguration {

  @Id
  @Column(name = "id", nullable = false)
  private String name;
  private LocalDateTime time;
  private String metricExporter;
  private String metricEndPoint;
  private String metricCertificate;
  private String metricHeaders;
  private String metricCompression;
  private String metricTimeout;
  private String metricProtocol;

}

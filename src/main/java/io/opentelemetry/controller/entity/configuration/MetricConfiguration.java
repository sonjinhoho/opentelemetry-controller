package io.opentelemetry.controller.entity.configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Integer id;
  private String metricExporter;
  private String metricEndPoint;
  private String metricCertificate;
  private String metricHeaders;
  private String metricCompression;
  private String metricTimeout;
  private String metricProtocol;

}

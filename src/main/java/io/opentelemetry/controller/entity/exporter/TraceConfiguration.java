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
public class TraceConfiguration {

  @Id
  @Column(name = "id", nullable = false)
  private String name;
  private String type;
  private LocalDateTime time;
  private String traceExporter;
  private String traceEndPoint;
  private String traceCertificate;
  private String traceHeaders;
  private String traceCompression;
  private String traceTimeout;
  private String traceProtocol;
  private String propagation;
}

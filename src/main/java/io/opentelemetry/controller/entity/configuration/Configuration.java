package io.opentelemetry.controller.entity.configuration;

import java.time.LocalDateTime;
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
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {

  @Id
  @Column(name = "name", nullable = false)
  private String name;
  private LocalDateTime time;
  private String endPoint;
  private String certificate;
  private String headers;
  private String compression;
  private String timeout;
  private String protocol;

}

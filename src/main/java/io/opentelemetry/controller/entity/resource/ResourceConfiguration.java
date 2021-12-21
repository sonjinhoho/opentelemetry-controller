package io.opentelemetry.controller.entity.resource;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import java.time.LocalDateTime;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Entity
public class ResourceConfiguration {

  @Id
  @Column(name = "name", nullable = false)
  private String name;
  private LocalDateTime time;
  private String type;
  @Type(type = "json")
  private Map<String, String> attributes;

}

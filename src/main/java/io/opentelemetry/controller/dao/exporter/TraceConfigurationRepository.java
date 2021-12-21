package io.opentelemetry.controller.dao.exporter;

import io.opentelemetry.controller.entity.exporter.TraceConfiguration;
import java.util.Optional;
import javax.swing.text.html.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraceConfigurationRepository extends JpaRepository<TraceConfiguration, String> {
  Optional<TraceConfiguration> findByNameAndType(String name, String type);
}

package io.opentelemetry.controller.dao.exporter;

import io.opentelemetry.controller.entity.exporter.TraceConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraceConfigurationRepository extends JpaRepository<TraceConfiguration, String> {

}

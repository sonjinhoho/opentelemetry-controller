package io.opentelemetry.controller.dao.exporter;

import io.opentelemetry.controller.entity.exporter.MetricConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricConfigurationRepository extends JpaRepository<MetricConfiguration, String> {
  MetricConfiguration findByNameAndType(String name, String type);
}

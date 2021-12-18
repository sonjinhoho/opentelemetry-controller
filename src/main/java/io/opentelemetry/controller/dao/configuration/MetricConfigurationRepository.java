package io.opentelemetry.controller.dao.configuration;

import io.opentelemetry.controller.entity.configuration.MetricConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricConfigurationRepository extends JpaRepository<MetricConfiguration, String> {

}

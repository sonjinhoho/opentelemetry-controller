package io.opentelemetry.controller.dao.configuration;

import io.opentelemetry.controller.entity.configuration.TraceConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraceConfigurationRepository extends JpaRepository<TraceConfiguration, String> {

}

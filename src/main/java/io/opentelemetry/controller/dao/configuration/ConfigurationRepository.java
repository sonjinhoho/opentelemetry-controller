package io.opentelemetry.controller.dao.configuration;

import io.opentelemetry.controller.entity.configuration.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {

}

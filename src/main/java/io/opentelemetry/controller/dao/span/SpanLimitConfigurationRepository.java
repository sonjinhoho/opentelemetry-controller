package io.opentelemetry.controller.dao.span;

import io.opentelemetry.controller.entity.span.SpanLimitConfiguration;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpanLimitConfigurationRepository extends
    JpaRepository<SpanLimitConfiguration, String> {
  Optional<SpanLimitConfiguration> findByNameAndType(String name, String type);
}

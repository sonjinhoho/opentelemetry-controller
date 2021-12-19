package io.opentelemetry.controller.dao.span;

import io.opentelemetry.controller.entity.span.SpanProcessorConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpanProcessorConfigurationRepository extends
    JpaRepository<SpanProcessorConfiguration, String> {

}

package io.opentelemetry.controller.dao.resource;

import io.opentelemetry.controller.entity.resource.TelemetryResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetryResourceRepository extends JpaRepository<TelemetryResource, String> {

}

package io.opentelemetry.controller.dao.resource;

import io.opentelemetry.controller.entity.resource.ResourceConfiguration;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<ResourceConfiguration, String> {

  Optional<ResourceConfiguration> findByNameAndType(String name, String type);

}

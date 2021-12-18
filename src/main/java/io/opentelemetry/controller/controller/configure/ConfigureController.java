package io.opentelemetry.controller.controller.configure;

import io.opentelemetry.controller.dto.configuration.ConfigurationDTO;
import java.util.Collection;
import java.util.Collections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/configuration")
public class ConfigureController {

  @GetMapping
  public Collection<ConfigurationDTO> getConfiguration() {
    return Collections.emptyList();
  }
}

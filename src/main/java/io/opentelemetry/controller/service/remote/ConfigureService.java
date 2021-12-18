package io.opentelemetry.controller.service.remote;

import io.opentelemetry.controller.dto.configuration.ConfigurationDTO;
import java.util.Collection;
import java.util.Collections;
import org.springframework.stereotype.Service;

@Service
public class ConfigureService {

  public Collection<ConfigurationDTO> getConfiguration() {
    return Collections.EMPTY_LIST;
  }

}

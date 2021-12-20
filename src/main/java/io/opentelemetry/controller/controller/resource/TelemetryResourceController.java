package io.opentelemetry.controller.controller.resource;

import io.opentelemetry.controller.dto.resource.TelemetryResourceDTO;
import io.opentelemetry.controller.service.resource.TelemetryResourceService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/telemetryResource")
public class TelemetryResourceController {
  
  private final TelemetryResourceService service;

  public TelemetryResourceController(
      TelemetryResourceService service) {
    this.service = service;
  }

  @GetMapping
  public List<TelemetryResourceDTO> getTelemetryResources() {
    return service.getTelemetryResources();
  }

  @GetMapping("/{name}")
  public TelemetryResourceDTO getTelemetryResource(@PathVariable("name") String name) {
    return service.getTelemetryResource(name);
  }

  @PostMapping
  public boolean saveTelemetryResource(@RequestBody TelemetryResourceDTO dto) {
    service.saveTelemetryResource(dto);
    return true;
  }

  @DeleteMapping("/{name}")
  public boolean deleteTelemetryResource(@PathVariable("name") String name) {
    service.deleteTelemetryResource(name);
    return true;
  }

  @PutMapping
  public boolean updateTelemetryResource(@RequestBody TelemetryResourceDTO dto) {
    service.updateTelemetryResource(dto);
    return true;
  }
}

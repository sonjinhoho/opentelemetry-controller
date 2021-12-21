package io.opentelemetry.controller.controller.resource;

import io.opentelemetry.controller.dto.resource.ResourceDTO;
import io.opentelemetry.controller.service.resource.ResourceService;
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
public class ResourceController {
  
  private final ResourceService service;

  public ResourceController(
      ResourceService service) {
    this.service = service;
  }

  @GetMapping
  public List<ResourceDTO> getResources() {
    return service.getResources();
  }

  @GetMapping("/{name}")
  public ResourceDTO getResource(@PathVariable("name") String name) {
    return service.getResource(name);
  }

  @PostMapping
  public boolean saveResource(@RequestBody ResourceDTO dto) {
    service.saveResource(dto);
    return true;
  }

  @DeleteMapping("/{name}")
  public boolean deleteResource(@PathVariable("name") String name) {
    service.deleteResource(name);
    return true;
  }

  @PutMapping
  public boolean updateResource(@RequestBody ResourceDTO dto) {
    service.updateResource(dto);
    return true;
  }
}

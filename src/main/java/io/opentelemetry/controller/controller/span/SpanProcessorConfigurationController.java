package io.opentelemetry.controller.controller.span;

import io.opentelemetry.controller.dto.span.SpanProcessorConfigurationDTO;
import io.opentelemetry.controller.service.span.SpanProcessorConfigurationService;
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
@RequestMapping("/v1/span/spanprocessor/configure")
public class SpanProcessorConfigurationController {
  
  private final SpanProcessorConfigurationService service;

  public SpanProcessorConfigurationController(
      SpanProcessorConfigurationService service) {
    this.service = service;
  }

  @GetMapping
  public List<SpanProcessorConfigurationDTO> getSpanProcessorConfigurations() {
    return service.getSpanProcessorConfigurations();
  }

  @GetMapping("/{name}")
  public SpanProcessorConfigurationDTO getSpanProcessorConfiguration(@PathVariable("name") String name) {
    return service.getSpanProcessorConfiguration(name);
  }

  @PostMapping
  public boolean saveSpanProcessorConfiguration(@RequestBody SpanProcessorConfigurationDTO dto) {
    service.saveSpanProcessorConfiguration(dto);
    return true;
  }

  @DeleteMapping("/{name}")
  public boolean deleteSpanProcessorConfiguration(@PathVariable("name") String name) {
    service.deleteSpanProcessorConfiguration(name);
    return true;
  }

  @PutMapping
  public boolean updateSpanProcessorConfiguration(@RequestBody SpanProcessorConfigurationDTO dto) {
    service.updateSpanProcessorConfiguration(dto);
    return true;
  }
}

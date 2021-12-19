package io.opentelemetry.controller.controller.span;

import io.opentelemetry.controller.dto.span.SpanLimitConfigurationDTO;
import io.opentelemetry.controller.entity.span.SpanLimitConfiguration;
import io.opentelemetry.controller.service.span.SpanLimitConfigurationService;
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
@RequestMapping("/v1/span/spanlimit/configure")
public class SpanLimitConfigurationController {

  private final SpanLimitConfigurationService service;

  public SpanLimitConfigurationController(
      SpanLimitConfigurationService service) {
    this.service = service;
  }

  @GetMapping
  public List<SpanLimitConfigurationDTO> getSpanLimitConfigurations() {
    return service.getSpanLimitConfigurations();
  }

  @GetMapping("/{name}")
  public SpanLimitConfigurationDTO getSpanLimitConfiguration(@PathVariable("name") String name) {
    return service.getSpanLimitConfiguration(name);
  }

  @PostMapping
  public boolean saveSpanLimitConfiguration(@RequestBody SpanLimitConfigurationDTO dto) {
    service.saveSpanLimitConfiguration(dto);
    return true;
  }

  @DeleteMapping("/{name}")
  public boolean deleteSpanLimitConfiguration(@PathVariable("name") String name) {
    service.deleteSpanLimitConfiguration(name);
    return true;
  }

  @PutMapping
  public boolean updateSpanLimitConfiguration(@RequestBody SpanLimitConfigurationDTO dto) {
    service.updateSpanLimitConfiguration(dto);
    return true;
  }
}

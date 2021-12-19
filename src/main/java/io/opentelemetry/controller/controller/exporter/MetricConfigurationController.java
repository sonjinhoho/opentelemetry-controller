package io.opentelemetry.controller.controller.exporter;

import io.opentelemetry.controller.dto.exporter.MetricConfigurationDTO;
import io.opentelemetry.controller.service.exporter.MetricConfigurationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/exporter/metric/configure")
public class MetricConfigurationController {

  private final MetricConfigurationService service;

  @Autowired
  public MetricConfigurationController(
      MetricConfigurationService service) {
    this.service = service;
  }

  @GetMapping
  public List<MetricConfigurationDTO> getMetricConfigurations() {
    return service.getMetricConfigurations();
  }

  @GetMapping("/{name}")
  public MetricConfigurationDTO getMetricConfiguration(@PathVariable("name") String name) {
    return service.getMetricConfiguration(name);
  }

  @PostMapping
  public boolean saveMetricConfiguration(@RequestBody MetricConfigurationDTO dto) {
    service.saveMetricConfiguration(dto);
    return true;
  }

  @DeleteMapping(path = "/{name}")
  public boolean deleteMetricConfiguration(@PathVariable("name") String name) {
    service.deleteMetricConfiguration(name);
    return true;
  }

  @PutMapping
  public boolean updateMetricConfiguration(@RequestBody MetricConfigurationDTO dto) {
    service.updateMetricConfiguration(dto);
    return true;
  }
}

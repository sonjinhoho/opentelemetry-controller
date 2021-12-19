package io.opentelemetry.controller.controller.exporter;

import io.opentelemetry.controller.dto.exporter.TraceConfigurationDTO;
import io.opentelemetry.controller.service.exporter.TraceConfigurationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/exporter/trace/configure")
public class TraceConfigurationController {

  private final TraceConfigurationService service;

  @Autowired
  public TraceConfigurationController(
      TraceConfigurationService service) {
    this.service = service;
  }

  @GetMapping
  public List<TraceConfigurationDTO> getTraceConfigurations() {
    return service.getTraceConfigurations();
  }

  @GetMapping("/{name}")
  public TraceConfigurationDTO getTraceConfiguration(@PathVariable("name")String name) {
    return service.getTraceConfiguration(name);
  }

  @PostMapping
  public boolean saveTraceConfiguration(@RequestBody TraceConfigurationDTO dto) {
    service.saveTraceConfiguration(dto);
    return true;
  }

  @DeleteMapping(path = "/{name}")
  @ResponseBody
  public boolean deleteTraceConfiguration(@PathVariable("name") String name) {
    service.deleteTraceConfiguration(name);
    return true;
  }

  @PutMapping
  public boolean updateTraceConfiguration(@RequestBody TraceConfigurationDTO dto) {
    service.updateTraceConfiguration(dto);
    return true;
  }
}

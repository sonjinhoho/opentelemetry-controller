package io.opentelemetry.controller.service.resource;

import io.opentelemetry.controller.dao.resource.TelemetryResourceRepository;
import io.opentelemetry.controller.dto.resource.TelemetryResourceDTO;
import io.opentelemetry.controller.dto.span.SpanLimitConfigurationDTO;
import io.opentelemetry.controller.entity.resource.TelemetryResource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TelemetryResourceService {

  private final TelemetryResourceRepository dao;

  public TelemetryResourceService(
      TelemetryResourceRepository dao) {
    this.dao = dao;
  }

  public List<TelemetryResourceDTO> getTelemetryResources() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public TelemetryResourceDTO getTelemetryResource(String name) {
    return convertToDTO(dao.findById(name).orElseThrow(() -> new IllegalStateException("Can not found!")));
  }

  public void saveTelemetryResource(TelemetryResourceDTO dto) {
    if (!dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    } else {
      throw new IllegalArgumentException("Already has name");
    }
  }

  public void deleteTelemetryResource(String name) {
    dao.deleteById(name);
  }

  public void updateTelemetryResource(TelemetryResourceDTO dto) {
    if (dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    }
  }

  private TelemetryResourceDTO convertToDTO(TelemetryResource entity) {
    return TelemetryResourceDTO.builder()
        .type(entity.getType())
        .attributes(entity.getAttributes())
        .build();
  }

  private TelemetryResource convertToEntity(TelemetryResourceDTO dto) {
    return TelemetryResource.builder()
        .name(dto.getName())
        .time(LocalDateTime.now())
        .type(dto.getType())
        .attributes(dto.getAttributes())
        .build();
  }
}

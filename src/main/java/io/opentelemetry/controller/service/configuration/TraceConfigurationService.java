package io.opentelemetry.controller.service.configuration;

import io.opentelemetry.controller.dao.configuration.TraceConfigurationRepository;
import io.opentelemetry.controller.dto.configuration.TraceConfigurationDTO;
import io.opentelemetry.controller.entity.configuration.TraceConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraceConfigurationService {

  private final TraceConfigurationRepository dao;

  @Autowired
  public TraceConfigurationService(
      TraceConfigurationRepository dao) {
    this.dao = dao;
  }

  public List<TraceConfigurationDTO> getTraceConfiguration() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public void saveTraceConfiguration(TraceConfigurationDTO dto) {
    if (!dao.existsById(dto.getName()))
      dao.save(convertToEntity(dto));
    else
      throw new IllegalArgumentException("Already has name");
  }

  public void deleteTraceConfiguration(String name) {
    dao.deleteById(name);
  }

  public void updateTraceConfiguration(TraceConfigurationDTO dto) {
    if (dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    }
  }

  private TraceConfigurationDTO convertToDTO(TraceConfiguration entity) {
    return TraceConfigurationDTO.builder()
        .name(entity.getName())
        .traceExporter(entity.getTraceExporter())
        .traceEndPoint(entity.getTraceEndPoint())
        .traceCertificate(entity.getTraceCertificate())
        .traceHeaders(entity.getTraceHeaders())
        .traceTimeout(entity.getTraceTimeout())
        .traceProtocol(entity.getTraceProtocol())
        .propagation(entity.getPropagation())
        .build();
  }

  private TraceConfiguration convertToEntity(TraceConfigurationDTO dto) {
    return TraceConfiguration.builder()
        .name(dto.getName())
        .time(LocalDateTime.now())
        .traceExporter(dto.getTraceExporter())
        .traceEndPoint(dto.getTraceEndPoint())
        .traceCertificate(dto.getTraceCertificate())
        .traceHeaders(dto.getTraceHeaders())
        .traceTimeout(dto.getTraceTimeout())
        .traceProtocol(dto.getTraceProtocol())
        .propagation(dto.getPropagation())
        .build();
  }
}

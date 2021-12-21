package io.opentelemetry.controller.service.exporter;

import io.opentelemetry.controller.dao.exporter.TraceConfigurationRepository;
import io.opentelemetry.controller.dto.exporter.TraceConfigurationDTO;
import io.opentelemetry.controller.entity.exporter.TraceConfiguration;
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

  public List<TraceConfigurationDTO> getTraceConfigurations() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public TraceConfigurationDTO getTraceConfiguration(String name) {
    return convertToDTO(dao.findById(name).orElseThrow(() -> new IllegalStateException("Can not found!")));
  }

  public void saveTraceConfiguration(TraceConfigurationDTO dto) {
    if (!dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    } else {
      throw new IllegalArgumentException("Already has name");
    }
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
        .type(entity.getType())
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
        .type(dto.getType())
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

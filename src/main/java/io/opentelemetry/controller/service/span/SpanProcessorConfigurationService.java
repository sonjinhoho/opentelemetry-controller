package io.opentelemetry.controller.service.span;

import io.opentelemetry.controller.dao.span.SpanProcessorConfigurationRepository;
import io.opentelemetry.controller.dto.span.SpanLimitConfigurationDTO;
import io.opentelemetry.controller.dto.span.SpanProcessorConfigurationDTO;
import io.opentelemetry.controller.entity.span.SpanLimitConfiguration;
import io.opentelemetry.controller.entity.span.SpanProcessorConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class SpanProcessorConfigurationService {

  private final SpanProcessorConfigurationRepository dao;

  public SpanProcessorConfigurationService(
      SpanProcessorConfigurationRepository dao) {
    this.dao = dao;
  }

  public List<SpanProcessorConfigurationDTO> getSpanProcessorConfigurations() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public SpanProcessorConfigurationDTO getSpanProcessorConfiguration(String name) {
    return convertToDTO(dao.findById(name).orElseThrow(() -> new IllegalStateException("Can not found!")));
  }

  public void saveSpanProcessorConfiguration(SpanProcessorConfigurationDTO dto) {
    if (!dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    } else {
      throw new IllegalArgumentException("Already has name");
    }
  }

  public void deleteSpanProcessorConfiguration(String name) {
    dao.deleteById(name);
  }

  public void updateSpanProcessorConfiguration(SpanProcessorConfigurationDTO dto) {
    if (dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    }
  }

  private SpanProcessorConfigurationDTO convertToDTO(SpanProcessorConfiguration entity) {
    return SpanProcessorConfigurationDTO.builder()
        .name(entity.getName())
        .type(entity.getType())
        .scheduleDelay(entity.getScheduleDelay())
        .maxQueueSize(entity.getMaxQueueSize())
        .exportBatchSize(entity.getExportBatchSize())
        .exportTimeout(entity.getExportTimeout())
        .build();
  }

  private SpanProcessorConfiguration convertToEntity(SpanProcessorConfigurationDTO dto) {
    return SpanProcessorConfiguration.builder()
        .name(dto.getName())
        .type(dto.getType())
        .time(LocalDateTime.now())
        .scheduleDelay(dto.getScheduleDelay())
        .maxQueueSize(dto.getMaxQueueSize())
        .exportBatchSize(dto.getExportBatchSize())
        .exportTimeout(dto.getExportTimeout())
        .build();
  }
}

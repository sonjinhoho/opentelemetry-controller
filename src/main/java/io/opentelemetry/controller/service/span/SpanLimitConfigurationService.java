package io.opentelemetry.controller.service.span;

import io.opentelemetry.controller.dao.span.SpanLimitConfigurationRepository;
import io.opentelemetry.controller.dto.span.SpanLimitConfigurationDTO;
import io.opentelemetry.controller.entity.span.SpanLimitConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpanLimitConfigurationService {

  private final SpanLimitConfigurationRepository dao;

  @Autowired
  public SpanLimitConfigurationService(
      SpanLimitConfigurationRepository dao) {
    this.dao = dao;
  }

  public List<SpanLimitConfigurationDTO> getSpanLimitConfigurations() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public SpanLimitConfigurationDTO getSpanLimitConfiguration(String name) {
    return convertToDTO(dao.findById(name).orElseThrow(() -> new IllegalStateException("Can not found!")));
  }

  public void saveSpanLimitConfiguration(SpanLimitConfigurationDTO dto) {
    if (!dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    } else {
      throw new IllegalArgumentException("Already has name");
    }
  }

  public void deleteSpanLimitConfiguration(String name) {
    dao.deleteById(name);
  }

  public void updateSpanLimitConfiguration(SpanLimitConfigurationDTO dto) {
    if (dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    }
  }

  private SpanLimitConfigurationDTO convertToDTO(SpanLimitConfiguration entity) {
    return SpanLimitConfigurationDTO.builder()
        .name(entity.getName())
        .attributeCountLimit(entity.getAttributeCountLimit())
        .attributeCountPerEventLimit(entity.getAttributeCountPerEventLimit())
        .attributeCountPerLinkLimit(entity.getAttributeCountPerLinkLimit())
        .eventCountLimit(entity.getEventCountLimit())
        .linkCountLimit(entity.getLinkCountLimit())
        .build();
  }

  private SpanLimitConfiguration convertToEntity(SpanLimitConfigurationDTO dto) {
    return SpanLimitConfiguration.builder()
        .name(dto.getName())
        .time(LocalDateTime.now())
        .attributeCountLimit(dto.getAttributeCountLimit())
        .attributeCountPerEventLimit(dto.getAttributeCountPerEventLimit())
        .attributeCountPerLinkLimit(dto.getAttributeCountPerLinkLimit())
        .eventCountLimit(dto.getEventCountLimit())
        .linkCountLimit(dto.getLinkCountLimit())
        .build();
  }

}

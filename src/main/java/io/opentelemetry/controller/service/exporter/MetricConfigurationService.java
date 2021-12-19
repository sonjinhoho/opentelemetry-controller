package io.opentelemetry.controller.service.exporter;

import io.opentelemetry.controller.dao.exporter.MetricConfigurationRepository;
import io.opentelemetry.controller.dto.exporter.MetricConfigurationDTO;
import io.opentelemetry.controller.entity.exporter.MetricConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetricConfigurationService {

  private final MetricConfigurationRepository dao;

  @Autowired
  public MetricConfigurationService(
      MetricConfigurationRepository dao) {
    this.dao = dao;
  }

  public List<MetricConfigurationDTO> getMetricConfigurations() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public MetricConfigurationDTO getMetricConfiguration(String name) {
    return convertToDTO(dao.findById(name).orElseThrow(() -> new IllegalStateException("Can not found!")));
  }

  public void saveMetricConfiguration(MetricConfigurationDTO dto) {
    if (!dao.existsById(dto.getName()))
      dao.save(convertToEntity(dto));
    else
      throw new IllegalArgumentException("Already has name");
  }

  public void deleteMetricConfiguration(String name) {
    dao.deleteById(name);
  }

  public void updateMetricConfiguration(MetricConfigurationDTO dto) {
    if (dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    }
  }

  private MetricConfigurationDTO convertToDTO(MetricConfiguration entity) {
    return MetricConfigurationDTO.builder()
        .name(entity.getName())
        .metricExporter(entity.getMetricExporter())
        .metricEndPoint(entity.getMetricEndPoint())
        .metricCertificate(entity.getMetricCertificate())
        .metricHeaders(entity.getMetricHeaders())
        .metricTimeout(entity.getMetricTimeout())
        .metricProtocol(entity.getMetricProtocol())
        .build();
  }

  private MetricConfiguration convertToEntity(MetricConfigurationDTO dto) {
    return MetricConfiguration.builder()
        .name(dto.getName())
        .time(LocalDateTime.now())
        .metricExporter(dto.getMetricExporter())
        .metricEndPoint(dto.getMetricEndPoint())
        .metricCertificate(dto.getMetricCertificate())
        .metricHeaders(dto.getMetricHeaders())
        .metricTimeout(dto.getMetricTimeout())
        .metricProtocol(dto.getMetricProtocol())
        .build();
  }

}

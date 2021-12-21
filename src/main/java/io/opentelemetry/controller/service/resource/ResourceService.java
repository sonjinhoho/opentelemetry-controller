package io.opentelemetry.controller.service.resource;

import io.opentelemetry.controller.dao.resource.ResourceRepository;
import io.opentelemetry.controller.dto.resource.ResourceDTO;
import io.opentelemetry.controller.entity.resource.ResourceConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ResourceService {

  private final ResourceRepository dao;

  public ResourceService(
      ResourceRepository dao) {
    this.dao = dao;
  }

  public List<ResourceDTO> getResources() {
    return dao.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  public ResourceDTO getResource(String name) {
    return convertToDTO(dao.findById(name).orElseThrow(() -> new IllegalStateException("Can not found!")));
  }

  public void saveResource(ResourceDTO dto) {
    if (!dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    } else {
      throw new IllegalArgumentException("Already has name");
    }
  }

  public void deleteResource(String name) {
    dao.deleteById(name);
  }

  public void updateResource(ResourceDTO dto) {
    if (dao.existsById(dto.getName())) {
      dao.save(convertToEntity(dto));
    }
  }

  private ResourceDTO convertToDTO(ResourceConfiguration entity) {
    return ResourceDTO.builder()
        .type(entity.getType())
        .attributes(entity.getAttributes())
        .build();
  }

  private ResourceConfiguration convertToEntity(ResourceDTO dto) {
    return ResourceConfiguration.builder()
        .name(dto.getName())
        .time(LocalDateTime.now())
        .type(dto.getType())
        .attributes(dto.getAttributes())
        .build();
  }
}

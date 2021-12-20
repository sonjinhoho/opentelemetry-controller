package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.exporter.TraceConfigurationRepository;
import io.opentelemetry.controller.entity.exporter.TraceConfiguration;
import io.opentelemetry.proto.collector.trace.config.ResourceId;
import io.opentelemetry.proto.collector.trace.config.TraceConfigServiceGrpc.TraceConfigServiceImplBase;
import io.opentelemetry.proto.trace.v1.TraceConfig;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TraceConfigService extends TraceConfigServiceImplBase {

  private final TraceConfigurationRepository dao;

  public TraceConfigService(TraceConfigurationRepository dao) {
    this.dao = dao;
  }

  @Override
  public void export(ResourceId request, StreamObserver<TraceConfig> responseObserver) {
    super.export(request, responseObserver);
    TraceConfiguration configuration = dao.findByNameAndType(request.getName(), request.getType());
  }
}

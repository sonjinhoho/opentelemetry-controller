package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.exporter.TraceConfigurationRepository;
import io.opentelemetry.controller.entity.exporter.TraceConfiguration;
import io.opentelemetry.proto.controller.resource.config.ConfigRequest;
import io.opentelemetry.proto.controller.resource.config.TraceConfig;
import io.opentelemetry.proto.controller.resource.config.TraceConfigServiceGrpc.TraceConfigServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TraceConfigServiceImpl extends TraceConfigServiceImplBase {

  private final TraceConfigurationRepository dao;

  public TraceConfigServiceImpl(
      TraceConfigurationRepository dao) {
    this.dao = dao;
  }

  @Override
  public void traceConfigRPC(ConfigRequest request, StreamObserver<TraceConfig> responseObserver) {
    super.traceConfigRPC(request, responseObserver);
  }
}

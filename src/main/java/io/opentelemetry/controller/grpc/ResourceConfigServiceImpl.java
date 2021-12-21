package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.resource.TelemetryResourceRepository;
import io.opentelemetry.proto.controller.resource.config.ConfigRequest;
import io.opentelemetry.proto.controller.resource.config.ResourceConfig;
import io.opentelemetry.proto.controller.resource.config.ResourceConfigServiceGrpc.ResourceConfigServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ResourceConfigServiceImpl extends ResourceConfigServiceImplBase {

  private final TelemetryResourceRepository dao;

  public ResourceConfigServiceImpl(
      TelemetryResourceRepository dao) {
    this.dao = dao;
  }

  @Override
  public void resourceConfigRPC(ConfigRequest request,
      StreamObserver<ResourceConfig> responseObserver) {
    super.resourceConfigRPC(request, responseObserver);

  }
}

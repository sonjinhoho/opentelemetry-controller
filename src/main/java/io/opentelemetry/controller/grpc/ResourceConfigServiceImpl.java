package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.resource.ResourceRepository;
import io.opentelemetry.controller.entity.DEFAULT;
import io.opentelemetry.controller.entity.resource.ResourceConfiguration;
import io.opentelemetry.proto.controller.resource.config.ConfigRequest;
import io.opentelemetry.proto.controller.resource.config.ResourceConfig;
import io.opentelemetry.proto.controller.resource.config.ResourceConfigServiceGrpc.ResourceConfigServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ResourceConfigServiceImpl extends ResourceConfigServiceImplBase {

  private final ResourceRepository dao;

  public ResourceConfigServiceImpl(
      ResourceRepository dao) {
    this.dao = dao;
  }

  @Override
  public void resourceConfigRPC(ConfigRequest request,
      StreamObserver<ResourceConfig> responseObserver) {
    super.resourceConfigRPC(request, responseObserver);

    ResourceConfiguration conf = dao.findByNameAndType(request.getName(), request.getType()).orElse(
        DEFAULT.INSTANCE.DEFAULT_RESOURCE);

    ResourceConfig response = ResourceConfig.newBuilder()
        .putAllAttributes(conf.getAttributes()).build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();

  }
}

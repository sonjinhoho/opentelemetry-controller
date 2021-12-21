package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.span.SpanLimitConfigurationRepository;
import io.opentelemetry.proto.controller.resource.config.ConfigRequest;
import io.opentelemetry.proto.controller.resource.config.SpanLimitConfig;
import io.opentelemetry.proto.controller.resource.config.SpanLimitConfigServiceGrpc.SpanLimitConfigServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SpanLimitConfigImpl extends SpanLimitConfigServiceImplBase {

  private final SpanLimitConfigurationRepository dao;

  public SpanLimitConfigImpl(
      SpanLimitConfigurationRepository dao) {
    this.dao = dao;
  }

  @Override
  public void spanLimitConfigRPC(ConfigRequest request,
      StreamObserver<SpanLimitConfig> responseObserver) {
    super.spanLimitConfigRPC(request, responseObserver);
  }
}

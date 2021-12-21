package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.span.SpanProcessorConfigurationRepository;
import io.opentelemetry.proto.controller.resource.config.ConfigRequest;
import io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig;
import io.opentelemetry.proto.controller.resource.config.SpanProcessorConfigServiceGrpc.SpanProcessorConfigServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SpanProcessorConfigImpl extends SpanProcessorConfigServiceImplBase {

  private final SpanProcessorConfigurationRepository dao;

  public SpanProcessorConfigImpl(
      SpanProcessorConfigurationRepository dao) {
    this.dao = dao;
  }

  @Override
  public void spanProcessorConfigRPC(ConfigRequest request,
      StreamObserver<SpanProcessorConfig> responseObserver) {
    super.spanProcessorConfigRPC(request, responseObserver);
  }
}

package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.span.SpanLimitConfigurationRepository;
import io.opentelemetry.controller.entity.DEFAULT;
import io.opentelemetry.controller.entity.span.SpanLimitConfiguration;
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

    SpanLimitConfiguration conf = dao.findByNameAndType(request.getName(), request.getType())
        .orElse(DEFAULT.INSTANCE.DEFAULT_SPANLIMIT);

    SpanLimitConfig response = SpanLimitConfig.newBuilder()
        .setAttributeCountLimit(conf.getAttributeCountLimit())
        .setAttributeCountPerLinkLimit(conf.getAttributeCountPerEventLimit())
        .setAttributeCountLimit(conf.getAttributeCountLimit())
        .setEventCountLimit(conf.getEventCountLimit())
        .setLinkCountLimit(conf.getLinkCountLimit())
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}

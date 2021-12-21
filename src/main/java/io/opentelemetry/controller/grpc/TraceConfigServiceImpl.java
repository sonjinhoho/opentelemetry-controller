package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.exporter.TraceConfigurationRepository;
import io.opentelemetry.controller.entity.DEFAULT;
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

    TraceConfiguration conf = dao.findByNameAndType(request.getName(), request.getType()).orElse(
        DEFAULT.INSTANCE.DEFAULT_TRACE);

    TraceConfig response = TraceConfig.newBuilder()
        .setExporter(conf.getTraceExporter())
        .setEndPoint(conf.getTraceEndPoint())
        .setCertificate(conf.getTraceCertificate())
        .setHeaders(conf.getTraceHeaders())
        .setCompression(conf.getTraceCompression())
        .setProtocol(conf.getTraceProtocol())
        .setPropagation(conf.getPropagation())
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}

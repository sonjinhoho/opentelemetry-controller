package io.opentelemetry.controller.grpc;

import io.grpc.stub.StreamObserver;
import io.opentelemetry.controller.dao.exporter.MetricConfigurationRepository;
import io.opentelemetry.controller.entity.DEFAULT;
import io.opentelemetry.controller.entity.exporter.MetricConfiguration;
import io.opentelemetry.proto.controller.resource.config.ConfigRequest;
import io.opentelemetry.proto.controller.resource.config.MetricConfig;
import io.opentelemetry.proto.controller.resource.config.MetricConfigServiceGrpc.MetricConfigServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MetricConfigServiceImpl extends MetricConfigServiceImplBase {

  private final MetricConfigurationRepository dao;

  public MetricConfigServiceImpl(
      MetricConfigurationRepository dao) {
    this.dao = dao;
  }

  @Override
  public void metricConfigRPC(ConfigRequest request,
      StreamObserver<MetricConfig> responseObserver) {
    super.metricConfigRPC(request, responseObserver);

    MetricConfiguration conf = dao.findByNameAndType(request.getName(), request.getType()).orElse(
        DEFAULT.INSTANCE.DEFAULT_METRIC);

    MetricConfig response = MetricConfig.newBuilder()
        .setExporter(conf.getMetricExporter())
        .setEndPoint(conf.getMetricEndPoint())
        .setCertificate(conf.getMetricCertificate())
        .setHeaders(conf.getMetricHeaders())
        .setCompression(conf.getMetricCompression())
        .setTimeout(conf.getMetricTimeout())
        .setPropagation(conf.getMetricProtocol())
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}

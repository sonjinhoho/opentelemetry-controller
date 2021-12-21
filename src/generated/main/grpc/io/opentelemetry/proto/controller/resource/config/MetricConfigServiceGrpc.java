package io.opentelemetry.proto.controller.resource.config;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: conf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetricConfigServiceGrpc {

  private MetricConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "opentelemetry.proto.controller.resource.config.MetricConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.MetricConfig> getMetricConfigRPCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MetricConfigRPC",
      requestType = io.opentelemetry.proto.controller.resource.config.ConfigRequest.class,
      responseType = io.opentelemetry.proto.controller.resource.config.MetricConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.MetricConfig> getMetricConfigRPCMethod() {
    io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.MetricConfig> getMetricConfigRPCMethod;
    if ((getMetricConfigRPCMethod = MetricConfigServiceGrpc.getMetricConfigRPCMethod) == null) {
      synchronized (MetricConfigServiceGrpc.class) {
        if ((getMetricConfigRPCMethod = MetricConfigServiceGrpc.getMetricConfigRPCMethod) == null) {
          MetricConfigServiceGrpc.getMetricConfigRPCMethod = getMetricConfigRPCMethod =
              io.grpc.MethodDescriptor.<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.MetricConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MetricConfigRPC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.MetricConfig.getDefaultInstance()))
              .setSchemaDescriptor(new MetricConfigServiceMethodDescriptorSupplier("MetricConfigRPC"))
              .build();
        }
      }
    }
    return getMetricConfigRPCMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetricConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricConfigServiceStub>() {
        @java.lang.Override
        public MetricConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricConfigServiceStub(channel, callOptions);
        }
      };
    return MetricConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetricConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricConfigServiceBlockingStub>() {
        @java.lang.Override
        public MetricConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return MetricConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetricConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricConfigServiceFutureStub>() {
        @java.lang.Override
        public MetricConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricConfigServiceFutureStub(channel, callOptions);
        }
      };
    return MetricConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MetricConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void metricConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.MetricConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetricConfigRPCMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMetricConfigRPCMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.opentelemetry.proto.controller.resource.config.ConfigRequest,
                io.opentelemetry.proto.controller.resource.config.MetricConfig>(
                  this, METHODID_METRIC_CONFIG_RPC)))
          .build();
    }
  }

  /**
   */
  public static final class MetricConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<MetricConfigServiceStub> {
    private MetricConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void metricConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.MetricConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetricConfigRPCMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetricConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MetricConfigServiceBlockingStub> {
    private MetricConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.opentelemetry.proto.controller.resource.config.MetricConfig metricConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetricConfigRPCMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetricConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MetricConfigServiceFutureStub> {
    private MetricConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.opentelemetry.proto.controller.resource.config.MetricConfig> metricConfigRPC(
        io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetricConfigRPCMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_METRIC_CONFIG_RPC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetricConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetricConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_METRIC_CONFIG_RPC:
          serviceImpl.metricConfigRPC((io.opentelemetry.proto.controller.resource.config.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.MetricConfig>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MetricConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetricConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetricConfigService");
    }
  }

  private static final class MetricConfigServiceFileDescriptorSupplier
      extends MetricConfigServiceBaseDescriptorSupplier {
    MetricConfigServiceFileDescriptorSupplier() {}
  }

  private static final class MetricConfigServiceMethodDescriptorSupplier
      extends MetricConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetricConfigServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetricConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetricConfigServiceFileDescriptorSupplier())
              .addMethod(getMetricConfigRPCMethod())
              .build();
        }
      }
    }
    return result;
  }
}

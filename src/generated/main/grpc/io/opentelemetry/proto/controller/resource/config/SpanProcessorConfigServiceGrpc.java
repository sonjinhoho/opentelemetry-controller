package io.opentelemetry.proto.controller.resource.config;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: conf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpanProcessorConfigServiceGrpc {

  private SpanProcessorConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "opentelemetry.proto.controller.resource.config.SpanProcessorConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig> getSpanProcessorConfigRPCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpanProcessorConfigRPC",
      requestType = io.opentelemetry.proto.controller.resource.config.ConfigRequest.class,
      responseType = io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig> getSpanProcessorConfigRPCMethod() {
    io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig> getSpanProcessorConfigRPCMethod;
    if ((getSpanProcessorConfigRPCMethod = SpanProcessorConfigServiceGrpc.getSpanProcessorConfigRPCMethod) == null) {
      synchronized (SpanProcessorConfigServiceGrpc.class) {
        if ((getSpanProcessorConfigRPCMethod = SpanProcessorConfigServiceGrpc.getSpanProcessorConfigRPCMethod) == null) {
          SpanProcessorConfigServiceGrpc.getSpanProcessorConfigRPCMethod = getSpanProcessorConfigRPCMethod =
              io.grpc.MethodDescriptor.<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpanProcessorConfigRPC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig.getDefaultInstance()))
              .setSchemaDescriptor(new SpanProcessorConfigServiceMethodDescriptorSupplier("SpanProcessorConfigRPC"))
              .build();
        }
      }
    }
    return getSpanProcessorConfigRPCMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpanProcessorConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanProcessorConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanProcessorConfigServiceStub>() {
        @java.lang.Override
        public SpanProcessorConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanProcessorConfigServiceStub(channel, callOptions);
        }
      };
    return SpanProcessorConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpanProcessorConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanProcessorConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanProcessorConfigServiceBlockingStub>() {
        @java.lang.Override
        public SpanProcessorConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanProcessorConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return SpanProcessorConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpanProcessorConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanProcessorConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanProcessorConfigServiceFutureStub>() {
        @java.lang.Override
        public SpanProcessorConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanProcessorConfigServiceFutureStub(channel, callOptions);
        }
      };
    return SpanProcessorConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SpanProcessorConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void spanProcessorConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpanProcessorConfigRPCMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpanProcessorConfigRPCMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.opentelemetry.proto.controller.resource.config.ConfigRequest,
                io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig>(
                  this, METHODID_SPAN_PROCESSOR_CONFIG_RPC)))
          .build();
    }
  }

  /**
   */
  public static final class SpanProcessorConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<SpanProcessorConfigServiceStub> {
    private SpanProcessorConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanProcessorConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanProcessorConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void spanProcessorConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpanProcessorConfigRPCMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpanProcessorConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SpanProcessorConfigServiceBlockingStub> {
    private SpanProcessorConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanProcessorConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanProcessorConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig spanProcessorConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpanProcessorConfigRPCMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpanProcessorConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SpanProcessorConfigServiceFutureStub> {
    private SpanProcessorConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanProcessorConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanProcessorConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig> spanProcessorConfigRPC(
        io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpanProcessorConfigRPCMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SPAN_PROCESSOR_CONFIG_RPC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpanProcessorConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpanProcessorConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SPAN_PROCESSOR_CONFIG_RPC:
          serviceImpl.spanProcessorConfigRPC((io.opentelemetry.proto.controller.resource.config.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.SpanProcessorConfig>) responseObserver);
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

  private static abstract class SpanProcessorConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpanProcessorConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpanProcessorConfigService");
    }
  }

  private static final class SpanProcessorConfigServiceFileDescriptorSupplier
      extends SpanProcessorConfigServiceBaseDescriptorSupplier {
    SpanProcessorConfigServiceFileDescriptorSupplier() {}
  }

  private static final class SpanProcessorConfigServiceMethodDescriptorSupplier
      extends SpanProcessorConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpanProcessorConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpanProcessorConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpanProcessorConfigServiceFileDescriptorSupplier())
              .addMethod(getSpanProcessorConfigRPCMethod())
              .build();
        }
      }
    }
    return result;
  }
}

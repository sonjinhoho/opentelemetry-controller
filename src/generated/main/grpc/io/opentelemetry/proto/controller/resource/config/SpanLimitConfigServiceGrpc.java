package io.opentelemetry.proto.controller.resource.config;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: conf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpanLimitConfigServiceGrpc {

  private SpanLimitConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "opentelemetry.proto.controller.resource.config.SpanLimitConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.SpanLimitConfig> getSpanLimitConfigRPCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpanLimitConfigRPC",
      requestType = io.opentelemetry.proto.controller.resource.config.ConfigRequest.class,
      responseType = io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.SpanLimitConfig> getSpanLimitConfigRPCMethod() {
    io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.SpanLimitConfig> getSpanLimitConfigRPCMethod;
    if ((getSpanLimitConfigRPCMethod = SpanLimitConfigServiceGrpc.getSpanLimitConfigRPCMethod) == null) {
      synchronized (SpanLimitConfigServiceGrpc.class) {
        if ((getSpanLimitConfigRPCMethod = SpanLimitConfigServiceGrpc.getSpanLimitConfigRPCMethod) == null) {
          SpanLimitConfigServiceGrpc.getSpanLimitConfigRPCMethod = getSpanLimitConfigRPCMethod =
              io.grpc.MethodDescriptor.<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.SpanLimitConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpanLimitConfigRPC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.SpanLimitConfig.getDefaultInstance()))
              .setSchemaDescriptor(new SpanLimitConfigServiceMethodDescriptorSupplier("SpanLimitConfigRPC"))
              .build();
        }
      }
    }
    return getSpanLimitConfigRPCMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpanLimitConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanLimitConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanLimitConfigServiceStub>() {
        @java.lang.Override
        public SpanLimitConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanLimitConfigServiceStub(channel, callOptions);
        }
      };
    return SpanLimitConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpanLimitConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanLimitConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanLimitConfigServiceBlockingStub>() {
        @java.lang.Override
        public SpanLimitConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanLimitConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return SpanLimitConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpanLimitConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanLimitConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanLimitConfigServiceFutureStub>() {
        @java.lang.Override
        public SpanLimitConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanLimitConfigServiceFutureStub(channel, callOptions);
        }
      };
    return SpanLimitConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SpanLimitConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void spanLimitConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.SpanLimitConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpanLimitConfigRPCMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpanLimitConfigRPCMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.opentelemetry.proto.controller.resource.config.ConfigRequest,
                io.opentelemetry.proto.controller.resource.config.SpanLimitConfig>(
                  this, METHODID_SPAN_LIMIT_CONFIG_RPC)))
          .build();
    }
  }

  /**
   */
  public static final class SpanLimitConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<SpanLimitConfigServiceStub> {
    private SpanLimitConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanLimitConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanLimitConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void spanLimitConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.SpanLimitConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpanLimitConfigRPCMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpanLimitConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SpanLimitConfigServiceBlockingStub> {
    private SpanLimitConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanLimitConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanLimitConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.opentelemetry.proto.controller.resource.config.SpanLimitConfig spanLimitConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpanLimitConfigRPCMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpanLimitConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SpanLimitConfigServiceFutureStub> {
    private SpanLimitConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanLimitConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanLimitConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.opentelemetry.proto.controller.resource.config.SpanLimitConfig> spanLimitConfigRPC(
        io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpanLimitConfigRPCMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SPAN_LIMIT_CONFIG_RPC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpanLimitConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpanLimitConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SPAN_LIMIT_CONFIG_RPC:
          serviceImpl.spanLimitConfigRPC((io.opentelemetry.proto.controller.resource.config.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.SpanLimitConfig>) responseObserver);
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

  private static abstract class SpanLimitConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpanLimitConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpanLimitConfigService");
    }
  }

  private static final class SpanLimitConfigServiceFileDescriptorSupplier
      extends SpanLimitConfigServiceBaseDescriptorSupplier {
    SpanLimitConfigServiceFileDescriptorSupplier() {}
  }

  private static final class SpanLimitConfigServiceMethodDescriptorSupplier
      extends SpanLimitConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpanLimitConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpanLimitConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpanLimitConfigServiceFileDescriptorSupplier())
              .addMethod(getSpanLimitConfigRPCMethod())
              .build();
        }
      }
    }
    return result;
  }
}

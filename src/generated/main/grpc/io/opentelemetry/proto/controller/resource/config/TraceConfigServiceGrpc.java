package io.opentelemetry.proto.controller.resource.config;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: conf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TraceConfigServiceGrpc {

  private TraceConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "opentelemetry.proto.controller.resource.config.TraceConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.TraceConfig> getTraceConfigRPCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraceConfigRPC",
      requestType = io.opentelemetry.proto.controller.resource.config.ConfigRequest.class,
      responseType = io.opentelemetry.proto.controller.resource.config.TraceConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.TraceConfig> getTraceConfigRPCMethod() {
    io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.TraceConfig> getTraceConfigRPCMethod;
    if ((getTraceConfigRPCMethod = TraceConfigServiceGrpc.getTraceConfigRPCMethod) == null) {
      synchronized (TraceConfigServiceGrpc.class) {
        if ((getTraceConfigRPCMethod = TraceConfigServiceGrpc.getTraceConfigRPCMethod) == null) {
          TraceConfigServiceGrpc.getTraceConfigRPCMethod = getTraceConfigRPCMethod =
              io.grpc.MethodDescriptor.<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.TraceConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraceConfigRPC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.TraceConfig.getDefaultInstance()))
              .setSchemaDescriptor(new TraceConfigServiceMethodDescriptorSupplier("TraceConfigRPC"))
              .build();
        }
      }
    }
    return getTraceConfigRPCMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraceConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceConfigServiceStub>() {
        @java.lang.Override
        public TraceConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceConfigServiceStub(channel, callOptions);
        }
      };
    return TraceConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraceConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceConfigServiceBlockingStub>() {
        @java.lang.Override
        public TraceConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return TraceConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TraceConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceConfigServiceFutureStub>() {
        @java.lang.Override
        public TraceConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceConfigServiceFutureStub(channel, callOptions);
        }
      };
    return TraceConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TraceConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void traceConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.TraceConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraceConfigRPCMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTraceConfigRPCMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.opentelemetry.proto.controller.resource.config.ConfigRequest,
                io.opentelemetry.proto.controller.resource.config.TraceConfig>(
                  this, METHODID_TRACE_CONFIG_RPC)))
          .build();
    }
  }

  /**
   */
  public static final class TraceConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<TraceConfigServiceStub> {
    private TraceConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void traceConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.TraceConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraceConfigRPCMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TraceConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TraceConfigServiceBlockingStub> {
    private TraceConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.opentelemetry.proto.controller.resource.config.TraceConfig traceConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraceConfigRPCMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TraceConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TraceConfigServiceFutureStub> {
    private TraceConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.opentelemetry.proto.controller.resource.config.TraceConfig> traceConfigRPC(
        io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraceConfigRPCMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRACE_CONFIG_RPC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TraceConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TraceConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRACE_CONFIG_RPC:
          serviceImpl.traceConfigRPC((io.opentelemetry.proto.controller.resource.config.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.TraceConfig>) responseObserver);
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

  private static abstract class TraceConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TraceConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TraceConfigService");
    }
  }

  private static final class TraceConfigServiceFileDescriptorSupplier
      extends TraceConfigServiceBaseDescriptorSupplier {
    TraceConfigServiceFileDescriptorSupplier() {}
  }

  private static final class TraceConfigServiceMethodDescriptorSupplier
      extends TraceConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TraceConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TraceConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TraceConfigServiceFileDescriptorSupplier())
              .addMethod(getTraceConfigRPCMethod())
              .build();
        }
      }
    }
    return result;
  }
}

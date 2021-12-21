package io.opentelemetry.proto.controller.resource.config;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: conf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceConfigServiceGrpc {

  private ResourceConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "opentelemetry.proto.controller.resource.config.ResourceConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.ResourceConfig> getResourceConfigRPCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceConfigRPC",
      requestType = io.opentelemetry.proto.controller.resource.config.ConfigRequest.class,
      responseType = io.opentelemetry.proto.controller.resource.config.ResourceConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest,
      io.opentelemetry.proto.controller.resource.config.ResourceConfig> getResourceConfigRPCMethod() {
    io.grpc.MethodDescriptor<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.ResourceConfig> getResourceConfigRPCMethod;
    if ((getResourceConfigRPCMethod = ResourceConfigServiceGrpc.getResourceConfigRPCMethod) == null) {
      synchronized (ResourceConfigServiceGrpc.class) {
        if ((getResourceConfigRPCMethod = ResourceConfigServiceGrpc.getResourceConfigRPCMethod) == null) {
          ResourceConfigServiceGrpc.getResourceConfigRPCMethod = getResourceConfigRPCMethod =
              io.grpc.MethodDescriptor.<io.opentelemetry.proto.controller.resource.config.ConfigRequest, io.opentelemetry.proto.controller.resource.config.ResourceConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceConfigRPC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.controller.resource.config.ResourceConfig.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceConfigServiceMethodDescriptorSupplier("ResourceConfigRPC"))
              .build();
        }
      }
    }
    return getResourceConfigRPCMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceConfigServiceStub>() {
        @java.lang.Override
        public ResourceConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceConfigServiceStub(channel, callOptions);
        }
      };
    return ResourceConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceConfigServiceBlockingStub>() {
        @java.lang.Override
        public ResourceConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceConfigServiceFutureStub>() {
        @java.lang.Override
        public ResourceConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceConfigServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ResourceConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void resourceConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.ResourceConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceConfigRPCMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getResourceConfigRPCMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.opentelemetry.proto.controller.resource.config.ConfigRequest,
                io.opentelemetry.proto.controller.resource.config.ResourceConfig>(
                  this, METHODID_RESOURCE_CONFIG_RPC)))
          .build();
    }
  }

  /**
   */
  public static final class ResourceConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceConfigServiceStub> {
    private ResourceConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void resourceConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.ResourceConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceConfigRPCMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourceConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceConfigServiceBlockingStub> {
    private ResourceConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.opentelemetry.proto.controller.resource.config.ResourceConfig resourceConfigRPC(io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceConfigRPCMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourceConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceConfigServiceFutureStub> {
    private ResourceConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.opentelemetry.proto.controller.resource.config.ResourceConfig> resourceConfigRPC(
        io.opentelemetry.proto.controller.resource.config.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceConfigRPCMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESOURCE_CONFIG_RPC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESOURCE_CONFIG_RPC:
          serviceImpl.resourceConfigRPC((io.opentelemetry.proto.controller.resource.config.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.opentelemetry.proto.controller.resource.config.ResourceConfig>) responseObserver);
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

  private static abstract class ResourceConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.opentelemetry.proto.controller.resource.config.Conf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceConfigService");
    }
  }

  private static final class ResourceConfigServiceFileDescriptorSupplier
      extends ResourceConfigServiceBaseDescriptorSupplier {
    ResourceConfigServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceConfigServiceMethodDescriptorSupplier
      extends ResourceConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceConfigServiceFileDescriptorSupplier())
              .addMethod(getResourceConfigRPCMethod())
              .build();
        }
      }
    }
    return result;
  }
}

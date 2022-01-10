package com.music.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Main service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: musicService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MusicServiceGrpc {

  private MusicServiceGrpc() {}

  public static final String SERVICE_NAME = "com.music.grpc.MusicService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.music.grpc.MusicServiceOuterClass.GetMusicResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.music.grpc.MusicServiceOuterClass.GetMusicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.music.grpc.MusicServiceOuterClass.GetMusicResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.music.grpc.MusicServiceOuterClass.GetMusicResponse> getGetAllMethod;
    if ((getGetAllMethod = MusicServiceGrpc.getGetAllMethod) == null) {
      synchronized (MusicServiceGrpc.class) {
        if ((getGetAllMethod = MusicServiceGrpc.getGetAllMethod) == null) {
          MusicServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.music.grpc.MusicServiceOuterClass.GetMusicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.GetMusicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MusicServiceMethodDescriptorSupplier("GetAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest,
      com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetById",
      requestType = com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest.class,
      responseType = com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest,
      com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse> getGetByIdMethod() {
    io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest, com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse> getGetByIdMethod;
    if ((getGetByIdMethod = MusicServiceGrpc.getGetByIdMethod) == null) {
      synchronized (MusicServiceGrpc.class) {
        if ((getGetByIdMethod = MusicServiceGrpc.getGetByIdMethod) == null) {
          MusicServiceGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest, com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MusicServiceMethodDescriptorSupplier("GetById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.CreateMusicRequest,
      com.music.grpc.MusicServiceOuterClass.CreateMusicResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.music.grpc.MusicServiceOuterClass.CreateMusicRequest.class,
      responseType = com.music.grpc.MusicServiceOuterClass.CreateMusicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.CreateMusicRequest,
      com.music.grpc.MusicServiceOuterClass.CreateMusicResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.CreateMusicRequest, com.music.grpc.MusicServiceOuterClass.CreateMusicResponse> getCreateMethod;
    if ((getCreateMethod = MusicServiceGrpc.getCreateMethod) == null) {
      synchronized (MusicServiceGrpc.class) {
        if ((getCreateMethod = MusicServiceGrpc.getCreateMethod) == null) {
          MusicServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.music.grpc.MusicServiceOuterClass.CreateMusicRequest, com.music.grpc.MusicServiceOuterClass.CreateMusicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.CreateMusicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.CreateMusicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MusicServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest,
      com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest.class,
      responseType = com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest,
      com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest, com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse> getUpdateMethod;
    if ((getUpdateMethod = MusicServiceGrpc.getUpdateMethod) == null) {
      synchronized (MusicServiceGrpc.class) {
        if ((getUpdateMethod = MusicServiceGrpc.getUpdateMethod) == null) {
          MusicServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest, com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MusicServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest,
      com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest.class,
      responseType = com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest,
      com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest, com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse> getDeleteMethod;
    if ((getDeleteMethod = MusicServiceGrpc.getDeleteMethod) == null) {
      synchronized (MusicServiceGrpc.class) {
        if ((getDeleteMethod = MusicServiceGrpc.getDeleteMethod) == null) {
          MusicServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest, com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MusicServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MusicServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MusicServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MusicServiceStub>() {
        @java.lang.Override
        public MusicServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MusicServiceStub(channel, callOptions);
        }
      };
    return MusicServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MusicServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MusicServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MusicServiceBlockingStub>() {
        @java.lang.Override
        public MusicServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MusicServiceBlockingStub(channel, callOptions);
        }
      };
    return MusicServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MusicServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MusicServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MusicServiceFutureStub>() {
        @java.lang.Override
        public MusicServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MusicServiceFutureStub(channel, callOptions);
        }
      };
    return MusicServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Main service
   * </pre>
   */
  public static abstract class MusicServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.GetMusicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void create(com.music.grpc.MusicServiceOuterClass.CreateMusicRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.CreateMusicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.music.grpc.MusicServiceOuterClass.GetMusicResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest,
                com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.music.grpc.MusicServiceOuterClass.CreateMusicRequest,
                com.music.grpc.MusicServiceOuterClass.CreateMusicResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest,
                com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest,
                com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Main service
   * </pre>
   */
  public static final class MusicServiceStub extends io.grpc.stub.AbstractAsyncStub<MusicServiceStub> {
    private MusicServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MusicServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.GetMusicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.music.grpc.MusicServiceOuterClass.CreateMusicRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.CreateMusicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest request,
        io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Main service
   * </pre>
   */
  public static final class MusicServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MusicServiceBlockingStub> {
    private MusicServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MusicServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.music.grpc.MusicServiceOuterClass.GetMusicResponse getAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse getById(com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.music.grpc.MusicServiceOuterClass.CreateMusicResponse create(com.music.grpc.MusicServiceOuterClass.CreateMusicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse update(com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse delete(com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Main service
   * </pre>
   */
  public static final class MusicServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MusicServiceFutureStub> {
    private MusicServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MusicServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.music.grpc.MusicServiceOuterClass.GetMusicResponse> getAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse> getById(
        com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.music.grpc.MusicServiceOuterClass.CreateMusicResponse> create(
        com.music.grpc.MusicServiceOuterClass.CreateMusicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse> update(
        com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse> delete(
        com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL = 0;
  private static final int METHODID_GET_BY_ID = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MusicServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MusicServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.GetMusicResponse>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((com.music.grpc.MusicServiceOuterClass.GetMusicByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.GetMusicByIdResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.music.grpc.MusicServiceOuterClass.CreateMusicRequest) request,
              (io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.CreateMusicResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.music.grpc.MusicServiceOuterClass.UpdateMusicRequest) request,
              (io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.UpdateMusicResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.music.grpc.MusicServiceOuterClass.DeleteMusicRequest) request,
              (io.grpc.stub.StreamObserver<com.music.grpc.MusicServiceOuterClass.DeleteMusicResponse>) responseObserver);
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

  private static abstract class MusicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MusicServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.music.grpc.MusicServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MusicService");
    }
  }

  private static final class MusicServiceFileDescriptorSupplier
      extends MusicServiceBaseDescriptorSupplier {
    MusicServiceFileDescriptorSupplier() {}
  }

  private static final class MusicServiceMethodDescriptorSupplier
      extends MusicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MusicServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MusicServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MusicServiceFileDescriptorSupplier())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

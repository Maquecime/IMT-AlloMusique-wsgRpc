package com.music.grpc.server;

import com.google.protobuf.Empty;
import com.music.grpc.MusicServiceGrpc.MusicServiceImplBase;
import com.music.grpc.MusicServiceOuterClass;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.music.grpc.MusicServiceOuterClass.GetMusicResponse;

import java.io.IOException;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(5000)
                .addService(new MusicServiceImpl()).build();

        server.start();
        server.awaitTermination();

    }

    public static class MusicServiceImpl extends  MusicServiceImplBase {
        @Override
        public void getAll(Empty request, StreamObserver<MusicServiceOuterClass.GetMusicResponse> responseObserver) {
            GetMusicResponse reponse = GetMusicResponse.newBuilder().setMessageCode(0).setResponseMessage("listofMusic").build();
            responseObserver.onNext(reponse);
            responseObserver.onCompleted();
        }

        @Override
        public void getById(MusicServiceOuterClass.GetMusicByIdRequest request, StreamObserver<MusicServiceOuterClass.GetMusicByIdResponse> responseObserver) {
            super.getById(request, responseObserver);
        }

        @Override
        public void create(MusicServiceOuterClass.CreateMusicRequest request, StreamObserver<MusicServiceOuterClass.CreateMusicResponse> responseObserver) {
            super.create(request, responseObserver);
        }

        @Override
        public void update(MusicServiceOuterClass.UpdateMusicRequest request, StreamObserver<MusicServiceOuterClass.UpdateMusicResponse> responseObserver) {
            super.update(request, responseObserver);
        }

        @Override
        public void delete(MusicServiceOuterClass.DeleteMusicRequest request, StreamObserver<MusicServiceOuterClass.DeleteMusicResponse> responseObserver) {
            super.delete(request, responseObserver);
        }

    }
}

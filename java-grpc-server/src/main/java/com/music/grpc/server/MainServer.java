package com.music.grpc.server;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.protobuf.Empty;
import com.music.grpc.MusicServiceGrpc.MusicServiceImplBase;
import com.music.grpc.MusicServiceOuterClass;
import com.music.grpc.MusicServiceOuterClass.Music;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.music.grpc.MusicServiceOuterClass.GetMusicResponse;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

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
            Gson gson = new Gson();
            try {
                JsonReader reader = new JsonReader(new FileReader("D:\\School\\IMT Ales\\S7\\Web Service\\IMT-AlloMusique-wsgRpc\\java-grpc-server\\src\\main\\data\\music.json"));
                //JsonReader reader = new JsonReader(new FileReader("~\\main\\data\\music.json"));
                Music[] musics = gson.fromJson(reader, Music[].class);
                GetMusicResponse.Builder builder = MusicServiceOuterClass.GetMusicResponse.newBuilder();
                for (Music music:musics) {
                    builder.addMusic(music).build();
                }
                builder.setMessageCode(0);
                GetMusicResponse response = builder.build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

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

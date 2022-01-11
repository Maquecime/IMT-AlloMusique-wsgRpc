package com.music.grpc.server;

import com.google.common.reflect.TypeToken;
import com.google.gson.*;
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
import java.io.FileWriter;
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
                Type dataType = new TypeToken<ArrayList<Music>>(){}.getType();
                ArrayList<Music> musics = gson.fromJson(reader, dataType);
                GetMusicResponse.Builder builder = MusicServiceOuterClass.GetMusicResponse.newBuilder();
                for (Music music:musics) {
                    builder.addMusic(music).build();
                }
                builder.setMessageCode(0);
                GetMusicResponse response = builder.build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                reader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        @Override
        public void getById(MusicServiceOuterClass.GetMusicByIdRequest request, StreamObserver<MusicServiceOuterClass.GetMusicByIdResponse> responseObserver) {
            Gson gson = new Gson();
            try {
                JsonReader reader = new JsonReader(new FileReader("D:\\School\\IMT Ales\\S7\\Web Service\\IMT-AlloMusique-wsgRpc\\java-grpc-server\\src\\main\\data\\music.json"));
                Type dataType = new TypeToken<ArrayList<Music>>(){}.getType();
                ArrayList<Music> musics = gson.fromJson(reader, dataType);
                MusicServiceOuterClass.GetMusicByIdResponse.Builder builder = MusicServiceOuterClass.GetMusicByIdResponse.newBuilder();
                Music musicToSend = null;
                for (Music music:musics) {
                    if (music.getId() == request.getMusicId()) {
                        musicToSend = music;
                    }
                }
                if (musicToSend != null) {
                    builder.setMusic(musicToSend);
                    MusicServiceOuterClass.GetMusicByIdResponse response = builder.build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                } else {
                    System.out.printf("No music found for this id : " + request.getMusicId());
                }
                reader.close();
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }
        }

        @Override
        public void create(MusicServiceOuterClass.CreateMusicRequest request, StreamObserver<MusicServiceOuterClass.CreateMusicResponse> responseObserver) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try {
                JsonReader reader = new JsonReader(new FileReader("D:\\School\\IMT Ales\\S7\\Web Service\\IMT-AlloMusique-wsgRpc\\java-grpc-server\\src\\main\\data\\music.json"));
                Type dataType = new TypeToken<ArrayList<Music>>(){}.getType();
                ArrayList<Music> musics = gson.fromJson(reader, dataType);
                FileWriter writer = new FileWriter("D:\\School\\IMT Ales\\S7\\Web Service\\IMT-AlloMusique-wsgRpc\\java-grpc-server\\src\\main\\data\\music.json");
                musics.add(request.getMusic());
                gson.toJson(musics, writer);
                MusicServiceOuterClass.CreateMusicResponse response = MusicServiceOuterClass.CreateMusicResponse.newBuilder().setMessageCode(0).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                reader.close();
                writer.close();
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }
        }

        @Override
        public void update(MusicServiceOuterClass.UpdateMusicRequest request, StreamObserver<MusicServiceOuterClass.UpdateMusicResponse> responseObserver) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try {
                JsonReader reader = new JsonReader(new FileReader("D:\\School\\IMT Ales\\S7\\Web Service\\IMT-AlloMusique-wsgRpc\\java-grpc-server\\src\\main\\data\\music.json"));
                Type dataType = new TypeToken<ArrayList<Music>>(){}.getType();
                ArrayList<Music> musics = gson.fromJson(reader, dataType);
                ArrayList<Music> musicsUpdate = new ArrayList<Music>();
                FileWriter writer = new FileWriter("D:\\School\\IMT Ales\\S7\\Web Service\\IMT-AlloMusique-wsgRpc\\java-grpc-server\\src\\main\\data\\music.json");
                for (Music music:musics) {
                    if (music.getId() == request.getMusic().getId()) {
                        musicsUpdate.add(request.getMusic());
                    } else {
                        musicsUpdate.add(music);
                    }
                }
                gson.toJson(musicsUpdate, writer);
                MusicServiceOuterClass.UpdateMusicResponse response = MusicServiceOuterClass.UpdateMusicResponse.newBuilder().setMessageCode(0).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                reader.close();
                writer.close();
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }
        }

        @Override
        public void delete(MusicServiceOuterClass.DeleteMusicRequest request, StreamObserver<MusicServiceOuterClass.DeleteMusicResponse> responseObserver) {
            super.delete(request, responseObserver);
        }

    }
}

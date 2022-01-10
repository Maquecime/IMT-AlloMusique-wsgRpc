package com.music.grpc.client;

import com.google.protobuf.Empty;
import com.music.grpc.MusicServiceGrpc;
import com.music.grpc.MusicServiceOuterClass.GetMusicResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class MainClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5000).usePlaintext().build();
        MusicServiceGrpc.MusicServiceBlockingStub musicServiceBlockingStub = MusicServiceGrpc.newBlockingStub(channel);
        GetMusicResponse response = musicServiceBlockingStub.getAll(Empty.getDefaultInstance());
        System.out.println("music = " + response.getResponseMessage());
        channel.shutdown();
    }
}

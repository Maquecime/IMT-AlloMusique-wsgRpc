package com.music.grpc.client;

import com.google.protobuf.Empty;
import com.music.grpc.MusicServiceGrpc;
import com.music.grpc.MusicServiceOuterClass;
import com.music.grpc.MusicServiceOuterClass.GetMusicResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class MainClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5000).usePlaintext().build();
        MusicServiceGrpc.MusicServiceBlockingStub musicServiceBlockingStub = MusicServiceGrpc.newBlockingStub(channel);

        // Get All
        GetMusicResponse responseAll = musicServiceBlockingStub.getAll(Empty.getDefaultInstance());
        System.out.println("All musics : ");
        for (MusicServiceOuterClass.Music music:responseAll.getMusicList()) {
            System.out.println("\t- " + music.getTitle());
        }

        // Get by Id
        int id = 3;
        MusicServiceOuterClass.GetMusicByIdRequest requestId = MusicServiceOuterClass.GetMusicByIdRequest.newBuilder().setMusicId(id).build();
        MusicServiceOuterClass.GetMusicByIdResponse responseId = musicServiceBlockingStub.getById(requestId);
        System.out.println("music at id " + id + " is : " + responseId.getMusic().getTitle());

        // Create music
        MusicServiceOuterClass.Music musicToCreate = MusicServiceOuterClass.Music.newBuilder()
                .setId(9)
                .setTitle("Rechute")
                .setAuthorId(3)
                .setNbNote(0)
                .setTotalNote(0)
                .build();
        MusicServiceOuterClass.CreateMusicRequest requestCreate = MusicServiceOuterClass.CreateMusicRequest.newBuilder().setMusic(musicToCreate).build();
        MusicServiceOuterClass.CreateMusicResponse responseCreate = musicServiceBlockingStub.create(requestCreate);
        System.out.println("code creation : " + String.valueOf(responseCreate.getMessageCode()));

        // Update music
        MusicServiceOuterClass.Music musicToUpdate = MusicServiceOuterClass.Music.newBuilder()
                .setId(7)
                .setTitle("Life")
                .setAuthorId(4)
                .setNbNote(60)
                .setTotalNote(200)
                .build();
        MusicServiceOuterClass.UpdateMusicRequest requestUpdate = MusicServiceOuterClass.UpdateMusicRequest.newBuilder().setMusic(musicToUpdate).build();
        MusicServiceOuterClass.UpdateMusicResponse responseUpdate = musicServiceBlockingStub.update(requestUpdate);
        System.out.println("code update : " + String.valueOf(responseUpdate.getMessageCode()));

        // Delete music

        MusicServiceOuterClass.DeleteMusicRequest requestDelete = MusicServiceOuterClass.DeleteMusicRequest.newBuilder().setMusicId(id).build();
        MusicServiceOuterClass.DeleteMusicResponse responseDelete = musicServiceBlockingStub.delete(requestDelete);
        System.out.println("code delete : " + String.valueOf(responseDelete.getMessageCode()));

        channel.shutdown();
    }
}

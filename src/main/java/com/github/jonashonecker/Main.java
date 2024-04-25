package com.github.jonashonecker;

public class Main {
    public static void main(String[] args) {
        Playable myMusicPlayer = new MusicPlayer();
        Playable myVideoPlayer = new VideoPlayer();
        MediaController myMediaController = new MediaController();
        myMediaController.playMedia(myMusicPlayer);
        myMediaController.playMedia(myVideoPlayer);
    }
}
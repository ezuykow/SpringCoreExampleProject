package ru.ezuykow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicGenres;

    public MusicPlayer(List<Music> musicGenres) {
        this.musicGenres = musicGenres;
    }

    public String playMusic() {
        Random r = new Random();
        Music m = musicGenres.get(r.nextInt(musicGenres.size()));

        return ("playing " + m.getSong());
    }
}

package ru.ezuykow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music classicalMusic;
    private final Music rockMusic;
    private final Music technoMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("technoMusic") Music technoMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.technoMusic = technoMusic;
    }

    public String playMusic(MusicGenre genre) {
        String s;
        switch (genre) {
            case CLASSICAL:
                s = classicalMusic.getSong();
                break;
            case ROCK:
                s = rockMusic.getSong();
                break;
            case TECHNO:
                s = technoMusic.getSong();
                break;
            default:
                s = "There are no this music.";
        }
        return s;
    }
}

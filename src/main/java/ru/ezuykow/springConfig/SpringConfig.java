package ru.ezuykow.springConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.ezuykow.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public TechnoMusic technoMusic() {
        return new TechnoMusic();
    }

    @Bean
    public List<Music> musicGenres() {
        List<Music> musicGenres = new ArrayList<>();
        musicGenres.add(classicalMusic());
        musicGenres.add(rockMusic());
        musicGenres.add(technoMusic());
        return musicGenres;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenres());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}

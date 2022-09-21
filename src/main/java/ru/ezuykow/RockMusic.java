package ru.ezuykow;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private static List<String> songsList = new ArrayList<>();

    static {
        songsList.add("Wind cries Mary");
        songsList.add("San Quentin");
        songsList.add("Love of Mine");
    }

    public String getSong() {
        Random r = new Random();

        return songsList.get(r.nextInt(songsList.size()));
    }
}

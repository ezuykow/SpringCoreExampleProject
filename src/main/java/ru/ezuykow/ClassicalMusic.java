package ru.ezuykow;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private static List<String> songsList = new ArrayList<>();

    static {
        songsList.add("Hungarian Rhapsody");
        songsList.add("Rhapsody in Blue");
        songsList.add("Entry of the Gladiators");
    }

    public String getSong() {
        Random r = new Random();

        return songsList.get(r.nextInt(songsList.size()));
    }
}

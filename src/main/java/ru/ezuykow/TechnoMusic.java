package ru.ezuykow;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class TechnoMusic implements Music{
    private static List<String> songsList = new ArrayList<>();

    static {
        songsList.add("I Have a Dream");
        songsList.add("Hanomag");
        songsList.add("Big Momma");
    }

    public String getSong() {
        Random r = new Random();

        return songsList.get(r.nextInt(songsList.size()));
    }
}

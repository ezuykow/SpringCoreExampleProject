package ru.ezuykow;

import org.springframework.stereotype.Component;

@Component
public class TechnoMusic implements Music{
    public String getSong() {
        return "I have a dream";
    }
}

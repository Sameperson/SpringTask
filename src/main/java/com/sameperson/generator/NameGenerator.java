package com.sameperson.generator;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NameGenerator {

    public NameGenerator() {}

    public String generateName() {
        Random random = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < 3; i++) {
            sb.append(letters.charAt(random.nextInt(letters.length())));
        }
        return sb.toString();
    }
}
package com.bruno.exercicio.domain;

import java.util.Arrays;

public class Anime {

    private String name;
    private final Integer[] episodes;

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
        printAnimeData();
    }

    {
        episodes = new Integer[100];
        for (int index = 0; index < episodes.length; index++) episodes[index] = index + 1;
        printAnimeData();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getEpisodes() {
        return episodes;
    }

    public void printAnimeData() {
        System.out.println("\nAnime" +
                "\nnome: " + name +
                "\nepisódios: " + Arrays.toString(episodes));
    }
}

package com.bruno.exercicio;

import com.bruno.exercicio.domain.Anime;

public class Main {

    public static void main(String[] args) {

        Anime anime1 = new Anime();

        anime1.init("Bruno", "Mangá", 12);
        anime1.init("Bruno", "TV", 12, "Ação");

        anime1.printAnimeData();
    }
}

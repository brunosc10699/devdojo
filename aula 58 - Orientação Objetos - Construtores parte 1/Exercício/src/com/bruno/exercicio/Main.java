package com.bruno.exercicio;

import com.bruno.exercicio.domain.Anime;

public class Main {

    public static void main(String[] args) {

        Anime anime1 = new Anime();
        Anime anime2 = new Anime("Hataskanata", "Mangá", 50, "Ação");

        anime1.init("Shibuya", "Mangá", 12);
        anime1.init("Shibuya", "TV", 12, "Ação");

        anime1.printAnimeData();

        anime2.printAnimeData();
    }
}

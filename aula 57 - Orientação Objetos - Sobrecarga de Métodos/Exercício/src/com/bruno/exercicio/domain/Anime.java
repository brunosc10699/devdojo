package com.bruno.exercicio.domain;

public class Anime {

    private String name;
    private String type;
    private Integer numberOfEpisodes;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void init(String name, String type, Integer numberOfEpisodes) {
        this.name = name;
        this.type = type;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void init(String name, String type, Integer numberOfEpisodes, String genre) {
        this.init(name, type, numberOfEpisodes);
        this.genre = genre;
    }

    public void printAnimeData() {
        System.out.println("Anime" +
                "\nnome: " + name +
                "\ntipo: " + type +
                "\nepisódios: " + numberOfEpisodes +
                "\ngenre: " + genre);
    }
}

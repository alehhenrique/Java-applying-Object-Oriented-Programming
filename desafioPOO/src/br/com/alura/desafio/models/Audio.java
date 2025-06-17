package br.com.alura.desafio.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int Classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return Classification;
    }

    public void like(){
        this.totalLikes++;
    }

    public void reproduces(){
        this.totalReproductions++;
    }
}

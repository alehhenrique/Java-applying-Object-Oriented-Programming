package br.com.alura.desafio.main;

import br.com.alura.desafio.models.Podcasts;
import br.com.alura.desafio.models.Songs;

public class Main {
    public static void main(String[] args) {
        Songs mySong = new Songs();
        mySong.setTitle("Samurai (feat.Stevie Wonder)");
        mySong.setSinger("Djavan");

        for (int i = 1; i <= 1000; i++) {
            mySong.reproduces();
        }

        for (int i = 1; i <= 50; i++) {
            mySong.like();
        }

        Podcasts myPodcast = new Podcasts();
        myPodcast.setTitle("Podpah");
        myPodcast.setHost("Igão e Mítico");

        for (int i = 1; i <= 5000; i++) {
            myPodcast.reproduces();
        }

        for (int i = 1; i <= 1000; i++) {
            myPodcast.like();
        }

    }
}

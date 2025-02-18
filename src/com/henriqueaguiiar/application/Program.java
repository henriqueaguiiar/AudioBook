package com.henriqueaguiiar.application;

import com.henriqueaguiiar.entities.MinhasPreferidas;
import com.henriqueaguiiar.entities.Music;
import com.henriqueaguiiar.entities.Podcast;

public class Program {
    public static void main(String[] args) {

        Music music = new Music();
        music.setTitulo("Bohemian Rhapsody");
        music.setCantor("Queen");

        for(int i = 0; i< 5000; i++){
            music.reproduzir();
        }

        for(int i = 0; i< 50; i++){
            music.curte();
        }
        Podcast podcast = new Podcast();

        podcast.setTitulo("NerdCast");
        podcast.setHost("Jovem Nerd");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(music);
        preferidas.inclui(podcast);









    }
}

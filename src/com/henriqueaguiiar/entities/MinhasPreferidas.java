package com.henriqueaguiiar.entities;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassicacao() >= 9){
            System.out.println(audio.getTitulo() + " é ocnsiderado sucesso absoluto");
        }else{
            System.out.println(audio.getTitulo() + " é um sucesso");
        }
    }
}

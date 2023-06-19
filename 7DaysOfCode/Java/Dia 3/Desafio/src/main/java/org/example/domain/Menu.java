package org.example.domain;

import org.example.control.filmes.Filme;
import org.example.control.filmes.MostraFilmes;
import org.example.domain.busca.Busca;

import java.util.List;

public class Menu {
    public static void exibeMenu(){
        System.out.println("""
                Bem-vindo a mais uma sequencia de desafios do #7DaysOfCode, 
                dessa vez a semana de desafio é em Java.
                Vamos la!
                """);
        Busca busca = new Busca();
        MostraFilmes mostraFilmes = new MostraFilmes(busca.executaBusca());
        System.out.println(mostraFilmes.toString());

    }
}

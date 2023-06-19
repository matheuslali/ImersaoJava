package org.example.domain;

import org.example.control.filmes.Filme;
import org.example.control.filmes.MostraFilmes;
import org.example.control.html.HTMLGenerator;
import org.example.domain.busca.Busca;
import org.example.domain.busca.RecebeBusca;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.util.List;

public class  Menu {
    public static void exibeMenu(){
        try {
            System.out.println("""
                    Bem-vindo a mais uma sequencia de desafios do #7DaysOfCode, 
                    dessa vez a semana de desafio é em Java.
                    Vamos la!
                    """);
            Busca.executaBusca();

            PrintWriter writer = new PrintWriter("exibeFilme.html");
            HTMLGenerator htmlGenerator = new HTMLGenerator(writer);

            MostraFilmes lista = new MostraFilmes(Busca.executaBusca());

            htmlGenerator.generate(lista.getListaFilmes());
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

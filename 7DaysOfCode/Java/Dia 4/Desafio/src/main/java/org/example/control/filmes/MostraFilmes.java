package org.example.control.filmes;

import org.example.domain.busca.RecebeBusca;

import java.util.ArrayList;
import java.util.List;

public class MostraFilmes {
    private List<Filme> listaFilmes;



    public MostraFilmes(List<RecebeBusca> lista) {
        this.listaFilmes = new ArrayList<>();
        for (RecebeBusca recebeBusca : lista){
            Filme filme = new Filme(recebeBusca);
            listaFilmes.add(filme);
        }
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Filme filme: listaFilmes){
            sb.append("Titulo: ").append(filme.getTitle()).append("\n");
            sb.append("URL da Imagem: ").append(filme.getImage()).append("\n");
        }
        return sb.toString();
    }
}

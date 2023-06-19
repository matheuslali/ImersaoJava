package org.example.control.filmes;

import org.example.domain.busca.RecebeBusca;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imDbRatingCount;
    private List<Filme> listaFilmes;



    public Filme(RecebeBusca recebeBusca){
        this.id = recebeBusca.id();
        this.rank = recebeBusca.rank();
        this.title = recebeBusca.title();
        this.fullTitle = recebeBusca.fullTitle();
        this.year = recebeBusca.year();
        this.image = recebeBusca.image();
        this.crew = recebeBusca.crew();
        this.imDbRating = recebeBusca.imDbRating();
        this.imDbRatingCount = recebeBusca.imDbRatingCount();

    }

//    public void listAdd(List<RecebeBusca> lista){
//        this.listaFilmes = new ArrayList<>();
//        for (RecebeBusca recebeBusca : lista){
//            Filme filme = new Filme(recebeBusca);
//            this.listaFilmes.add(filme);
//        }
//    }

    public String mostraLista(){
        return listaFilmes.toString();
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public String getId() {
        return id;
    }

    public String getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public String getYear() {
        return year;
    }

    public String getImage() {
        return image;
    }

    public String getCrew() {
        return crew;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public String getImDbRatingCount() {
        return imDbRatingCount;
    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Filme filme: listaFilmes){
//            sb.append("Titulo: ").append(filme.getTitle()).append("\n");
//            sb.append("URL da Imagem: ").append(filme.getImage()).append("\n");
//        }
//        return sb.toString();
//    }
}

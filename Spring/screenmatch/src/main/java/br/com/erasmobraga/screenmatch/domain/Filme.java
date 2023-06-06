package br.com.erasmobraga.screenmatch.domain;

import br.com.erasmobraga.screenmatch.domain.filme.DadosCadastroFilme;

public class Filme {
    private String nome;
    private Integer duracaoEmMinutos;
    private String genero;
    private Integer anoLancamento;

    public Filme(DadosCadastroFilme dados){
        this.nome = dados.nome();
        this.anoLancamento = dados.anoLancamento();
        this.duracaoEmMinutos = dados.duracao();
        this.genero = dados.genero();

    }


    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", genero='" + genero + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }

}

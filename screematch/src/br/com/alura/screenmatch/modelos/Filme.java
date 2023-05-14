package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private double avaliacaoIMBb;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        System.out.println("Duração do filme: "+ duracaoEmMinutos+"m");
    }

    public void clienteAvalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacao++;

    }

    public double mediaAvaliacoes(){
        return somaAvaliacoes/totalDeAvaliacao;
    }
}


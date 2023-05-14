import br.com.alura.screenmatch.modelos.Filme;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Star Wars: Episódio I - A Ameaça Fantasma");
        filme1.setAnoDeLancamento(1999);
        filme1.setDuracaoEmMinutos(136);
        //filme1.avaliacaoIMBb = 6.5;
        System.out.println("");
        filme1.exibeFichaTecnica();
        System.out.println("");

        var filme2 = new Filme();
        filme2.setNome("Star Wars: Episódio II - Ataque dos Clones");
        filme2.setAnoDeLancamento(2002);
        filme2.setDuracaoEmMinutos(142);
        filme2.exibeFichaTecnica();

        filme1.clienteAvalia(5);
        filme1.clienteAvalia(9);
        filme1.clienteAvalia(7);

        //System.out.println("\nTotal de avaliações: "+ filme1.getTotalDeAvaliacao());
        //System.out.println("Soma das avaliações: "+ filme1.somaAvaliacoes);
        //System.out.println("Média das avaliações: "+ filme1.mediaAvaliacoes());

    }
}
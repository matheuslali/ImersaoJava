package medelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void exibeMenu() throws IOException, InterruptedException {
        var leitura = new Scanner(System.in);
        System.out.println("\nBem-vindo a mais um desafio de Java!\n");
        System.out.println("Hoje vamos fazer um Busca CEP");
        System.out.println("Após a buscar ser realizada, sera criado um arquivo .json" +
                " com os dados do resultado da busca");
        System.out.println("\nDigite o CEP que deseja buscar:");
        var resp1 = leitura.nextLine();
        var cep = "https://viacep.com.br/ws/"+resp1.replace("-","")+"/json/";
        BuscaCep buscaCep = new BuscaCep();
        var resultado = buscaCep.buscaCep(cep);
        MostraCep mostraCep = new MostraCep(resultado);
        System.out.println(resultado);
        System.out.println(mostraCep);





    }
}

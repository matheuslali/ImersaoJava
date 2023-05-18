package medelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Menu {
    public static void exibeMenu() throws IOException, InterruptedException {
        var leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();


        System.out.println("\nBem-vindo a mais um desafio de Java!\n");
        System.out.println("Hoje vamos fazer um Busca CEP");
        System.out.println("Após a buscar ser realizada, sera criado um arquivo .json" +
                " com os dados do resultado da busca");
        System.out.println("\nDigite o CEP que deseja buscar:");
        var resp1 = leitura.nextLine();
        var endereco = "https://viacep.com.br/ws/"+resp1.replace("-","")+"/json/";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);
        RecebeCep recebeCep = gson.fromJson(json, RecebeCep.class);
        System.out.println(recebeCep);
        MostraCep mostraCep = new MostraCep(recebeCep);
        System.out.println(mostraCep);





    }
}

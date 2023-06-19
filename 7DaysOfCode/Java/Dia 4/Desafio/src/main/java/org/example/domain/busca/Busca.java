package org.example.domain.busca;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Busca {
    public List<RecebeBusca> executaBusca(){
        String apiKey = ("k_r19c90pl");
        URI apiIMDB = URI.create("https://imdb-api.com/en/API/Top250Movies/"+ apiKey);
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(apiIMDB)
                .GET()
                .build();
        try {
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            BuscaResponse buscaResponse = gson.fromJson(json, BuscaResponse.class);
            return buscaResponse.items();
            } catch (Exception e) {
                throw new RuntimeException("A requisição nao pode ser completada", e);

        }

    }

}

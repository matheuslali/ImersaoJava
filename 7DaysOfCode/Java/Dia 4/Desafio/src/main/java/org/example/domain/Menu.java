package org.example.domain;

import org.example.control.filmes.Filme;
import org.example.control.filmes.MostraFilmes;
import org.example.control.html.HTMLGenerator;
import org.example.domain.busca.Busca;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.util.List;

public class Menu {
    public static void exibeMenu(){
        try {
            System.out.println("""
                    Bem-vindo a mais uma sequencia de desafios do #7DaysOfCode, 
                    dessa vez a semana de desafio é em Java.
                    Vamos la!
                    """);
            Busca busca = new Busca();
            busca.executaBusca();


            PrintWriter writer = new PrintWriter("exibeFilme.html");
            HTMLGenerator htmlGenerator = new HTMLGenerator(writer);

            MostraFilmes lista = new MostraFilmes(busca.executaBusca());
            System.out.println(lista.toString());

            String title = "Info Films";
            String body =
            String div = """
<div class=\"card text-white bg-dark mb-3\" style=\"max-width: 18rem;\">
	<h4 class=\"card-header\">%s</h4>
	<div class=\"card-body\">
		<img class=\"card-img\" src=\"%s\" alt=\"%s\">
		<p class=\"card-text mt-2\">Nota: %s - Ano: %s</p>
	</div>
</div>
""";
            htmlGenerator.generate(title, body, div);


            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

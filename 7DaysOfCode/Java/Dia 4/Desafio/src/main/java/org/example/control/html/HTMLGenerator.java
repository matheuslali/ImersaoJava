package org.example.control.html;

import org.example.control.filmes.Filme;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class HTMLGenerator {
    private PrintWriter out;

    public HTMLGenerator(PrintWriter writer) {
        this.out = writer;
    }

    public void generate(List<Filme> filmes){
        try {
            out.write("""
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                    	<meta charset="utf-8">
                    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                    	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">	
                    """);
            out.write("<title>Info Filmes</title>");
            out.write("</head>");
            out.write("<body>");
            for (Filme film: filmes) {
                String div = """
                        <div class=\"card text-white bg-dark mb-3\" style=\"max-width: 18rem;\">
                        	<h4 class=\"card-header\">%s</h4>
                        	<div class=\"card-body\">
                        		<img class=\"card-img\" src=\"%s\" alt=\"%s\">
                        		<p class=\"card-text mt-2\">Nota: %s - Ano: %s</p>
                        	</div>
                        </div>
                        """;
                out.println(String.format(div, film.getTitle(), film.getImage(), film.getTitle(), film.getImDbRating(), film.getYear()));
            }
            out.write("</body>");
            out.write("</html>");
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

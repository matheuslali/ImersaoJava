package org.example.control.html;

import org.example.control.filmes.Filme;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class HTMLGenerator {
    private Writer out;

    public HTMLGenerator(Writer writer) {
        this.out = writer;
    }

    public void generate(List<Filme> filmes){
        try {
            out.write("""
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                    	<meta charset=\\"utf-8\\">
                    	<meta name=\\"viewport\\" content=\\"width=device-width, initial-scale=1, shrink-to-fit=no\\">
                    	<link rel=\\"stylesheet\\" href=\\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\\" integrity=\\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\\" crossorigin=\\"anonymous\\">	
                    """);
            out.write("<title>"+title+"</title>");
            out.write("</head>");
            out.write("<body>");
            out.write(div);
            out.write(body);
            out.write("</body>");
            out.write("</html>");
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

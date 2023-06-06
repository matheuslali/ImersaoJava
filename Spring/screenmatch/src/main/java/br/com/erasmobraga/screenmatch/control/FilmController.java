package br.com.erasmobraga.screenmatch.control;

import br.com.erasmobraga.screenmatch.domain.Filme;
import br.com.erasmobraga.screenmatch.domain.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmController {
    private List<Filme> filmes = new ArrayList<>();

    @GetMapping
    public String formularioCadastraFilme(){
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme (DadosCadastroFilme dados){
        var filme = new Filme(dados);
        filmes.add(filme);
        System.out.println(filmes);

        return "filmes/formulario";
    }

}

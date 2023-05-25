package com.example.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<Empresa> lista = new ArrayList<>();

    static {
        var empresa = new Empresa();
        empresa.setNome("Alura");
        var empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        lista.add(empresa);
        lista.add(empresa2);
    }

    public void adciona(Empresa empresa) {
        lista.add(empresa);
    }
    public List<Empresa> getEmpresas(){
        return lista;
    }
}

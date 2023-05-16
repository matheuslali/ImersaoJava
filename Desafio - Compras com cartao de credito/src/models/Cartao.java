package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cartao {
    private String nome;
    private double limite;
    private double saldo;
    private List<Compra> compras;
    protected String gerarNumeroCartao;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean verificaCompra (Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;
    private int cvv;
    private String dataValiade = "08/29";

    public int getCvv() {
        var random = new Random();
        var senha = new StringBuilder();
        int algarismoPorGrupo = 3;
        for(int i = 0; i<algarismoPorGrupo; i++){
            int algarismo = random.nextInt(10);
            senha.append(algarismo);
        }
        this.cvv = Integer.parseInt(senha.toString());
        return this.cvv;
    }

    public String getDataValiade() {
        return dataValiade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String gerarNumeroCartao(){
        var numero = new StringBuilder();
        int grupos = 4;
        int algorismoPorGrupo=4;
        var random = new Random();

        for (int i = 0; i<grupos;i++){
            var grupo = new StringBuilder();
            for(int j = 0; j<algorismoPorGrupo;j++){
                int algarismo = random.nextInt(10);
                grupo.append(algarismo);
            }
            numero.append(grupo).append(" ");
        }
        return numero.toString().trim();
    }

}

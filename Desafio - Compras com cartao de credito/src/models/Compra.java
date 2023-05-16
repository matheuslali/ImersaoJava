package models;

public class Compra {
    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {

        return "Compras: \nDescrição do item comprado: " + descricao + "\nValor da compra: R$ "+ valor+"\n";
    }
}

package models;

public class Compra implements Comparable<Compra>{
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

        return "Compras: \nDescrição do item comprado: " + getDescricao() + "\nValor da compra: R$ "+ getValor()+"\n";
    }

    @Override
    public int compareTo(Compra outrasCompras) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outrasCompras.valor));
    }
}

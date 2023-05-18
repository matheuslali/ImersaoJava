package medelos;

public class MostraCep {
    public MostraCep (RecebeCep recebeCep){
        this.cep = recebeCep.cep();
        this.logadouro = recebeCep.logradouro();
        this.localidade = recebeCep.localidade();
        this.bairro = recebeCep.bairro();
        this.complemento = recebeCep.complemento();
    }
    String cep;
    String logadouro;
    String complemento;
    String bairro;
    String localidade;



    @Override
    public String toString() {
        return "DADOS: \n\nCEP: " + cep +
                "\nLogadouro: " + logadouro + "\nComplemento: "+ complemento +"\nBairro: "+ bairro + "\nLocalidade: "+localidade;
    }
}

package models;

import java.util.*;

public class Menu {
    public static void exibeMenu() {
        var in = new Scanner(System.in);
        var cartao1 = new Cartao(2500);
        System.out.println("**********************\n");
        System.out.println("Seja bem-vindo a mais um desafio de Java");
        System.out.println("Hoje iremos fazer uma aplicação de compras");
        System.out.println("Iremos começar gerando um cartão de credito novo");
        System.out.println("Vamos lá?");
        System.out.println("\n*********************\n");
        System.out.println("Deseja cadastrar um novo cartão?");
        System.out.println("Responda com sim ou não");
        String resp1 = in.nextLine();

        if (resp1.equals("sim")) {
            System.out.println("Digie seu nome completo: ");
            cartao1.setNome(in.nextLine());
            System.out.println("\nDigite seu CPF");
            cartao1.setCpf(in.nextLine());
            System.out.println("\n• GERANDO CARTÃO •");
            System.out.println("**************************");
            System.out.println("Dados do cartão de Credito\n");
            System.out.println("Nome: " + cartao1.getNome());
            cartao1.gerarNumeroCartao();
            System.out.println("\nNumero: " + cartao1.gerarNumeroCartao());
            cartao1.getCvv();
            System.out.println("\nVal: " + cartao1.getDataValiade() + "\t\tCVV: " + cartao1.getCvv());
            System.out.println("\n**************************\n");
            System.out.println("Limite de crédito preestabelecido: " + cartao1.getLimite());
            System.out.println("Deseja iniciar as compras?");
            System.out.println("Responda com sim ou não");
            var resp2 = in.nextLine();
            double valor;
            String descricao;
            if (resp2.equals("sim")) {
                int resp3 = 1;
                while (resp3 != 3) {

                    System.out.println("Saldo de crédito: R$ " + cartao1.getSaldo() + "\n");
                    System.out.println("Digite a descrição do item a ser comprado");
                    descricao = in.next();
                    System.out.println("Digite o valor do item a ser comprado");
                    valor = in.nextDouble();
                    in.nextLine();
                    Compra compra = new Compra(descricao, valor);
                    var newCompra = cartao1.verificaCompra(compra);
                    if (newCompra) {
                        System.out.println("Compra realizada com sucesso!");
                        System.out.println("MENU: \n1 - Realizar outra compra\n3 - Sair");
                        resp3 = in.nextInt();
                    }else {
                        System.out.println("Saldo insuficiente para realizar essa compra.");
                        break;
                    }

                }


            }else if (resp2.equals("nao")){
                System.out.println("Até a proxima oportunidade!");
            } else{
                System.out.println("Resposta invalida, responda apenas com sim ou nao");
                System.out.println("Deseja iniciar as compras?");
                System.out.println("Responda com sim ou não");
                resp2 = in.nextLine();
            }


        }else {
            System.out.println("Até a proxima!");
        }
        System.out.println("************************");
        System.out.println("Compras Realizadas: \n");
        Collections.sort(cartao1.getCompras());
        for (Compra c : cartao1.getCompras()){
            System.out.println("Descrição: "+c.getDescricao()+ " - Valor: R$ "+c.getValor());
        }
        System.out.println("\n************************");
    }

}

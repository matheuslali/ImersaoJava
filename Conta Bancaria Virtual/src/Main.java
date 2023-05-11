import java.util.Scanner;

public class Main {
    public static Cliente cliente;
    public static mandaTransferencia mandaT;
    public static recebeTransferencia recebeT;
        public static void main(String[] args) {
            cliente = new Cliente();
            recebeT = new recebeTransferencia();
            mandaT = new mandaTransferencia();
            Scanner leitura = new Scanner(System.in);
            menuBemVindo();
            String respostaCadastro = leitura.nextLine();


            if (respostaCadastro.equals("S")){
                System.out.println("Okay! Primeiro nos diga o seu nome");
                cliente.nome = leitura.nextLine();
                System.out.println("Nos diga qual tipo de conta deseja contratar");
                System.out.println("Corrente ou Poupança");
                cliente.conta = leitura.nextLine();
                System.out.println("Quanto o Sr(a) irá depositar de saldo?");
                cliente.saldo = leitura.nextInt();

            }
            else {
                do {
                    if (respostaCadastro.equals("N")) {
                        System.out.println("Ahh... Uma pena, o Virutal Bank desejava te-lo(a) como cliente");
                        System.out.println("Obrigado por visitar o Virtual Bank!\n\n");
                        menuBemVindo();
                        respostaCadastro = leitura.nextLine();
                        return;

                    } else {
                        System.out.println("Resposta Invalida. Responda apenas com S ou N");
                        menuBemVindo();
                        respostaCadastro = leitura.nextLine();
                        return;

                    }
                }while (!respostaCadastro.equals("S"));
            }

            menuDadosIniciais();
            menuDeOperacoes();
            int opcao = leitura.nextInt();
            while (opcao != 4) {
                switch (opcao) {
                    case 1:
                        System.out.println("O seu saldo atual é de R$ " + cliente.saldo);
                        break;
                    case 2:
                        System.out.println("Informe o valor a receber: ");
                        recebeT.valor = leitura.nextInt();
                        recebeT.total = recebeT.valor + cliente.saldo;
                        cliente.saldo = recebeT.total;
                        System.out.println("\nSaldo atualizado para R$ " + recebeT.total);
                        break;
                    case 3:
                        System.out.println("Informe o valor a transferir: ");
                        mandaT.valor = leitura.nextInt();
                        if (mandaT.valor > 0 && mandaT.valor < cliente.saldo) {
                            mandaT.total =  cliente.saldo - mandaT.valor;
                            cliente.saldo = mandaT.total;
                            System.out.println("Saldo atualizado para R$ " + mandaT.total);
                        } else {
                            System.out.println("Não há saldo suficiente para fazer essa transferência.");
                            System.out.println("Digite um valor válido");

                        }
                        break;
                    case 4:
                        System.out.println("Até a proxima!");
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;

                }
                menuDeOperacoes();
                opcao = leitura.nextInt();
            }





    }


    public static void menuBemVindo(){
        System.out.println("**************************");
        System.out.println("Bem-vindo ao Virtual Bank!");
        System.out.println("\nNotamos que o Sr(a) ainda não tem cadastro");
        System.out.println("Deseja criar um cadastro?");
        System.out.println("Responda com S ou N");
    }

    public static void menuDadosIniciais(){
        System.out.println("*************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome :"+ cliente.nome);
        System.out.println("Tipo de conta: "+ cliente.conta);
        System.out.println("Saldo: "+ cliente.saldo);
        System.out.println("**************************");
    }

    public static void  menuDeOperacoes(){
        System.out.println("\n\nMenu de operações");
        System.out.println("\n1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("\nSelecione uma opção");
    }
}


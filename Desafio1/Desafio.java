import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int chances = 5, tentativas = 0, respostaNum, chancesResp = 5;
        int numAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        String resposta;
        System.out.println("Bem-vindo ao nosso mais novo jogo de adivinhação");
        System.out.println("Você tera 5 chances para acertar um numero, gerado aleatoriamente, entre 0 e 100");
        System.out.println("Vamos começar?\n");
        System.out.println("--------------------------------------");
            System.out.println("Okay, vamos lá!");
            System.out.println("Nosso numero aleatório ja foi gerado");
            System.out.println("Agora é sua vez de tentar acerta-lo\n");
            for (int i = 0; i < chances; i++) {
                ++tentativas;
                System.out.println("Éssa é a sua " + tentativas + "º tentativa, digite um numero aleatorio, entre 0 e 100 ");
                respostaNum = leitura.nextInt();
                if (respostaNum != numAleatorio) {
                    chancesResp--;
                    System.out.println("Não foi dessa vez! Você ainda tem mais " + chancesResp + " chances, boa sorte na proxima tentativa\n");
                }
                if (respostaNum == numAleatorio) {
                    System.out.println("Parabéns!! Você acertou!");
                    break;
                }
                if (respostaNum < 0 || respostaNum > 100) {
                    System.out.println("Você digitou um numero incorreto, digite um numero entre 0 a 100.");
                    break;
                }
                if (chancesResp == 0){
                    System.out.println("Você gastou todas as suas chances, GAME OVER");
                    System.out.println("O numero aleatorio gerado foi: "+ numAleatorio);
                }
            }
        }

    }


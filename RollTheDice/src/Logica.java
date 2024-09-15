import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Logica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] pontuacaoJogador1 = new int[3], pontuacaoJogador2 = new int[3];
        int somaTotalJogador1 = 0, somaTotalJogador2 = 0;

        System.out.print("Digite o nome do Jogador 1: ");
        String nomeJogador1 = scanner.nextLine();

        System.out.print("Digite o nome do Jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        for(int i = 0; i < 3; i++){
            pontuacaoJogador1[i] += random.nextInt(6) + 1;
            pontuacaoJogador2[i] += random.nextInt(6) + 1;

            somaTotalJogador1 += pontuacaoJogador1[i];
            somaTotalJogador2 += pontuacaoJogador2[i];
         }

        if(valoresIguais(pontuacaoJogador1, 3)) somaTotalJogador1 *= 3;
        else if(valoresIguais(pontuacaoJogador1, 2)) somaTotalJogador1 *= 2;

        if(valoresIguais(pontuacaoJogador2, 3)) somaTotalJogador2 *= 3;
        else if(valoresIguais(pontuacaoJogador2, 2)) somaTotalJogador2 *= 2;

        System.out.println(nomeJogador1 + " fez " + somaTotalJogador1 + " pontos");
        exibirDados(pontuacaoJogador1);

        System.out.println(nomeJogador2 + " fez " + somaTotalJogador2 + " pontos");
        exibirDados(pontuacaoJogador2);

        if(somaTotalJogador1 > somaTotalJogador2){
            System.out.println("Jogador 1 " + nomeJogador1 + " ganhou.");
        }else{
            System.out.println("Jogador 2 " + nomeJogador2 + " ganhou.");
        }
    }

    // Verifica se existem valores iguais nos dados;
    private static boolean valoresIguais(int[] dados, int quantidade){
        Arrays.sort(dados);
        int iguais = 1;
        for(int i = 1; i < dados.length; i++){
            if(dados[i] == dados[i - 1]) iguais++;
        }

        return iguais == quantidade;
    }

    private static void exibirDados(int[] dados){
        System.out.println("dado1 = " + dados[0] + " dado2 = " + dados[1] + " dado3 = " + dados[2]);
    }
}
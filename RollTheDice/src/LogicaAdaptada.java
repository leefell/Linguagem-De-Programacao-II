import java.util.Random;
import java.util.Arrays;

public class LogicaAdaptada {
    private int[] pontuacaoJogador1 = new int[3], pontuacaoJogador2 = new int[3];
    private int somaTotalJogador1 = 0, somaTotalJogador2 = 0;
    private String nomeJogador1, nomeJogador2;

    public LogicaAdaptada(String nomeJogador1, String nomeJogador2) {
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
    }

    // Método para jogador 1 jogar
    public void jogarJogador1() {
        Random random = new Random();
        somaTotalJogador1 = 0; // Reseta a pontuação antes de jogar
        for (int i = 0; i < 3; i++) {
            pontuacaoJogador1[i] = random.nextInt(6) + 1;
            somaTotalJogador1 += pontuacaoJogador1[i];
        }
        if (valoresIguais(pontuacaoJogador1, 3)) somaTotalJogador1 *= 3;
        else if (valoresIguais(pontuacaoJogador1, 2)) somaTotalJogador1 *= 2;
    }

    // Método para jogador 2 jogar
    public void jogarJogador2() {
        Random random = new Random();
        somaTotalJogador2 = 0; // Reseta a pontuação antes de jogar
        for (int i = 0; i < 3; i++) {
            pontuacaoJogador2[i] = random.nextInt(6) + 1;
            somaTotalJogador2 += pontuacaoJogador2[i];
        }
        if (valoresIguais(pontuacaoJogador2, 3)) somaTotalJogador2 *= 3;
        else if (valoresIguais(pontuacaoJogador2, 2)) somaTotalJogador2 *= 2;
    }

    // Método para verificar o vencedor
    public String determinarVencedor() {
        if (somaTotalJogador1 > somaTotalJogador2) {
            return "Jogador 1 " + nomeJogador1 + " ganhou.";
        } else if (somaTotalJogador1 < somaTotalJogador2) {
            return "Jogador 2 " + nomeJogador2 + " ganhou.";
        } else {
            return "Empate!";
        }
    }

    // Getters para acessar as pontuações e somas
    public int[] getPontuacaoJogador1() {
        return pontuacaoJogador1;
    }

    public int[] getPontuacaoJogador2() {
        return pontuacaoJogador2;
    }

    public int getSomaTotalJogador1() {
        return somaTotalJogador1;
    }

    public int getSomaTotalJogador2() {
        return somaTotalJogador2;
    }

    // Verifica se existem valores iguais nos dados
    private boolean valoresIguais(int[] dados, int quantidade) {
        Arrays.sort(dados);
        int iguais = 1;
        for (int i = 1; i < dados.length; i++) {
            if (dados[i] == dados[i - 1]) iguais++;
        }
        return iguais == quantidade;
    }
}

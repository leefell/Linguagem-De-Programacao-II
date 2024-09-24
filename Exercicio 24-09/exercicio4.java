import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class exercicio4 {
    public static void aprova4LeCSV() {
        try {
            File fileLer = new File("./alunos_notas.csv");
            File fileEscrever = new File("resultado.csv");

            BufferedReader br = new BufferedReader(new FileReader(fileLer));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileEscrever));

            Random random = new Random();
            String linha;
            int i = 0;

            while ((linha = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }

                String[] aluno = linha.split(",");
                String nome = aluno[0];
                float[] notasAluno = new float[aluno.length - 1];

                for (int j = 1; j < aluno.length; j++) {
                    notasAluno[j - 1] = random.nextInt(11);
                }

                float nota1 = notasAluno[0];
                float nota2 = notasAluno[1];

                float media = calcularMedia(nota1, nota2);
                boolean aprovado = isAprovado(media);

                bw.write("Nome: " + nome + "\n");
                bw.write("Nota 1: " + nota1 + "\n");
                bw.write("Nota 2: " + nota2 + "\n");
                bw.write("Média: " + media + "\n");
                bw.write("Situação: " + (aprovado ? "aprovado" : "reprovado") + "\n");
                bw.write("\n");
                i++;
            }

            br.close();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static float calcularMedia(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }

    private static boolean isAprovado(float media) {
        return media >= 6;
    }
}

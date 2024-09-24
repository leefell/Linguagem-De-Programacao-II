import java.io.*;

public class exercicio3 {
    public static void aprova3LeCSV() {
        try {
            File file = new File(
                    "./alunos_notas.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linha = null;
            int i = 0;
            while ((linha = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }
                String[] aluno = linha.split(",");
                String nome = aluno[0];
                float nota1 = Float.parseFloat(aluno[1]);
                float nota2 = Float.parseFloat(aluno[2]);
                float media = (nota1 + nota2) / 2;
                boolean aprovado = media >= 6;
                if (aprovado) {
                    System.out.println("Nome: " + nome + "\nNota 1: " + nota1 +
                            "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: Aprovado \n");
                } else {
                    System.out.println("Nome: " + nome + "\nNota 1: " + nota1 +
                            "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: Reprovado \n");
                }
                i++;
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.util.*;

public class exercicio2 {
    public static void aprova2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            boolean aprovado = false;
            System.out.print("Digite o seu nome: ");
            String nome = sc.next();

            System.out.print("Digite a sua primeira nota: ");
            int nota1 = sc.nextInt();

            System.out.print("Digite a sua segunda nota: ");
            int nota2 = sc.nextInt();

            int media = (nota1 + nota2) / 2;
            if (media >= 6) {
                aprovado = true;
            }

            if (aprovado) {
                System.out.println("Nome: " + nome + "\nNota 1: " + nota1 +
                        "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: Aprovado \n");
            } else {
                System.out.println("Nome: " + nome + "\nNota 1: " + nota1 +
                        "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: Reprovado \n");
            }

        }

        sc.close();
    }
}

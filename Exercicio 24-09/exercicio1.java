import java.util.Scanner;

public class exercicio1 {
    public static void aprova1() {
        Scanner sc = new Scanner(System.in);
        boolean aprovado = false;

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Digite a sua segunda nota: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media >= 6) {
            aprovado = true;
        }

        if (aprovado) {
            System.out.println("Nome: " + nome + "\nNota 1: " + nota1
                    + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: Aprovado");

            sc.close();
            return;
        }

        System.out.println("Nome: " + nome + "\nNota 1: " + nota1
                + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: Reprovado");
        sc.close();
    }
}

import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o segundo lado do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o terceiro lado do triângulo:");
        int lado3 = scanner.nextInt();

        if (valoresInvalidos(lado1, lado2, lado3)) {
            System.out.println("Valores inválidos");
        } else if (formaTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Valores inválidos");
        }
    }

    public static boolean valoresInvalidos(int lado1, int lado2, int lado3) {
        return (lado1 <= 0 || lado2 <= 0 || lado3 <= 0);
    }

    public static boolean formaTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2);
    }
}

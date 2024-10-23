public class App {

    static void arrayIndiceNaoExiste() {
        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Voce tentou acessar um indice que nao existe no array");
        }
    }

    static void divisaoPorZero() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Voce tentou dividir um numero por zero");
        }
    }

    static void nullPointer() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Voce tentou acessar um metodo de um objeto nulo");
        }
    }

    public static void main(String[] args) throws Exception {
        arrayIndiceNaoExiste();
        divisaoPorZero();
        nullPointer();
    }
}

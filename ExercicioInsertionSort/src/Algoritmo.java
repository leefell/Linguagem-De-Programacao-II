import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Algoritmo {
	
	static void InsertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int chave = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > chave) {
				array[j+ 1] = array[j];
				j = j - 1;
			}
			array[j+1] = chave;
		} 
	}
	
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] valoresRecebidos;
		
		System.out.print("Digite o tamanho do array: ");
		int tamanho = Integer.parseInt(scanner.next());
		valoresRecebidos = new int[tamanho];
		
		scanner.close();
		
		for(int j = 0; j < tamanho; j++) {
			valoresRecebidos[j] = random.nextInt(100);
		}
		
		InsertionSort(valoresRecebidos);
		printArray(valoresRecebidos);
		long end = System.currentTimeMillis();
		long elapsedTime = TimeUnit.MILLISECONDS.toSeconds(end - start);
		System.out.println("O algoritmo levou: " + elapsedTime + " para ser concluido.");
	}

}

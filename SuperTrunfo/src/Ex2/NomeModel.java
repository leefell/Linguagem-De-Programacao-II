package Ex2;

import java.util.*;

public class NomeModel {

	private static String CHARSET = "abcdefghijklmnopqrstuvwxyz";
	private Random random = new Random();
	
	public String geraNome(int tamanho) {
		StringBuilder nome = new StringBuilder();
		for(int i = 0; i < tamanho; i++) {
			int indice = random.nextInt(CHARSET.length());
			nome.append(CHARSET.charAt(indice));
		}
		return nome.toString();
	}
}

package Ex2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class SuperTrunfo {
	public static void main(String[] args) {
		try {
			File file = new File("caminho/para/o/novoBaralho.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			Random random = new Random();
			ArrayList<CardModel> cartas = new ArrayList<>();

			for (int i = 0; i < 15; i++) {
				NomeModel nm = new NomeModel();
				CardModel cardModel = new CardModel();

				cardModel.setNome(nm.geraNome(6));
				cardModel.setForca(random.nextInt(100));
				cardModel.setInteligencia(random.nextInt(100));
				cardModel.setAgilidade(random.nextInt(100));

				cartas.add(cardModel);
			}

			for (CardModel carta : cartas) {
				bw.write(carta.getNome() + "," + carta.getForca() + "," + carta.getInteligencia() + ","
						+ carta.getAgilidade());
				bw.newLine();

				System.out.println("Nome: " + carta.getNome());
				System.out.println("Força: " + carta.getForca());
				System.out.println("Inteligência: " + carta.getInteligencia());
				System.out.println("Agilidade: " + carta.getAgilidade());
			}

			bw.close(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

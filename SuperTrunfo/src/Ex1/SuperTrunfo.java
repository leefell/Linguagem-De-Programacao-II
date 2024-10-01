package Ex1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class SuperTrunfo {
    public static void main(String[] args) {
        try {
            File file = new File("caminhoparadados.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linha;
            ArrayList<CardModel> cartas = new ArrayList<>();
            int i = 0;

            while ((linha = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }

                String[] data = linha.split(",");

                CardModel CardModel = new CardModel();
                CardModel.setNome(data[0]);
                CardModel.setForca(Integer.parseInt(data[1]));
                CardModel.setInteligencia(Integer.parseInt(data[2]));
                CardModel.setAgilidade(Integer.parseInt(data[3]));

                cartas.add(CardModel);
            }

            br.close();

            for (CardModel carta : cartas) {
                System.out.println("Nome: " + carta.getNome());
                System.out.println("Força: " + carta.getForca());
                System.out.println("Inteligência: " + carta.getInteligencia());
                System.out.println("Agilidade: " + carta.getAgilidade());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
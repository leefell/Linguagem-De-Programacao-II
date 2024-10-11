package main;

import java.io.*;

public class CalculoMAIN {
	public static void main(String[] args) {

		String linha;
		int i = 0;
		CalculoDTO calculoDTO = new CalculoDTO();
		File dados = new File("C:\\Users\\leele\\eclipse-workspace\\AtividadeAvaliativaAlexandre\\operacoes.csv");
		File resultado = new File("C:\\Users\\leele\\eclipse-workspace\\AtividadeAvaliativaAlexandre\\resultado.csv");
		double resultadoOperacao;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(dados));
			BufferedWriter bw = new BufferedWriter(new FileWriter(resultado));
			
			bw.write("Resultado\n");
			
			while ((linha = br.readLine()) != null) {
				if (i == 0) {
					i++;
					continue;
				}

				String[] data = linha.split(",");

				calculoDTO.setOperacao(data[0].trim());
				calculoDTO.setValor1(Double.parseDouble(data[1].trim()));
				calculoDTO.setValor2(Double.parseDouble(data[2].trim()));

				switch (calculoDTO.getOperacao()) {
				case "+":
					resultadoOperacao = calculoDTO.getValor1() + calculoDTO.getValor2();
					break;
				case "-":
					resultadoOperacao = calculoDTO.getValor1() - calculoDTO.getValor2();
					break;
				case "*":
                    resultadoOperacao = calculoDTO.getValor1() * calculoDTO.getValor2();
                    break;
                case "/":
                    if (calculoDTO.getValor2() != 0) {
                        resultadoOperacao = calculoDTO.getValor1() / calculoDTO.getValor2();
                    } else {
                        bw.write(calculoDTO.getOperacao() + ",Erro: divisão por zero\n");
                        continue; 
                    }
                    break;
                 default:
                	 bw.write(calculoDTO.getOperacao() + ", Operação inválida\n");
                	 continue;
				}
				
				bw.write(calculoDTO.getOperacao() + "," + resultadoOperacao + "\n");
			}
			
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro de conversão numérica: " + e.getMessage());
		}
	}
}

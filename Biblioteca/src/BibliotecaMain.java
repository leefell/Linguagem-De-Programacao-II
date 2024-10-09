import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMain {

	public static void menu() {
		System.out.println("---- OPÇÕES ----");
		System.out.println("1) Alugar");
		System.out.println("2) Devolução");
		System.out.println("3) Listar os livros");
		System.out.println("4) Buscar Livros");
		System.out.println("5) Imprime lista de livros alugados");
		System.out.println("6) Imprime cliente");
		System.out.println("0) Sair");
		System.out.print("Qual ação deseja realizar: ");
	};

	public static void main(String[] args) {

		try {
			File arquivoListaItens = new File("C:\\Users\\leele\\eclipse-workspace\\Biblioteca\\listaItens.csv");
			File arquivoListaClientes = new File("C:\\Users\\leele\\eclipse-workspace\\Biblioteca\\listaClientes.csv");

			BufferedReader brListaItens = new BufferedReader(new FileReader(arquivoListaItens));
			BufferedReader brListaClientes = new BufferedReader(new FileReader(arquivoListaClientes));

			LivroDAO livroDAO = new LivroDAO();
			Scanner scanner = new Scanner(System.in);

			ArrayList<LivroDTO> livros = new ArrayList<>();
			ArrayList<ClienteDTO> clientes = new ArrayList<>();

			String linha;
			int escolha, i = 0, j = 0;

			// Populando Livro
			while ((linha = brListaItens.readLine()) != null) {
				if (i == 0) {
					i++;
					continue;
				}

				String[] dadosLivro = linha.split(",");

				LivroDTO livroDTO = new LivroDTO();
				livroDTO.setId(Integer.parseInt(dadosLivro[0]));
				livroDTO.setDisponibilidade(Integer.parseInt(dadosLivro[1]));
				livroDTO.setNome(dadosLivro[2]);
				livroDTO.setAutores(dadosLivro[3]);

				livros.add(livroDTO);
			}

			// Populando Cliente
			while ((linha = brListaClientes.readLine()) != null) {
				if (j == 0) {
					j++;
					continue;
				}

				String[] dadosCliente = linha.split(",");

				ClienteDTO clienteDTO = new ClienteDTO();
				clienteDTO.setId(Integer.parseInt(dadosCliente[0]));
				clienteDTO.setNome(dadosCliente[1]);

				clientes.add(clienteDTO);
			}

			do {
				menu();
				escolha = scanner.nextInt();

				switch (escolha) {
				case 1:
					System.out.println(livroDAO.alugar(livros));
					break;
				case 2:
					System.out.println(livroDAO.devolucao(livros));
					break;
				case 3:
					livroDAO.listarLivros(livros);
					break;
				case 4:
					livroDAO.buscarLivro(livros);
					break;
				case 5:
					System.out.println(livroDAO.listaLivrosAlugados(livros));
					break;
				case 6:
					livroDAO.listaCliente(clientes);
				case 0:
					break;
				default:
					System.out.print("Escolha uma opção válida: ");
				}
			} while (escolha != 0);

			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

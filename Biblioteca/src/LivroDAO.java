import java.util.ArrayList;
import java.util.Scanner;

public class LivroDAO {

	Scanner scanner = new Scanner(System.in);
	String nomeLivro, nomeCliente;
	ArrayList<LivroDTO> livroAlugado = new ArrayList<LivroDTO>();

	public String alugar(ArrayList<LivroDTO> livros) {
		System.out.print("Digite o ID do livro a ser Alugado: ");
		int idLivro = scanner.nextInt();
		for (LivroDTO livro : livros) {
			if (livro.getId() == idLivro) {
				livro.setDisponibilidade(livro.getDisponibilidade() - 1);
				nomeLivro = livro.getNome();

				livroAlugado.add(livro);
				return "O livro " + nomeLivro + " foi alugado com sucesso";
			}
		}

		return "Livro não encontrado";
	};

	public String devolucao(ArrayList<LivroDTO> livros) {
		System.out.print("Digite o ID do livro que será devolvido: ");
		int idLivro = scanner.nextInt();

		for (LivroDTO livro : livros) {
			if (livro.getId() == idLivro) {
				livro.setDisponibilidade(livro.getDisponibilidade() + 1);
				nomeLivro = livro.getNome();

				if (livroAlugado.contains(livro)) {
					livroAlugado.remove(livro);
					return "O livro " + nomeLivro + " foi devolvido com sucesso";
				}
				return "O livro não estava alugado.";
			}
		}
		return "O livro não foi encontrado";
	};

	public void listarLivros(ArrayList<LivroDTO> livros) {
		System.out.printf("%-5s %-15s %-30s %-40s%n", "ID", "Disponibilidade", "Nome", "Autores");

		for (LivroDTO livro : livros) {
			System.out.printf("%-5d %-15s %-30s %-40s%n", livro.getId(), livro.getDisponibilidade(), livro.getNome(),
					livro.getAutores());
		}
	}

	public void buscarLivro(ArrayList<LivroDTO> livros) {
		System.out.print("Digite o ID do livro a ser buscado: ");
		int idLivro = scanner.nextInt();

		for (LivroDTO livro : livros) {
			if (livro.getId() == idLivro) {
				System.out.printf("%-5d %-15s %-30s %-40s%n", livro.getId(), livro.getDisponibilidade(),
						livro.getNome(), livro.getAutores());
			}
		}
	};

	public String listaLivrosAlugados(ArrayList<LivroDTO> livros) {
		for (LivroDTO livro : livros) {

			if (livroAlugado.isEmpty()) {
				return "Nenhum livro foi alugado";
			}

			if (livroAlugado.contains(livro)) {
				return "O livro " + livro.getNome() + " está alugado";
			}

		}
		return "O livro escolhido não foi alugado";

	};

	public void listaCliente(ArrayList<ClienteDTO> clientes) {
		System.out.printf("%-5s %-30s%n", "ID", "Nome");

		for (ClienteDTO cliente : clientes) {
			System.out.printf("%-5d %-30s%n", cliente.getId(), cliente.getNome());
		}
	}

}

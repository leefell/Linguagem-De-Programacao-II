public class LivroDTO {
	private int id;
	private int disponibilidade;
	private String nome;
	private String autores;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
}

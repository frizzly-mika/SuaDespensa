package suaDespensa.model;

public class Produtos {

	private String nome;
	private int qtd;
	private int categoria;

	public Produtos(String nome, int qtd, int categoria) {
		this.nome = nome;
		this.qtd = qtd;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

}

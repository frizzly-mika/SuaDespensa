package suaDespensa.model;

public abstract class Produto {

	private int numero;
	private String nome;
	private int qtd;
	private int categoria;

	public Produto(int numero, String nome, int qtd, int categoria) {

		this.numero = numero;
		this.nome = nome;
		this.qtd = qtd;
		this.categoria = categoria;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public void visualizar() {

		String categoria = "";

		switch (this.categoria) {
		case 1:
			categoria = "Não Perecível";
			break;
		case 2:
			categoria = "Bebida";
			break;
		}

		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                    Ítens na Sua Despensa                     ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("Nº do ítem: " + this.numero);
		System.out.println("Nome: " + this.nome);
		System.out.println("Qtd: " + this.qtd);
		System.out.println("Categoria: " + categoria);
		System.out.println("                                                     ");
		// verificar imprimir tipo

	}

	// verificar imprimir tipo
}

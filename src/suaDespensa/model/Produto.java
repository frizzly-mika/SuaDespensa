package suaDespensa.model;

public class Produto {

	private String nome;
	private int qtd;
	private int categoria;

	public Produto(String nome, int qtd, int categoria) {
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
	
	
	public void mostrar() {
		
		String categoria = "";
		
		switch(this.categoria) {
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
		System.out.println("Nome: " + this.nome);
		System.out.println("Qtd: " + this.qtd);
		System.out.println("Categoria: " + categoria);
		System.out.println("                                                     ");
		
	}
	
	

}

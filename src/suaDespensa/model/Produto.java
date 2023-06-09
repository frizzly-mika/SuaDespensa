package suaDespensa.model;

abstract class Produto {

	private String nome;
	private int qtd;
	private String dataFabricacao;
	private String dataVencimento;
	// private int categoria;

//	public Produto(String nome, int qtd) {
//		this.nome = nome;
//		this.qtd = qtd;
//		// this.categoria = categoria;
//	}

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

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

//	public int getCategoria() {
//		return categoria;
//	}
//
//	public void setCategoria(int categoria) {
//		this.categoria = categoria;
//	}

}

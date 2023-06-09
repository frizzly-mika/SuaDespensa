package suaDespensa.model;

abstract class Produto {

	private String nome;
	private int qtd;
	private String dataFabricacao;
	private String dataVencimento;
	private String marca;

	public Produto(String nome, int qtd, String dataFabricacao, String dataVencimento, String marca) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.dataFabricacao = dataFabricacao;
		this.dataVencimento = dataVencimento;
		this.marca = marca;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}

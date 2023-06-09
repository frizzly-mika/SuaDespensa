package suaDespensa.model;

public class Alimento extends Produto {

	private String tipo;
	private String sabor;

	public Alimento(String nome, int qtd, String dataFabricacao, String dataVencimento, String marca, String tipo,
			String sabor) {
		super(nome, qtd, dataFabricacao, dataVencimento, marca);
		this.tipo = tipo;
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}

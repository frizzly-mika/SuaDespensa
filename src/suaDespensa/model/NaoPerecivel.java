package suaDespensa.model;

public class NaoPerecivel extends Produto {
	
	private boolean grao;
	
	public NaoPerecivel(String nome, int qtd, int categoria) {
		super(nome, qtd, categoria);
		this.grao = grao;
	}

	public boolean isGrao() {
		return grao;
	}

	public void setGrao(boolean grao) {
		this.grao = grao;
	}

}

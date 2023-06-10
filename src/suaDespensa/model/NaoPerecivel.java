package suaDespensa.model;

public class NaoPerecivel extends Produto {
	
	private boolean processado;
	
	public NaoPerecivel(int numero, String nome, int qtd, int categoria, int tipo) {
		super(numero, nome, qtd, categoria);
	//	this.processado = processado;
	}

	public boolean isProcessado() {
		return processado;
	}

	public void setProcessado(boolean processado) {
		this.processado = processado;
	}

}

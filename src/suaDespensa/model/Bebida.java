package suaDespensa.model;

public class Bebida extends Produto {

	private int tipo;
	private boolean alcoolico;

	public Bebida(String nome, int qtd, int categoria, int tipo) {
		super(nome, qtd, categoria);
		this.tipo = tipo;
		this.alcoolico = alcoolico;
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean isAlcoolico() {
		return alcoolico;
	}

	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}
	
	

}

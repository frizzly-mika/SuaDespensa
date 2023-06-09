package suaDespensa.model;

public class Bebida extends Produto {

	private String sabor;
	private boolean alcoolico;

	

	public Bebida(String sabor, boolean alcoolico) {
		super();
		this.sabor = sabor;
		this.alcoolico = alcoolico;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isAlcoolico() {
		return alcoolico;
	}

	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

}

package suaDespensa.model;

public class Bebida extends Produto {

	private int tipo;

	public Bebida(int numero, String nome, int qtd, int categoria, int tipo) {
		super(numero, nome, qtd, categoria);
		this.tipo = tipo;

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// verificar imprimir tipo
}

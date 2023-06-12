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

	@Override
	public void visualizar() {
		super.visualizar();
		{
			String tipo = "";

			switch (this.tipo) {
			case 1:
				tipo = "Não Alcoólica";
				break;
			case 2:
				tipo = "Alcoólica";
				break;
			}

			System.out.println("Tipo: " + tipo);
			System.out.println("                                                     ");
		}
	}
}

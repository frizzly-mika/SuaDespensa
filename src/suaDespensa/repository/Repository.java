package suaDespensa.repository;

import suaDespensa.model.Produto;

public interface Repository {

	public void buscarPeloNumero(int numero);

	public void listarItens();

	public void criarItem(Produto produto);

	public void atualizarItem(Produto produto);

	public void deletar(int numero);

}

package suaDespensa.repository;

import suaDespensa.model.Produto;

public interface Repository {
	
	public void procurarPorNome(String nome);
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(String nome);
	

}

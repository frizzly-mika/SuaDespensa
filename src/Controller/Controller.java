package Controller;

import java.util.ArrayList;

import suaDespensa.model.Produto;
import suaDespensa.repository.Repository;

public class Controller implements Repository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.mostrar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getNome() + " foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(String nome) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

}

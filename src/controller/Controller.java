package controller;

import java.util.ArrayList;

import suaDespensa.model.Produto;
import suaDespensa.repository.Repository;

public class Controller implements Repository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void buscarPeloNumero(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO item nº: " + numero + " não foi encontrado.\n");
	}

	@Override
	public void listarItens() {
		for (var produto : listaProdutos) {
			produto.visualizar();

		}

	}

	@Override
	public void criarItem(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO item nº: " + produto.getNumero() + " foi cadastrado com suceesso!\n");
	}

	@Override
	public void atualizarItem(Produto produto) {
		var buscaItem = buscarNaCollection(produto.getNumero());

		if (buscaItem != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaItem), produto);
			System.out.println("\nO item nº: " + produto.getNumero() + " foi atualizado com sucesso!\n");
		} else
			System.out.println("\nO item nº: " + produto.getNumero() + " não foi encontrado.\n");

	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO item nº: " + numero + " foi apagado com sucesso!\n");
		} else
			System.out.println("\nO item nº " + numero + " não foi encontrado.\n");

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}

		return null;
	}
	
	public Produto buscarNaCollectionNome(String nome) {
		for (var produto : listaProdutos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				return produto;
			}
		}
		return null;
	}
	
	public void retornaCategoria(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return;
			}
		}

	}
}

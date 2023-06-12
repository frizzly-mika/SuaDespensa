package suaDespensa;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import suaDespensa.model.Bebida;
import suaDespensa.model.NaoPerecivel;

public class Menu {
	public static void main(String[] args) {

		Controller produtos = new Controller();

		Bebida b1 = new Bebida(produtos.gerarNumero(), "Água", 2, 2, 1);
		b1.visualizar();

		NaoPerecivel np1 = new NaoPerecivel(produtos.gerarNumero(), "Arroz", 5, 1);
		np1.visualizar();

		NaoPerecivel np2 = new NaoPerecivel(produtos.gerarNumero(), "Geleia", 3, 1);
		np2.visualizar();

		produtos.listarItens();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, qtd, categoria, tipo,aux;
		String nome;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    SUA DESPENSA                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("    Bem vinde a Sua Despensa! O que deseja fazer?    ");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar item                       ");
			System.out.println("            2 - Listar itens                         ");
			System.out.println("            3 - Buscar item pelo nº                  ");
			System.out.println("            4 - Atualizar item                       ");
			System.out.println("            5 - Apagar item                          ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(" \nCaracter inválido!!| Digite um número correspondente à operação: \n");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nÉ um prazer fazer a Sua Dispensa melhor!");
				System.out.println("Até logo!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("|Cadastrar item na Sua Despensa| Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				if(produtos.buscarNaCollectionNome(nome)==null) {
					System.out.println("Produto não encontrado, deseja adicionar na sua Despensa (1-Sim 2-Não)?");
					aux=leia.nextInt();
					if(aux==1) {
						System.out.println("Digite a quantidade: ");
						qtd = leia.nextInt();

						do {
							System.out.println("Digite a categoria do produto (1 - Não Perecível ou 2 - Bebida): ");
							categoria = leia.nextInt();
						} while (categoria < 1 && categoria > 2);

						if (categoria == 2) {
							System.out.println("Digite o tipo do produto (1 - Não Alcoólico ou 2 - Alcoólico): ");
							tipo = leia.nextInt();
							produtos.criarItem(new Bebida(produtos.gerarNumero(), nome, qtd, categoria, tipo));

						} else if (categoria == 1) {
							produtos.criarItem(new NaoPerecivel(produtos.gerarNumero(), nome, qtd, categoria));
						}
					}
					
				}else {
					System.out.println("Você já tem "+nome+" na sua Despensa.Para atualizar é a opção 4.");
					
				}
			
				break;
			case 2:
				System.out.println("|Listar itens na Sua Despensa|\n");
				produtos.listarItens();

				break;
			case 3:
				System.out.println("|Buscar item pelo nº| Digite o nº do item desejado: ");
				
				numero = leia.nextInt();

				produtos.buscarPeloNumero(numero);

				break;
			case 4:
				System.out.println("|Atualizar item| Digite o nº do item a ser atualizado: ");
				numero = leia.nextInt();

				if (produtos.buscarNaCollection(numero) != null) {

					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite a quantidade: ");
					qtd = leia.nextInt();

					do {
						System.out.println("Digite a categoria do produto (1 - Não Perecível ou 2 - Bebida): ");
						categoria = leia.nextInt();
					} while (categoria < 1 && categoria > 2);

					if (categoria == 2) {
						System.out.println("Digite o tipo do produto (1 - Não Alcoólico ou 2 - Alcoólico): ");
						
						tipo = leia.nextInt();
						
						produtos.atualizarItem(new Bebida(numero,nome, qtd, categoria, tipo));

					} else if (categoria == 1) {
						produtos.atualizarItem(new NaoPerecivel(numero, nome, qtd, categoria));
						
					}

				} else
					System.out.println("Ítem não encontrado.");

				break;
			case 5:
				System.out.println("|Apagar ítem| Digite o nº do item a ser apagado: ");
				numero = leia.nextInt();

				produtos.deletar(numero);

				break;
			}
		}
	}
}

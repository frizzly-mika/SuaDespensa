package suaDespensa;

import java.util.Scanner;

import Controller.Controller;
import suaDespensa.model.Bebida;
import suaDespensa.model.NaoPerecivel;
import suaDespensa.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Controller produtos = new Controller();

		/*
		 * Bebida b1 = new Bebida(produtos.gerarNumero(), "Água", 2, 2, 1);
		 * b1.visualizar();
		 * 
		 * NaoPerecivel np1 = new NaoPerecivel(produtos.gerarNumero(), "Arroz", 5, 1);
		 * np1.visualizar();
		 * 
		 * NaoPerecivel np2 = new NaoPerecivel(produtos.gerarNumero(), "Geleia", 3, 1);
		 * np2.visualizar();
		 * 
		 * produtos.listarItens();
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("    Bem vinde a Sua Despensa! O que deseja fazer?     ");

		int opcao, numero, qtd, categoria, tipo;
		String nome;

		while (true) {

			System.out.println(Cores.TEXT_BLUE_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    Sua Despensa                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar ítem                           ");
			System.out.println("            2 - Listar ítens                         ");
			System.out.println("            3 - Buscar ítem pelo nº                  ");
			System.out.println("            4 - Atualizar ítem                       ");
			System.out.println("            5 - Apagar ítem                          ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nÉ um prazer fazer a Sua Dispensa melhor!");
				System.out.println("Até logo! ;)");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar ítem na Sua Despensa\n\n");
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
					produtos.criarItem(new Bebida(produtos.gerarNumero(), nome, qtd, categoria, tipo));

				} else if (categoria == 1) {
					produtos.criarItem(new NaoPerecivel(produtos.gerarNumero(), nome, qtd, categoria));
				}

				break;
			case 2:
				System.out.println("Listar ítens na Sua Despensa\n\n");
				produtos.listarItens();

				break;
			case 3:
				System.out.println("Buscar ítem pelo nº\n\n");

				System.out.println("Digite o nº do ítem desejado: ");
				numero = leia.nextInt();

				produtos.buscarPeloNumero(numero);

				break;
			case 4:
				System.out.println("Atualizar ítem\n\n");

				System.out.println("Digite o nº do ítem a ser atualizado: ");
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
						produtos.criarItem(new Bebida(produtos.gerarNumero(), nome, qtd, categoria, tipo));

					} else if (categoria == 1) {
						produtos.criarItem(new NaoPerecivel(produtos.gerarNumero(), nome, qtd, categoria));
					}

				} else
					System.out.println("Ítem não encontrado.");

				break;
			case 5:
				System.out.println("Apagar ítem\n\n");

				System.out.println("Digite o nº do ítem a ser apagado: ");
				numero = leia.nextInt();

				produtos.deletar(numero);

				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}

package suaDespensa;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Bem vinde a sua dispensa! O que deseja fazer? ");

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  MINHA DISPENSA                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Mostrar ítens na Dispensa            ");
			System.out.println("            2 - Cadastrar ítens                      ");
			System.out.println("            3 - Retirar ítens                        ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 4) {
				System.out.println("\nMinha Dispensa - Volte quando quiser!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Mostrar ítens na Dispensa\n\n");

				break;
			case 2:
				System.out.println("Cadastrar ítens\n\n");

				break;
			case 3:
				System.out.println("Retirar ítens\n\n");

				break;
			case 4:
				System.out.println("Sair\n\n");

				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}

package suaDespensa;

import java.util.Scanner;

import suaDespensa.model.Bebida;
import suaDespensa.model.NaoPerecivel;


public class Menu {
	public static void main(String[] args) {
		
		Bebida b1 = new Bebida("Whiskey", 1, 2);
		b1.mostrar();
		
		NaoPerecivel np1 = new NaoPerecivel("Arroz", 2, 1);
		np1.mostrar();

		Scanner leia = new Scanner(System.in);

		System.out.println("    Bem vinde a Sua Despensa! O que deseja fazer?     ");

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    Sua Despensa                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Mostrar ítens na Despensa            ");
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
				System.out.println("Mostrar ítens na Despensa\n\n");

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

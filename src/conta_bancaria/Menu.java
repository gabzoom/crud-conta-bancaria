package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		// Cria Objetos da Classe Conta para testes
		Conta c1 = new Conta(1, 123, 2, "Victoria Moraes", 100000.0f);

		// Chama e aciona o método auxiliar visualizar() para testes
		c1.visualizar();
		System.out.println("Exibir o Saldo: " + c1.getSaldo());
		c1.setSaldo(200000.00f);
		c1.visualizar();
		c1.sacar(1000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		// Cria Objetos da Classe Conta Corrente para testes
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Felipe", 100000.00f, 2000.00f);
		cc1.visualizar();
		cc1.sacar(101000.00f);
		cc1.visualizar();

		// Cria Objetos da Classe Conta Poupança para testes
		ContaPoupanca cc2 = new ContaPoupanca(13, 1313, 2, "Taylor Swift", 1300.13f, 13);
		cc2.visualizar();

		while (true) {
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND);

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println("Saque\n\n");

				break;
			case 7:
				System.out.println("Depósito\n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Gabriel Rodrigues");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/gabzoom");
		System.out.println("*********************************************************");
	}

}

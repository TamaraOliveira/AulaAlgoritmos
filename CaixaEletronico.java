package caixa_eletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while (true) {
			System.out.println("\nSeja bem vindo!");

			String cpf = "123.456.789-00";
			String senha = "01020304";
			double saldoInicial = 1000;
			double saldoAtual = saldoInicial;
			double deposito = 0;
			double saque = 0;

			System.out.print("Digite seu cpf: ");
			String numCpf = entrada.next();
			System.out.print("Digite sua senha: ");
			String numSenha = entrada.next();

			if (!numCpf.equals(cpf) || !numSenha.equals(senha)) {
				System.out.println("Escolha Inválida!");
				continue;
			}

			String escolha = new String();
			do {
				System.out.println("\nO que deseja fazer?\n 1 - Saldo\n 2 - Depósito\n 3 - Saque\n 0 - Sair");
				escolha = entrada.next();
				switch (escolha) {
				case "1":
					System.out.println(saldoAtual);
					break;
				case "2":
					System.out.println("Digite o valor a ser depositado: ");
					deposito = entrada.nextDouble();
					saldoAtual += deposito;
					break;
				case "3":
					System.out.println("Digite o valor a ser sacado: ");
					saque = entrada.nextDouble();
					saldoAtual -= saque;
					break;
				case "0":
					break;
				default:
					System.out.println("Escolha Inválida!");
					break;
				}
			} while (!escolha.equals("0"));
		}
	}
}
